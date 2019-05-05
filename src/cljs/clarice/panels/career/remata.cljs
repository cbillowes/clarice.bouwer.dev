(ns clarice.panels.career.remata
  (:require
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div.spec.remata
   [:span.icon
    [:i.fas.fa-print]]
   [:h2 "Remata Cross Media Solutions"]
   [:div.details
    [:h3.type "Senior Developer"]
    [:span.duration "Jul 2012 - Mar 2014 (1 year and 9 months)"]
    [:div.description
     [:p
      (anchor "Remata" "https://www.remata.co.za/")
      " offers printing solutions. The Cross Media Solutions department offers Variable Data Printing."]
     [:p "I was responsible for developing, enhancing, maintaining and automating Cross Media Solutions. There was
     also need to integrate with"
      (highlighted-tag "XMPie") "to accomplish our " (highlighted-tag "VDP") "(Variable Data Printing)."]
     [:p "I chose to develop in "
      (highlighted-tag "C#") "using LINQ and the Entity Framework, "
      (highlighted-tag "ASP.NET") "and"
      (highlighted-tag "SQL")]]]])
