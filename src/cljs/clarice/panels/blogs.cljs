(ns clarice.panels.blogs
  (:require
    [clarice.ui.spec :as s]
    [clarice.ui.expander :as expander]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div#blogs.panel
   [:h1 "My Blogs"]

   (expander/component)
   (s/spec
     {:spec        :curious-programmer
      :icon        "fas fa-blog"
      :title       "Curious Programmer"
      :sub-title   "My latest blog"
      :duration    "26 June 2018 (Current)"
      :blurb       [:p
                    "My "
                    (anchor "brand" "https://curiousprogrammer.dev/")
                    " changed to a curious place for a curious mind."]
      :description [:div
                    [:p "I changed my brand after leaving MultiChoice when I joined a startup-like company."]
                    [:p "I wanted to explore technologies like "
                     (highlighted-tag "Gatsby")
                     ", a React-based static site generator and "
                     (anchor "other" "https://curiousprogrammer.io/credits")
                     " tech."]
                    [:p "My vision is to write about what ever I learn and share it with others."]]})
   (s/spec
     {:spec        :corporate-programmer
      :icon        "fas fa-blog"
      :title       "Corporate Programmer"
      :sub-title   "My first official blog"
      :duration    "28 April 2016"
      :description [:div
                    [:p "I started a blog using "
                     (highlighted-tag "Jekyll")
                     ", a Ruby-based static site generator."]
                    [:p "My vision was to write topics that could help software developers in corporate environments
                     by sharing my personal experiences."]]})])