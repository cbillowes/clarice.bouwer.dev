(ns clarice.ui.navigation
  (:require
    [re-frame.core :as re-frame]
    [clarice.subs :as subs]
    [clarice.events :as events]))

(defn- brand []
  (let [brand (re-frame/subscribe [::subs/brand])]
    [:div.container
     [:a.navbar-brand.brand
      {:href "#/"}
      "{ "
      [:span.first-part (first @brand)]
      " "
      [:span.second-part (second @brand)]
      " }"]]))

(defn- toggler []
  [:button.navbar-toggler
   {:type          "button"
    :data-toggle   "collapse"
    :data-target   "#bar"
    :aria-controls "bar"
    :aria-expanded false
    :aria-label    "Toggle navigation"}
   [:span.fas.fa-ellipsis-v]])

(defn- print-button []
  [:button.navbar-print
   [:a {:on-click #(re-frame/dispatch [::events/print-page])}
    [:i.fas.fa-print]]])

(defn- show-dropdown [active-panel]
  (let [item (re-frame/subscribe [::subs/active-menu-item])]
    (when
      (and
        (not (= active-panel (:parent @item)))
        (= active-panel (:child @item)))
      "active show")))

(defn- >classes [active-panel item]
  (let [selected? (= active-panel (:panel item))]
    (str (:class item) (when (= true selected?) " active"))))

(defn- dropdown-item [active-item item]
  [:a.dropdown-item {:key   (:react item)
                     :class (str "collapse-item " (>classes active-item item))
                     :href  (:href item)
                     :title (:title item)}
   [:span (:title item)
    [:i.fas.fa-angle-left]]])

(defn- dropdown [active-item items]
  (map #(dropdown-item active-item %) items))

(defn- menu-item [active-panel item]
  (if (> (count (:items item)) 0)
    [:li.nav-item.dropdown {:key   (:react item)
                            :class (str (show-dropdown active-panel) " " (:class item))}
     [:a.nav-link.dropdown-toggle {:id            (:react item)
                                   :href          "#"
                                   :role          "button"
                                   :data-toggle   "dropdown"
                                   :aria-haspopup true
                                   :aria-expanded false}
      [:span (:title item)
       [:i.fas.fa-angle-down]]]
     [:div.dropdown-menu {:aria-labelledby (:react item)
                          :class (show-dropdown active-panel)}
      (dropdown active-panel (:items item))]]

    [:li.nav-item {:key   (:react item)
                   :class (str "collapse-item " (>classes active-panel item))
                   :title (:description item)}
     (if (= "print" (:class item))
       [:a.nav-link {:on-click #(re-frame/dispatch [::events/print-page])}
        [:span (:title item)]]
       [:a.nav-link {:href (:href item)}
        [:span (:title item)
         [:i.fas.fa-angle-left]]])]))

(defn- toggle-menu [active-panel]
  [:div#bar.collapse.navbar-collapse
   [:ul.navbar-nav.mr-auto
    (doall
      (let [navigation (re-frame/subscribe [::subs/navigation])]
        (let [menu (map
                     (fn [item]
                       (menu-item
                         active-panel
                         item))
                     @navigation)]
             [:span menu])))]])

(defn- menu [active-panel]
  (let [navigation (re-frame/subscribe [::subs/navigation])]
    [:ul
     (map
       (fn [item]
         (if (= 0 (count (:items item)))
           [:li {:key   (:react item)
                 :class (>classes active-panel item)}
            (if (= "print" (:class item))
              [:a {:on-click #(re-frame/dispatch [::events/print-page])}
               [:i {:title (:description item)
                    :class (:icon item)}]]

              [:a {:href (:href item)}
               [:i {:title (:description item)
                    :class (:icon item)}]])]))
       @navigation)]))

(defn navigation [active-panel]
  [:div#navigation
   [:nav.sticky-top.navbar
    (toggler)
    (print-button)
    (brand)
    (toggle-menu active-panel)]
   [:nav.quick-nav.container
    (menu active-panel)]])

