(ns clarice.panels.resume
  (:require
    [clarice.panels.about :as about]
    [clarice.panels.career :as career]
    [clarice.helpers :refer [anchor]]))

(defn panel []
  [:div#resume.panel
   [:h1 "Clarice Bouwer"]
   (about/micro-panel)
   (career/panel)])



