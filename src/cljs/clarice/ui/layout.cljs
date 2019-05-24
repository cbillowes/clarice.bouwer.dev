(ns clarice.ui.layout
  (:require
    [re-frame.core :as re-frame]
    [clarice.ui.structure :as ui]
    [clarice.ui.navigation :refer [navigation]]
    [clarice.subs :as subs]))

(defn render []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [:div
     (navigation @active-panel)
     [:div.container
      (ui/panel @active-panel)]]))
