(ns clarice.ui.layout
  (:require
    [re-frame.core :as re-frame]
    [clarice.ui.structure :as ui]
    [clarice.subs :as subs]))

(defn render []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    (ui/panel @active-panel)))
