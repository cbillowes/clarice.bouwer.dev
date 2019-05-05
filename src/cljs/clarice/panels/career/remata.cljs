(ns clarice.panels.career.remata
  (:require
    [clarice.ui.career-panel :as p]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  (p/panel
    {:panel       :remata
     :icon        "fas fa-print"
     :company     "Remata Cross Media Solutions"
     :position    "Senior Developer"
     :duration    "Jul 2012 - Mar 2014 (1 year and 9 months)"
     :blurb        [:p
                    (anchor "Remata" "https://www.remata.co.za/")
                    " offers printing solutions. The Cross Media Solutions department offers Variable Data Printing."]
     :description [:div
                   [:p "I was responsible for developing, enhancing, maintaining and automating Cross Media Solutions.
                    There was also need to integrate with"
                    (highlighted-tag "XMPie")
                    "to accomplish our "
                    (highlighted-tag "VDP") "(Variable Data Printing)."]
                   [:p "I chose to develop in "
                    (highlighted-tag "C#") "using LINQ and the Entity Framework, "
                    (highlighted-tag "ASP.NET") "and"
                    (highlighted-tag "SQL")]]}))