(ns clarice.panels.career.cti
  (:require
    [clarice.ui.career-panel :as p]
    [clarice.helpers :refer [anchor]]))

(defn panel []
  (p/panel
    {:panel       :cti
     :icon        "fas fa-user-graduate"
     :company     "Computer Training Institute"
     :position    "Junior Instructor"
     :duration    "Jan 2005 - Dec 2005 (1 year)"
     :blurb       [:p "Also referred to as "
                   (anchor "CTI" "https://www.cti.ac.za/")
                   ", is a private higher education institution."]
     :description [:div
                   [:p "I was responsible for one-on-one tutoring, the creation and development of pre-test materials,
                   hosting workshops and marking projects and practical exams."]
                   [:p "I got promoted from an Assistant Instructor to Junior Instructor in October."]]}))