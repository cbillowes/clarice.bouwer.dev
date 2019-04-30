(ns clarice.ui.structure
  (:require
    [clarice.panels.not-found :as not-found]
    [clarice.panels.welcome :as welcome]
    [clarice.panels.about :as about]
    [clarice.panels.career :as career]
    [clarice.panels.contact :as contact]))

(defmulti panel (fn [panel] panel))

(defmethod panel nil [_]
  (not-found/panel))

(defmethod panel :welcome-panel [_]
  (welcome/panel))

(defmethod panel :about-panel [_]
  (about/panel))

(defmethod panel :career-panel [_]
  (career/panel))

(defmethod panel :contact-panel [_]
  (contact/panel))


