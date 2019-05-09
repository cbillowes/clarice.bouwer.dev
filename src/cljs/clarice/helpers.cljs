(ns clarice.helpers)

(defn anchor
  [content link & [{:keys [class title same-tab]}]]
  [:a {:title title
       :class class
       :href link
       :target (if (true? same-tab) "_parent" "_blank")
       :rel "nofollow noopener noreferrer"}
   content])

(defn highlighted-tag
  [tag]
  [:span.tag tag " "])