(ns clarice.panels.community
  (:require
    [clarice.ui.spec :as s]
    [clarice.ui.expander :as expander]
    [clarice.helpers :refer [anchor]]))

(defn panel []
  [:div#community.panel
   [:h1 "Community"]

   (expander/component)
   (s/spec
     {:spec        :devconf-2019
      :icon        "fas fa-users"
      :title       "Unpanelist"
      :sub-title   "DevConf 2019"
      :duration    "March 2019"
      :blurb       [:div
                    [:p "DevConf is a conference in South Africa for professional software developers focusing on the
                    enterprise development scenarios."]]
      :description [:div
                    [:p "I facilitated Lean Coffee and Fishbowl sessions."]
                    [:p
                     (anchor "Lean Coffee" "leancoffee.org")
                     " is a structured, but agenda-less meeting. Participants gather, build their an agenda, and
                     begin talking."]
                    [:p "A "
                     (anchor "Fishbowl" "https://en.wikipedia.org/wiki/Fishbowl_(conversation)")
                     " is a platform to drive medium to large group conversations."]
                    [:p "The structure is an inner circle with layering outer circles.
                      The inner circle is dedicated to active dialog.
                      The outer circle accommodates attendees who are interested in conversations
                      and may want to participate and can do so by tapping someone out of the inner circle."]]})
   (s/spec
     {:spec        :agile-africa-2018
      :icon        "fas fa-users"
      :title       "Organizer"
      :sub-title   "Agile Africa 2018"
      :duration    "October 2018"
      :blurb       [:div
                    [:p
                     (anchor "Agile Africa", "https://www.agileafricaconf.com/")
                     " is an South African hosted Agile Conference."]]
      :description [:div
                    [:p "As one of the organizers, I was responsible for delegate bags, facilitating speakers and guiding delegates "
                     "to the respective speaker rooms. In the event that something did not go according to plan, quick thinking and "
                     "immediate action was required."]]})

   (s/spec
     {:spec        :developer-ug
      :icon        "fas fa-users"
      :title       "Member"
      :sub-title   "Developer User Group Meetup"
      :duration    "July 2012"
      :blurb       [:div
                    [:p
                     (anchor "DeveloperUG" "https://www.meetup.com/DeveloperUG/")
                     " is a community that loves all things developer. It is technology and
                     vendor-neutral."]]
      :description [:div
                    [:p "I started attending the monthly Developer User Group meetups at Microsoft in Johannesburg.
                    and was exposed to a variety of technologies, solutions and best-practices."]]})

   (s/spec
     {:spec        :stack-overflow
      :icon        "fas fa-users"
      :title       "Member"
      :sub-title   "Stack Overflow"
      :duration    "June 2011"
      :blurb       [:div
                    [:p
                     (anchor "Stack Overflow" "https://stackoverflow.com/")
                     " is a community driven Q&A platform where developers learn, share and build careers."]]
      :description [:div
                    [:p "I joined the community. In May 2019 I have reached approximately 343K people
                    and have been in the top 16%."]
                    [:p
                     (anchor [:img {:src    "https://stackexchange.com/users/flair/453154.png"
                                    :width  "208px"
                                    :height "58px"
                                    :alt    "Profile for Clarice Bouwer on Stack Exchange, a network of free, community-driven Q&A sites"
                                    :title  "Profile for Clarice Bouwer on Stack Exchange, a network of free, community-driven Q&A sites"}]
                             "https://stackexchange.com/users/453154/cbillowes")]]})])
