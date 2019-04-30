(ns clarice.ui.navigation
  (:require
    [re-frame.core :as re-frame]
    [clarice.subs :as subs]
    [clarice.events :as events]))

(defn- brand []
  (let [brand (re-frame/subscribe [::subs/brand])]
    [:a.navbar-brand.brand
     {:href "#/"}
     "{ "
     [:span.first-part (first @brand)]
     " "
     [:span.second-part (second @brand)]
     " }"]))

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
  [:button.print-button
   [:a {:on-click #(re-frame/dispatch [::events/print-page])}
    [:i.fas.fa-print]]])

(defn- >classes [active-panel item]
  (let [selected? (= active-panel (:panel item))]
    (str (:class item) (when (= true selected?) " active"))))

(defn- dropdown-item [active-item item]
  [:a.dropdown-item {:key   (:react item)
                     :class (>classes active-item item)
                     :href  (:href item)
                     :title (:title item)}
   [:span (:title item)]])

(defn- dropdown [active-item items]
  (map #(dropdown-item active-item %) items))

(defn- menu-item [active-panel item]
  (if (> (count (:items item)) 0)
    [:li.nav-item.dropdown {:key   (:react item)
                            :class (:class item)}
     [:a.nav-link.dropdown-toggle {:id            (:react item)
                                   :href          "#"
                                   :role          "button"
                                   :data-toggle   "dropdown"
                                   :aria-haspopup true
                                   :aria-expanded false}
      [:span (:title item)]]
     [:div.dropdown-menu {:aria-labelledby (:react item)}
      (dropdown active-panel (:items item))]]

    [:li.nav-item {:key   (:react item)
                   :class (>classes active-panel item)
                   :title (:description item)}
     (if (= "print" (:class item))
       [:a.nav-link {:on-click #(re-frame/dispatch [::events/print-page])}
        [:span (:title item)]]
       [:a.nav-link {:href (:href item)}
        [:span (:title item)]])]))

(defn- toggle-menu [active-panel]
  [:div#bar.collapse.navbar-collapse
   [:ul.navbar-nav.mr-auto
    (let [navigation (re-frame/subscribe [::subs/navigation])]
      (map
        (fn [item]
          (menu-item
            active-panel
            item))
        @navigation))]])

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
    (brand)
    (print-button)
    (toggler)
    (toggle-menu active-panel)]
   [:nav.quick-nav
    (menu active-panel)]])

