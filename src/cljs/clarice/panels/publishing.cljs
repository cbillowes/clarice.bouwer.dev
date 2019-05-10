(ns clarice.panels.publishing
  (:require
    [clarice.ui.spec :as s]
    [clarice.ui.expander :as expander]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  [:div#publishing.panel
   [:h1 "Published articles"]

   (expander/component)
   (s/spec
     {:spec        :offerzen
      :icon        "fas fa-book"
      :title       "Debugging with Chrome DevTools: Quick Front End Fixes"
      :sub-title   "OfferZen"
      :duration    "22 July 2018"
      :blurb       [:div
                    "This "
                    (anchor "article" "https://www.offerzen.com/blog/debugging-with-chrome-devtools-quick-front-end-fixes")
                    " aims to be a good starting point for anyone familiarizing themselves with the Chrome DevTools."]
      :description [:div
                    [:blockquote "Debugging is an art form. Often, it feels like you need a series of serendipitous insights
                     to fix a complicated bug. In reality, you need two things: technical knowledge
                     to spot broader patterns and connections, and data on the bug itself to
                     understand the problem."]
                    [:p "I worked closely with Anne Gonschorek and wrote about how the "
                     (highlighted-tag "Chrome DevTools")
                     " can help fix "
                     (highlighted-tag "JavaScript") ", "
                     (highlighted-tag "HTML") " and"
                     (highlighted-tag "CSS")
                     "bugs fast. "]]})

   (s/spec
     {:spec        :corporate-programmer
      :icon        "fas fa-book"
      :title       "The Imposter Within"
      :sub-title   "Corporate Programmer"
      :duration    "28 Aug 2017"
      :blurb       [:div
                    "This "
                    (anchor "article" "https://curiousprogrammer.io/blog/the-imposter-within")
                    " featured on my Corporate Programmer blog."]
      :description [:div
                    [:p "This post sparked some interesting conversations on "
                     (anchor "Reddit" "https://www.reddit.com/r/programming/comments/5cpaty/ive_had_a_lot_of_problems_with_imposter_syndrome/")
                     ", which accumulated over 6,5K unique page view and 200 votes within a week of posting."
                     "I covered issues around the importance of mental well-being."]]})

   (s/spec
     {:spec        :a-list-apart
      :icon        "fas fa-book"
      :title       "Finding Opportunities in the Mistakes We Make"
      :sub-title   "A List Apart"
      :duration    "2 August 2016"
      :blurb       [:div
                    "This "
                    (anchor "article" "https://alistapart.com/article/finding-opportunities-in-the-mistakes-we-make/")
                    " shares my frustrations and burn-out and how I started to use the mistakes
                    I was making to find ways to improve my well-being."]
      :description [:div
                    [:p "Collaborating with Rose Weisburd, I wrote about burn out and falling behind in technology."
                     "I learned a lot in my career and shared how I found opportunities in the mistakes I made."]]})])
