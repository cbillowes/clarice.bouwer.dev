(ns clarice.events
  (:require
   [re-frame.core :as re-frame]
   [clarice.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced defn-traced]]))


(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::set-active-panel
 (fn-traced [db [_ active-panel]]
   (assoc db :active-panel active-panel)))

(re-frame/reg-event-db
 ::set-active-menu-item
 (fn-traced [db [_ active-panel]]
   (assoc db :active-menu-item active-panel)))

(re-frame/reg-event-fx
 ::print-page
 (fn []
   (.print js/window)))
