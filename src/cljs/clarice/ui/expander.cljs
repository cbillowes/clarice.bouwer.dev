(ns clarice.ui.expander
  (:require
    [re-frame.core :as re-frame]
    [clarice.subs :as subs]
    [clarice.events :as events]))

(defn component []
  (let [expanded (re-frame/subscribe [::subs/expanded])]
    [:div.expander
     {:on-click
      #(re-frame/dispatch [::events/expand
                           (if (= :all @expanded) :nothing :all)])}
     [:i
      {:class (if (= :all @expanded) "fas fa-minus" "fas fa-plus")}]
     [:span.label (if (= :all @expanded) "Collapse" "Expand")]]))
