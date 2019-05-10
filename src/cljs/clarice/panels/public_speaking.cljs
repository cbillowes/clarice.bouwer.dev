(ns clarice.panels.public-speaking
  (:require
    [clarice.ui.spec :as s]
    [clarice.ui.expander :as expander]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div#public-speaking.panel
   [:h1 "Public speaking"]
   [:p
    "“Courage is resistance to fear, mastery of fear — not absence of fear.”— Mark Twain."]

   (expander/component)
   (s/spec
     {:spec        :rubyfuza
      :icon        "fas fa-volume-up"
      :title       "The Imposter Within"
      :sub-title   "Rubyfuza 2017 Conference"
      :duration    "3 February 2017"
      :blurb       [:div
                    [:p
                     (anchor "Rubyfza" "https://www.rubyfuza.org/")
                     " is the longest run Ruby conference in South Africa."]]
      :description [:div
                    [:p "I shared how Impostor Syndrome limited my opportunities which affected me in
                    both my personal and professional capacity."]
                    [:p
                     "Learn more through my "
                     (anchor "Twitter moments" "https://twitter.com/i/moments/830378337516322816")
                     ", "
                     (anchor "blog post" "https://curiousprogrammer.io/blog/rubyfuza-2017-conference/")
                     " or watch my talk on"
                     (anchor "YouTube" "https://www.youtube.com/watch?v=fkgAc0DY4s8")
                     "."]]})

   (s/spec
     {:spec        :mindfulness
      :icon        "fas fa-volume-up"
      :title       "Mindfulness"
      :sub-title   "Driven Unconference"
      :duration    "31 July 2016"
      :blurb       [:div
                    [:p "The Unconference is an invite-only software development weekend retreat."]]
      :description [:div
                    [:p "I shared how practicing the art of mindfulness calmed me
                    and made me more productive."]]})

   (s/spec
     {:spec        :branding
      :icon        "fas fa-volume-up"
      :title       "Branding Your Identity"
      :sub-title   "Java 9 and Women in tech Unconference with International guest Heather VanCura"
      :duration    "4 June 2016"
      :blurb       [:div
                    (anchor "Jozi-JUG" "https://www.meetup.com/Jozi-JUG/")
                    " is a Jozi JVM User Group (Jozi-JUG) is a User Group."]
      :description [:div
                    [:p "This was my first "
                     (anchor "talk" "https://curiousprogrammer.io/blog/branding-your-identity")
                     ". I shared how software developers can create a name for themselves by creating their own brand."]]})])
