(ns clarice.panels.about
  (:require
    [clarice.events :as events]
    [clarice.subs :as subs]
    [clarice.helpers :refer [anchor highlighted-tag]]
    [re-frame.core :as re-frame]))

(defn- blurb
  []
  [:div
   [:p "I write code. I share code. I love code."]
   [:p "I enjoy software development both as a profession and a hobby. In my workplace I write
   code to solve real world problems. In my spare time, I explore new and better techniques, technologies
   and implement them in test projects, on my blog and try write about what I learn."]])

(defn- elaborate
  [expand-to]
  [:div {:class (if (= :elaborate expand-to) "active" "inactive")}
   [:p "I am a curious programmer who soaks up knowledge. I strive to write developer-friendly code for
   people-friendly systems. I believe in "
    (highlighted-tag "consistency") ", "
    (highlighted-tag "code reviews") "and the integration of "
    (highlighted-tag "systems testing") "in an "
    (highlighted-tag "automated pipeline")
    "for more efficient deployments."]
   [:p "I am resourceful when debugging problems in code. I scrutinize stack-traces, error messages and logical
   flows. I know how to search for problems in Google and my go-to website is StackOverflow."]
   [:p "I enjoy working in diverse teams with human interaction. I understand the importance of communication
    and the barriers we face with it. I aim to relay technical talk in layman's terms when interacting with non-techncial
    individuals and politely suggest shyer developers air their voice."]])

(defn- interests
  [expand-to]
  [:div {:class (if (= :interests expand-to) "active" "inactive")}
   [:h2 "Things that keep me interested"]
   [:p "I enjoy playing drums, collecting e-books, reading thrillers, technical and self-help books, watching Anime
   listening to punk-rock/metal music and I persist to keeping my "
    (anchor "curiousprogrammer.dev" "https://curiousprogrammer.dev")
    " blog alive."]])

(defn- preferred-technologies
  [expand-to]
  [:div {:class (if (= :preferred-technologies expand-to) "active" "inactive")}
   [:h2 "Technologies I prefer and have experience in"]
   [:p "I come from a web development background and enjoy using "
    (highlighted-tag "HTML")
    (highlighted-tag "CSS/LESS/SASS")
    (highlighted-tag "JavaScript/jQuery")
    "and am eager to work in"
    (highlighted-tag "React") ". I have experience using static site generators like"
    (highlighted-tag "Gatsby") "and" (highlighted-tag "Jekyll")]
   [:p "I have worked across the stack using"
    (highlighted-tag "C#") "and" (highlighted-tag "SQL") "and now prefer using"
    (highlighted-tag "Clojure/ClojureScript") "and"
    (highlighted-tag "Datomic")]
   [:p "I have design experience and enjoy working with"
    (highlighted-tag "Photoshop") "and"
    (highlighted-tag "pixlr.com")]
   [:p "My favourite editors are "
    (highlighted-tag "JetBrains IntelliJ")
    (highlighted-tag "Microsoft Visual Studio")
    (highlighted-tag "Microsoft Visual Sudio Code") "and operating system is"
    (highlighted-tag "Linux Fedora")]])

(defn- experience
  [expand-to]
  [:div {:class (if (= :experience expand-to) "active" "inactive")}
   [:h2 "My experience in a nutshell"]
   [:p "I have two diplomas and over 15 year of experience. I have aired on two podcasts, published three articles "
    "spoken at three events, worked on two blogs and developed software for well known "
    "companies including Microsoft, Vodacom, DStv and CloudAfrica."]])

(defn- expand-content [content]
  #(re-frame/dispatch [::events/about-panel-expand-to-content content]))

(defn panel []
  (let [expand-to (re-frame/subscribe [::subs/about-panel-expand-to-content])]
    [:div#about.panel
     [:h1 "This is me..."]
     [:div.photo {:title "Clarice Bouwer"}]
     (blurb)
     [:button.btn
      {:class    (when (= :elaborate @expand-to) "active")
       :on-click (expand-content (if (= :elaborate @expand-to) :nothing :elaborate))}
      "elaborate"]

     [:button.btn
      {:class    (when (= :interests @expand-to) "active")
       :on-click (expand-content (if (= :interests @expand-to) :nothing :interests))}
      "my interests"]

     [:button.btn
      {:class    (when (= :preferred-technologies @expand-to) "active")
       :on-click (expand-content (if (= :preferred-technologies @expand-to) :nothing :preferred-technologies))}
      "my preferred technologies"]

     [:button.btn
      {:class    (when (= :experience @expand-to) "active")
       :on-click (expand-content (if (= :experience @expand-to) :nothing :experience))}
      "my experience"]

     [:div#more
      (elaborate @expand-to)
      (interests @expand-to)
      (experience @expand-to)
      (preferred-technologies @expand-to)]]))
