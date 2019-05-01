(ns clarice.subs
  (:require
    [re-frame.core :as re-frame]))

(re-frame/reg-sub
  ::brand
  (fn [db]
    [(:brand-first-part db) (:brand-second-part db)]))

(re-frame/reg-sub
  ::navigation
  (fn [db]
    (:navigation db)))

(re-frame/reg-sub
  ::active-panel
  (fn [db _]
    (:active-panel db)))

(re-frame/reg-sub
  ::active-menu-item
  (fn [db _]
    (:active-menu-item db)))
