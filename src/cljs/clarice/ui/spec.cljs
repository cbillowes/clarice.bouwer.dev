(ns clarice.ui.spec
  (:require
    [re-frame.core :as re-frame]
    [clarice.subs :as subs]
    [clarice.events :as events]))

(defn spec
  [{:keys [spec icon title sub-title duration blurb description]}]
  (let [expand-career-panel (re-frame/subscribe [::subs/expanded])
        expand-panel? (if (or (= spec @expand-career-panel) (= :all @expand-career-panel)) true false)]
    [:div.spec {:class spec}
     [:span.icon [:i {:class icon}]]
     [:h2 {:on-click
           #(re-frame/dispatch
              [::events/expand
               (if (or (= :all @expand-career-panel) (= spec @expand-career-panel)) :nothing spec)])}
      title]
     [:div.details
      [:h3.type sub-title]
      [:span.duration duration]
      [:div.blurb blurb]
      [:div.description {:class (when (true? expand-panel?) "show")}
       description]]]))
