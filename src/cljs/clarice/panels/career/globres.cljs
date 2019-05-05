(ns clarice.panels.career.globres
  (:require
    [clarice.ui.career-panel :as p]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  (p/panel
    {:panel       :globres
     :icon        "fas fa-hotel"
     :company     "Globres"
     :position    "Junior Web Developer"
     :duration    "Jan 2006 - Sept 2006 (8 months)"
     :blurb       [:p
                   (anchor "GlobRes" "https://www.globres.com/")
                   " is Swiss innovated hospitality management solution that enables hotels
                   to manage their data, reports and optimize sales and revenue."]
     :description [:div
                   [:p "I was responsible for developing, enhancing and supporting the internal South African
                   hotel reservation management system."]
                   [:p "I was exposed to "
                    (highlighted-tag "ASP.NET")
                    "and"
                    (highlighted-tag "SQL")]]}))
