(ns clarice.views
  (:require
    [re-frame.core :as re-frame]
    [clarice.ui.structure :as ui]
    [clarice.subs :as subs]))

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    (ui/panel @active-panel)))
