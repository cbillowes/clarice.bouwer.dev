(ns clarice.panels.technologies
  (:require
    [re-frame.core :as re-frame]
    [clarice.subs :as subs]
    [clarice.events :as events]
    [clarice.helpers :refer [highlighted-tag]]))

(defn panel []
  (let [more (re-frame/subscribe [::subs/technologies-more])]
    [:div#technologies.panel
     [:h1 "Over a decade of technologies"]
     [:div.showcase
      [:img {:src "/img/csharp.png"}]
      [:img {:src "/img/clojure.png"}]
      [:img {:src "/img/javascript.png"}]
      [:img {:src "/img/html.png"}]
      [:img {:src "/img/css.png"}]
      [:img {:src "/img/datomic.png"}]
      [:img {:src "/img/sql.png"}]
      [:img {:src "/img/git.png"}]
      [:img {:src "/img/linux.png"}]
      [:img {:src "/img/intellij.png"}]]
     [:div#accent
      (highlighted-tag "C#")
      (highlighted-tag "Clojure")
      (highlighted-tag "ClojureScript")
      (highlighted-tag "JavaScript")
      (highlighted-tag "HTML5")
      (highlighted-tag "CSS3")
      (highlighted-tag "Datomic")
      (highlighted-tag "SQL")
      (highlighted-tag "Git")
      [:button.more.btn
       {:on-click #(re-frame/dispatch [::events/set-more-technologies (not @more)])}
       (if (true? @more) [:i.fas.fa-angle-left] [:i.fas.fa-angle-right])]]
     [:div.expand {:class (if (true? @more) "active" "inactive")}
      (highlighted-tag "Linux")
      (highlighted-tag "Windows")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "Reagent")
      (highlighted-tag "re-frame")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "WebAPI")
      (highlighted-tag "Entity Framework")
      (highlighted-tag "MVC")
      (highlighted-tag "LINQ")
      (highlighted-tag "VB.NET")
      (highlighted-tag "Solr")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "JSON")
      (highlighted-tag "XML")
      (highlighted-tag "CSV")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "Gatsby")
      (highlighted-tag "Jekyll")
      (highlighted-tag "React")
      (highlighted-tag "jQuery")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "SASS")
      (highlighted-tag "LESS")
      (highlighted-tag "Handlebars")
      (highlighted-tag "Grunt")
      (highlighted-tag "Webpack")
      (highlighted-tag "Bootstrap")
      (highlighted-tag "Semantic UI")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "infrastructor")
      (highlighted-tag "Jenkins")
      (highlighted-tag "Gitlab")
      (highlighted-tag "CircleCI")
      (highlighted-tag "Travis")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "vmadm")
      (highlighted-tag "fwadm")
      (highlighted-tag "imgadm")
      (highlighted-tag "proxmox")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "Adobe Photoshop")
      (highlighted-tag "Adobe Illustrator")
      (highlighted-tag "pixlr")
      [:span.spacer.fas.fa-ellipsis-v]

      (highlighted-tag "Visual Studio Code")
      (highlighted-tag "Microsoft Visual Studio")
      (highlighted-tag "IDEA IntelliJ")]]))
