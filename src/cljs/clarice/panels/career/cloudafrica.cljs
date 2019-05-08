(ns clarice.panels.career.cloudafrica
  (:require
    [clarice.ui.spec :as p]
    [clarice.helpers :refer [anchor highlighted-tag]]))

(defn panel []
  (p/spec
    {:spec       :cloudafrica
     :icon        "fas fa-server"
     :company     "CloudAfrica"
     :position    "Senior Systems and Full Stack Developer"
     :duration    "1 July 2018 (Current)"
     :blurb       [:p
                   (anchor "CloudAfrica" "https://www.cloudafrica.net/")
                   " is a cloud hosting company offering amazing and affordable cloud-based products to the
                   African market."]
     :description [:div
                   [:p "I am responsible for developing software that integrates with our infrastructure,
                   administering Virtual Machines, monitoring, server and firewall audits, documenting processes and
                   important information and supporting customer-related queries."]
                   [:p "I develop in"
                    (highlighted-tag "Clojure") "and" (highlighted-tag "ClojureScript")
                    ", integrating with "
                    (highlighted-tag "Datomic") "using"
                    (highlighted-tag "JetBrains IntelliJ")]
                   [:p "I run"
                    (highlighted-tag "Linux") "Fedora and use"
                    (highlighted-tag "Vim")]]}))