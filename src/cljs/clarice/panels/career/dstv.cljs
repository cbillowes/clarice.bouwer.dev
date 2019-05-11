(ns clarice.panels.career.dstv
  (:require
    [clarice.ui.spec :as p]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  (p/spec
    {:spec        :dstv
     :icon        "fas fa-satellite"
     :title       "DStv Digital Media (MultiChoice)"
     :sub-title   "Senior Software Developer"
     :duration    "Jun 2016 - Jun 2018 (2 years)"
     :blurb       [:p
                   (anchor "MultiChoice" "https://www.multichoice.co.za/")
                   " is a leading video entertainment company. DStv Digital Media developed online solutions for the DStv brand."]
     :description [:div
                   [:p]
                   [:p "After joining permanently, I joined the DStv Now team working on the "
                    (highlighted-tag "VOD") "(Video On-Demand) and"
                    (highlighted-tag "Live Streaming")
                    "solution for DStv subscribers."]]}))