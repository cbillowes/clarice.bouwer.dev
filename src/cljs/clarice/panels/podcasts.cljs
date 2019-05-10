(ns clarice.panels.podcasts
  (:require
    [clarice.ui.spec :as s]
    [clarice.ui.expander :as expander]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div#podcasts.panel
   [:h1 "Aired on podcasts"]

   (expander/component)
   (s/spec
     {:spec        :za-dev-chat
      :icon        "fas fa-microphone-alt"
      :title       "67 - The Imposter Within with Clarice Bouwer"
      :sub-title   "ZA Dev Chat"
      :duration    "28 Aug 2017"
      :blurb       ""
      :description [:div
                    [:p "I shared my views on Imposter Syndrome, what I understand it to be and how I try to overcome it."
                     "I covered issues around the importance of mental well-being."]]})
   (s/spec
     {:spec        :corporate-programmer
      :icon        "fas fa-microphone-alt"
      :title       "Episode 202 | Clarice Bouwer - Leaving Comfort Behind"
      :sub-title   "Developer on Fire"
      :duration    "23 Jan 2017"
      :blurb       ""
      :description [:div
                    [:p "I spoke with Dave Rael about collaboration, empathy, fear and feeling like being an Imposter."]]})])
