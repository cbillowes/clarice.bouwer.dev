(ns clarice.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [clarice.ui.layout :as ui]
   [clarice.events :as events]
   [clarice.routes :as routes]
   [clarice.config :as config]))

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [ui/render]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
