(ns clarice.panels.career.globres
  (:require
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div.spec.globres
   [:span.icon [:i.fas.fa-hotel]]
   [:h2 "GlobRes"]
   [:div.details
    [:h3.type "Junior Web Developer"]
    [:span.duration "Jan 2006 - Sept 2006 (8 months)"]
    [:div.description
     [:p
      (anchor "GlobRes" "https://www.globres.com/")
      " is Swiss innovated hospitality management solution that enables hotels
     to manage their data, reports and optimize sales and revenue."]
     [:p "I was responsible for developing, enhancing and supporting the internal South African hotel reservation
     management system."]
     [:p "I was exposed to "
      (highlighted-tag "ASP.NET")
      "and"
      (highlighted-tag "SQL")]]]])
