(ns clarice.panels.projects
  (:require
    [clarice.ui.spec :as s]
    [clarice.ui.expander :as expander]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div#projects.panel
   [:h1 "Projects"]

   (expander/component)
   (s/spec
     {:spec        :dstv-now
      :icon        "fas fa-satellite"
      :title       "DStv Now"
      :sub-title   "DStv Digital Media"
      :duration    "Apr 2016 - May 2018"
      :blurb       [:div
                    (anchor "DStv Now" "https://now.dstv.com")
                    " is a live streaming and VOD digital entertainment solution offering
                    DStv Catch Up and Live TV streaming offerings."]
      :description [:div
                    [:p "At the time, this "
                     (highlighted-tag "Video On-Demand")
                     " platform used the "
                     (highlighted-tag "Bitmovin ")
                     " video player and the "
                     (highlighted-tag "Akamai")
                     " content delivery network."]
                    [:p "The front-end used "
                     (highlighted-tag "Couchbase") " to store data received from multiple microservice touch points."]]})

   (s/spec
     {:spec        :original-productions
      :icon        "fas fa-file-signature"
      :title       "Original Productions"
      :sub-title   "DStv Digital Media"
      :duration    "Apr 2014 - May 2016"
      :blurb       [:div
                    "As a contractor through 3Fifteen/Britehouse, I had the opportunity to develop voting solutions
                    for various African voting platforms."]
      :description [:ul
                    [:li "Idols South Africa"]
                    [:li "Big Brother Mzansi & Angola"]
                    [:li "Channel-O Music Video Awards"]
                    [:li "Africa Magic Viewers Choice Awards"]]})

   (s/spec
     {:spec        :cross-media
      :icon        "fas fa-book"
      :title       "Cross Media Solutions"
      :sub-title   "Remata Cross Media"
      :duration    "Apr 2014 - May 2016"
      :blurb       [:div
                    [:p "I worked on solutions specializing in print, web, mobile and email communications."]]
      :description [:div
                    [:ul
                     [:li "Platinum Life VDP" [:sup "*"] " automation service"]
                     [:li "Nashua Mobile Business contract proposal VDP" [:sup "*"]]
                     [:li "Photo2Print automation"]
                     [:li "Daily reminder SMSs sent on behalf of companies"]]
                    [:p [:i [:sup "*"] "Variable Data Print"]]]})

   (s/spec
     {:spec        :event-registrations
      :icon        "fas fa-calendar-alt"
      :title       "Event Registration Solutions"
      :sub-title   "IT Event Management"
      :duration    "Sept 2006 - Apr 2012"
      :blurb       [:div
                    [:p "My portfolio is packed with Microsoft event solutions which includes
                    web and mobile registration; payment integration; speaker, agenda, flights and accommodation management;
                    an intranet web site, on-site delegate queries and support where applicable."]]
      :description [:div
                    [:ul
                     [:li "Microsoft Tech-Ed Africa & Middle East"]
                     [:li "Microsoft Partner Summit"]
                     [:li "Microsoft TechDays & DevDays"]
                     [:li "Microsoft Bootcamps"]
                     [:li "Microsoft ICT Best Practices"]
                     [:li "Vodacom Business Partners Conference"]]]})])
