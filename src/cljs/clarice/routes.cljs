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

(defn activate-panel
  ([panel]
   (activate-panel panel panel))
  ([panel parent]
   (re-frame/dispatch [::events/set-active-panel panel])
   (re-frame/dispatch [::events/set-active-menu-item {:parent parent :child panel}])))

(defn app-routes []
  (secretary/set-config! :prefix "#")

  (defroute "/" [] (activate-panel :welcome-panel))
  (defroute "/about" [] (activate-panel :about-panel))
  (defroute "/career" [] (activate-panel :career-panel))
  (defroute "/contact" [] (activate-panel :contact-panel))
  (defroute "/technologies" [] (activate-panel :technologies-panel :showcase-panel))
  (defroute "/qualifications" [] (activate-panel :qualifications-panel :showcase-panel))
  (defroute "/podcasts" [] (activate-panel :podcasts-panel :showcase-panel))
  (defroute "/publishing" [] (activate-panel :publishing-panel :showcase-panel))
  (defroute "/public-speaking" [] (activate-panel :public-speaking-panel :showcase-panel))
  (defroute "/blogs" [] (activate-panel :blogs-panel :showcase-panel))
  (defroute "/projects" [] (activate-panel :projects-panel :showcase-panel))
  (defroute "/community" [] (activate-panel :community-panel :showcase-panel))

  (hook-browser-navigation!))
