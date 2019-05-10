(ns clarice.panels.qualifications
  (:require
    [clarice.ui.spec :as s]
    [clarice.ui.expander :as expander]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div#qualifications.panel
   [:h1 "Official Qualifications"]

   (expander/component)
   (s/spec
     {:spec        :cti-vb.net
      :icon        "fas fa-graduation-cap"
      :title       "VB.NET Certificate"
      :sub-title   "Computer Training Institute"
      :duration    "Aug 2005 - Oct 2005"
      :blurb       [:p "Passed with distinction."]
      :description [:div
                    [:p "I completed a certificate for "
                     (highlighted-tag "VB.NET")
                     " scoring a 93% on the final language practical."]]})

   (s/spec
     {:spec        :cti-information-systems
      :icon        "fas fa-graduation-cap"
      :title       "Information Systems: Software Development"
      :sub-title   "Computer Training Institute"
      :duration    "Jan 2005 - Oct 2005"
      :blurb       [:p "Passed with distinction."]
      :description [:div
                    [:p "I completed courses including "
                     (highlighted-tag "C#") ", "
                     (highlighted-tag "VB.NET") ", "
                     (highlighted-tag "Hardware Essentials") ", "
                     (highlighted-tag "SQL") ", "
                     (highlighted-tag "Program Design") ", "
                     (highlighted-tag "Software Engineering") " and "
                     (highlighted-tag "Perl")]
                    [:p "I scored 91% on my full language practical, 93% on my half language practical and
                    90% on my database practical. My score average for my diploma is 83%."]]})

   (s/spec
     {:spec        :cti-computer-science
      :icon        "fas fa-graduation-cap"
      :title       "Computer Science: Internet Development"
      :sub-title   "Computer Training Institute"
      :duration    "Jan 2004 - Nov 2004"
      :blurb       [:p "Passed with distinction."]
      :description [:div
                    [:p "I completed courses including "
                     (highlighted-tag "Perl") ", "
                     (highlighted-tag "i-Net+") ", "
                     (highlighted-tag "Linux") ", "
                     (highlighted-tag "PLC") ", "
                     (highlighted-tag "Java") ", "
                     (highlighted-tag "JavaScript") " and "
                     (highlighted-tag "SQL")]
                    [:p "I scored 85% on my full language practical, 91% on my Internet Development practical and
                    90% on my database practical. My score average for my diploma is 86%."]]})


   (s/spec
     {:spec        :jj-matric
      :icon        "fas fa-book-reader"
      :title       "Matriculation"
      :sub-title   "Dr Johan Jurgens"
      :duration    "Jan 1999 - Dec 2003"
      :blurb       [:div
                    [:p "Matriculated with university exemption with all subjects on higher grade:
                   English, Afrikaans, Computer Science, Mathematics, Science and Economics."]]
      :description [:div
                    [:ul
                     [:li "Student Council (2002 - 2003)"]
                     [:li "Editor of the school newspaper (2003)"]
                     [:li "Layout editor of the school newspaper (2001 - 2003)"]
                     [:li "Photographer of the school newspaper (2000)"]
                     [:li "Webmaster of the IT College (2001 - 2002)"]
                     [:li "Member of the IT College (2000 - 2002)"]]]})])
