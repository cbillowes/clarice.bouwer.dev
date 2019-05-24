(ns clarice.ui.structure
  (:require
    [clarice.panels.not-found :as not-found]
    [clarice.panels.welcome :as welcome]
    [clarice.panels.about :as about]
    [clarice.panels.career :as career]
    [clarice.panels.contact :as contact]
    [clarice.panels.resume :as resume]
    [clarice.panels.technologies :as technologies]
    [clarice.panels.qualifications :as qualifications]
    [clarice.panels.podcasts :as podcasts]
    [clarice.panels.publishing :as publishing]
    [clarice.panels.public-speaking :as public-speaking]
    [clarice.panels.blogs :as blogs]
    [clarice.panels.projects :as projects]
    [clarice.panels.community :as community]))

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

(defmethod panel :resume-panel [_]
  (resume/panel))

(defmethod panel :technologies-panel [_]
  (technologies/panel))

(defmethod panel :qualifications-panel [_]
  (qualifications/panel))

(defmethod panel :podcasts-panel [_]
  (podcasts/panel))

(defmethod panel :publishing-panel [_]
  (publishing/panel))

(defmethod panel :public-speaking-panel [_]
  (public-speaking/panel))

(defmethod panel :blogs-panel [_]
  (blogs/panel))

(defmethod panel :projects-panel [_]
  (projects/panel))

(defmethod panel :community-panel [_]
  (community/panel))


