(ns clarice.panels.career
  (:require
    [re-frame.core :as re-frame]
    [clarice.events :as events]
    [clarice.subs :as subs]
    [clarice.panels.career.cloudafrica :as cloudafrica]
    [clarice.panels.career.dstv :as dstv]
    [clarice.panels.career.britehouse :as britehouse]
    [clarice.panels.career.remata :as remata]
    [clarice.panels.career.it-em :as it-em]
    [clarice.panels.career.globres :as globres]
    [clarice.panels.career.cti :as cti]))


(defn panel []
  (let [expand-career-panel (re-frame/subscribe [::subs/expand-career-panel])]
    [:div#career.panel
     [:h1 "Career"]
     [:div.expander
      {:on-click
       #(re-frame/dispatch [::events/expand-career-panel
                            (if (= :all @expand-career-panel) :nothing :all)])}
      [:i
       {:class (if (= :all @expand-career-panel) "fas fa-minus" "fas fa-plus")}]
      [:span.label (if (= :all @expand-career-panel) "Collapse" "Expand")]]
     (cloudafrica/panel)
     (dstv/panel)
     (britehouse/panel)
     (remata/panel)
     (it-em/panel)
     (globres/panel)
     (cti/panel)]))
