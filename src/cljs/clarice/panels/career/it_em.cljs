(ns clarice.panels.career.it-em
  (:require
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div.spec.it-em
   [:span.icon
    [:i.fas.fa-calendar-alt]]
   [:h2 "IT Event Management"]
   [:div.details
    [:h3.type "Lead Senior Web Developer"]
    [:span.duration "Sept 2006 - Apr 2012 (5 years and 8 months)"]
    [:div.description
     [:p
      (anchor "IT-EM" "http://www.it-em.co.za/")
      " offers event management solutions and on-site registrations."]
     [:p "I was responsible for developing, deploying, maintaining and supporting custom developed event registration
     solutions in our staging and production environments. I was on-site for Microsoft Tech-Ed and Partner Summit."]
     [:p "I was promoted from Junior Web Developer to Lead Senior Web Developer in 2010. I managed the development of
     the Microsoft Tech-Ed and Partner Summit projects and mentored other developers. I developed a customizable event
     registration solution to create events in a faster way."]
     [:p "The dominant technologies included"
      (highlighted-tag "VB.NET") "and"
      (highlighted-tag "SQL")
      "On the front-end we included"
      (highlighted-tag "jQuery") "and"
      (highlighted-tag "Bootstrap")
      "We integrated with the"
      (highlighted-tag "Nedbank iVeri Payment Gateway")
      "for our standard payment merchant account and"
      (highlighted-tag "Mashreq Payment Gateway")
      "for our Microsoft Tech-Ed Dubai event."]]]])

