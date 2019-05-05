(ns clarice.panels.career.britehouse
  (:require
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div.spec.britehouse
   [:span.icon
    [:i.fas.fa-file-signature]]
   [:h2 "Britehouse"]
   [:div.details
    [:h3.type "Senior Software Developer"]
    [:span.duration "Apr 2014 - May 2016 (2 years and 2 months)"]
    [:div.description
     [:p "3Fifteen, a sought after custom software development house specializing
      in Microsoft-enabled and Mobile Technologies, was later acquired by "
      (anchor "Britehouse" "https://www.britehouse.co.za") " (Dimension Data)."]
     [:p "I was contracted to DStv Digital media. I joined an"
      (highlighted-tag "Agile")
      (highlighted-tag "SCRUM")
      "team focusing on developing reality-television and music awards voting platforms. We rolled out solutions
      for productions like Channel-O Music Awards, South African Idols, Big Brother Mzansi, Big Brother Angola and Survivor."]
     [:p "We incorporated technologies such as "
      (highlighted-tag "Jenkins") " "
      (highlighted-tag "Git") " "
      (highlighted-tag "C#") " "
      (highlighted-tag "MVC") " "
      (highlighted-tag "WebAPI") " "
      (highlighted-tag "Solr")]]]])
