(ns clarice.panels.career.cti
  (:require
    [clarice.helpers :refer [anchor]]))

(defn panel []
  [:div.spec.cti
   [:span.icon
    [:i.fas.fa-user-graduate]]
   [:h2 "Computer Training Institute"]
   [:div.details
    [:h3.type "Junior Instructor"]
    [:span.duration "Jan 2005 - Dec 2005 (1 year)"]
    [:div.description
     [:p
      (anchor "CTI" "https://www.cti.ac.za/")
      " is a private higher education institution where I earned my diplomas."]
     [:p "I was responsible for one-on-one tutoring, the creation and development of pre-test materials, hosting
     workshops and marking projects and practical exams."]
     [:p "I got promoted from an Assistant Instructor to Junior Instructor in October."]]]])
