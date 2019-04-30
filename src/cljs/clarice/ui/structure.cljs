(ns clarice.ui.structure)

(defmulti panel (fn [panel] panel))

(defmethod panel nil [_]
  [:h1 "Not found"])

(defmethod panel :welcome-panel [_]
  [:h1 "Welcome"])

(defmethod panel :about-panel [_]
  [:h1 "About"])

(defmethod panel :career-panel [_]
  [:h1 "Career"])

(defmethod panel :contact-panel [_]
  [:h1 "Contact"])


