(ns clarice.panels.career
  (:require
    [clarice.ui.expander :as expander]
    [clarice.panels.career.cloudafrica :as cloudafrica]
    [clarice.panels.career.dstv :as dstv]
    [clarice.panels.career.britehouse :as britehouse]
    [clarice.panels.career.remata :as remata]
    [clarice.panels.career.it-em :as it-em]
    [clarice.panels.career.globres :as globres]
    [clarice.panels.career.cti :as cti]))


(defn panel []
  [:div#career.panel
   [:h1 "Career"]
   (expander/component)
   (cloudafrica/panel)
   (dstv/panel)
   (britehouse/panel)
   (remata/panel)
   (it-em/panel)
   (globres/panel)
   (cti/panel)])
