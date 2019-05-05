(ns clarice.ui.career-panel
  (:require
    [re-frame.core :as re-frame]
    [clarice.subs :as subs]
    [clarice.events :as events]))

(defn panel
  [{:keys [panel icon company position duration blurb description]}]
  (let [expand-career-panel (re-frame/subscribe [::subs/expand-career-panel])
        expand-panel? (if (or (= panel @expand-career-panel) (= :all @expand-career-panel)) true false)]
    [:div.spec {:class panel}
     [:span.icon [:i {:class icon}]]
     [:h2 {:on-click
           #(re-frame/dispatch
              [::events/expand-career-panel
               (if (or (= :all @expand-career-panel) (= panel @expand-career-panel)) :nothing panel)])}
      company]
     [:div.details
      [:h3.type position]
      [:span.duration duration]
      [:div.blurb blurb]
      [:div.description {:class (when (true? expand-panel?) "show")}
       description]]]))
