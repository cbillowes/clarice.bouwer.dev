(ns clarice.routes
  (:require-macros [secretary.core :refer [defroute]])
  (:import goog.History)
  (:require
    [secretary.core :as secretary]
    [goog.events :as gevents]
    [goog.history.EventType :as EventType]
    [re-frame.core :as re-frame]
    [clarice.events :as events]))

(defn hook-browser-navigation! []
  (doto (History.)
    (gevents/listen
      EventType/NAVIGATE
      (fn [event]
        (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn app-routes []
  (secretary/set-config! :prefix "#")

  (defroute "/" [] (re-frame/dispatch [::events/set-active-panel :welcome-panel]))
  (defroute "/about" [] (re-frame/dispatch [::events/set-active-panel :about-panel]))
  (defroute "/career" [] (re-frame/dispatch [::events/set-active-panel :career-panel]))
  (defroute "/contact" [] (re-frame/dispatch [::events/set-active-panel :contact-panel]))
  (defroute "/technologies" [] (re-frame/dispatch [::events/set-active-panel :technologies-panel]))
  (defroute "/qualifications" [] (re-frame/dispatch [::events/set-active-panel :qualifications-panel]))
  (defroute "/podcasts" [] (re-frame/dispatch [::events/set-active-panel :podcasts-panel]))
  (defroute "/publishing" [] (re-frame/dispatch [::events/set-active-panel :publishing-panel]))
  (defroute "/public-speaking" [] (re-frame/dispatch [::events/set-active-panel :public-speaking-panel]))
  (defroute "/blogs" [] (re-frame/dispatch [::events/set-active-panel :blogs-panel]))
  (defroute "/projects" [] (re-frame/dispatch [::events/set-active-panel :projects-panel]))
  (defroute "/community" [] (re-frame/dispatch [::events/set-active-panel :community-panel]))

  (hook-browser-navigation!))
