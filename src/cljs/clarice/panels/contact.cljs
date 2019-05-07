(ns clarice.panels.contact
  (:require
    [clarice.helpers :refer [anchor]]))

(defn panel []
  [:div#contact
   [:h1 "Get in touch with me"]
   [:div.icons
    (anchor [:i.fab.fa-twitter]
            "https://twitter.com/cbillowes"
            {:title "I tweet @cbillowes"
             :class "twitter"})

    (anchor [:i.fab.fa-github]
            "https://github.com/cbillowes"
            {:title "I push code to GitHub"
             :class "github"})

    (anchor [:i.fab.fa-linkedin-in]
            "https://www.linkedin.com/in/cbouwer/"
            {:title "My Linked In profile"
             :class "linkedin"})

    (anchor [:i.fas.fa-blog]
            "https://curiousprogrammer.dev"
            {:title "I blog at Curious Programmer"
             :class "blog"})

    (anchor [:i.fas.fa-envelope-open-text]
            "mailto:clarice.bouwer.dev"
            {:title    "Get in touch with me"
             :same-tab true
             :class    "email"})]])
