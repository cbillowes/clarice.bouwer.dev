(ns clarice.panels.career.dstv
  (:require
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div.spec.dstv
   [:span.icon
    [:i.fas.fa-satellite]]
   [:h2 "DStv Digital Media (MultiChoice)"]
   [:div.details
    [:h3.type "Senior Software Developer"]
    [:span.duration "Jun 2016 - Jun 2018 (2 years)"]
    [:div.description
     [:p
      (anchor "MultiChoice" "https://www.multichoice.co.za/")
      " is a leading video entertainment company. DStv Digital Media developed online solutions for the DStv brand."]
     [:p "After joining permanently, I joined the DStv Now team working on"
      (highlighted-tag "VOD") "(Video On-Demand) and"
      (highlighted-tag "Live Streaming")]]]])
