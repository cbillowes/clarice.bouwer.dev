(ns clarice.panels.technologies
  (:require
    [re-frame.core :as re-frame]
    [clarice.subs :as subs]
    [clarice.events :as events]))

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
      [:span "C#"]
      [:span "Clojure"]
      [:span "ClojureScript"]
      [:span "JavaScript"]
      [:span "HTML5"]
      [:span "CSS3"]
      [:span "Datomic"]
      [:span "SQL"]
      [:span "Git"]
      [:button.more.btn
       {:on-click #(re-frame/dispatch [::events/set-more-technologies (not @more)])}
       (if (true? @more) [:i.fas.fa-angle-left] [:i.fas.fa-angle-right])]]
     [:div.expand {:class (if (true? @more) "active" "inactive")}
      [:span "Linux"]
      [:span "Windows"]
      [:span.spacer.fas.fa-ellipsis-v]

      [:span "Reagent"]
      [:span "re-frame"]
      [:span.spacer.fas.fa-ellipsis-v]

      [:span "WebAPI"]
      [:span "Entity Framework"]
      [:span "MVC"]
      [:span "LINQ"]
      [:span "VB.NET"]
      [:span "Solr"]
      [:span.spacer.fas.fa-ellipsis-v]

      [:span "JSON"]
      [:span "XML"]
      [:span "CSV"]
      [:span "Gatsby"]
      [:span "Jekyll"]
      [:span "React"]
      [:span "jQuery"]
      [:span "SASS"]
      [:span "LESS"]
      [:span "Handlebars"]
      [:span "Grunt"]
      [:span "Webpack"]
      [:span "Bootstrap"]
      [:span "Semantic UI"]
      [:span.spacer.fas.fa-ellipsis-v]

      [:span "infrastructor"]
      [:span "Jenkins"]
      [:span "Gitlab"]
      [:span "CircleCI"]
      [:span "Travis"]
      [:span.spacer.fas.fa-ellipsis-v]

      [:span "vmadm"]
      [:span "fwadm"]
      [:span "imgadm"]
      [:span "proxmox"]
      [:span.spacer.fas.fa-ellipsis-v]

      [:span "Adobe Photoshop"]
      [:span "Adobe Illustrator"]
      [:span.spacer.fas.fa-ellipsis-v]

      [:span "Visual Studio Code"]
      [:span "Microsoft Visual Studio"]
      [:span "IDEA IntelliJ"]]]))