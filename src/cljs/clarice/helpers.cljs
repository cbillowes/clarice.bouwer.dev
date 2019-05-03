(ns clarice.helpers)

(defn anchor
  [content link & [{:keys [class title]}]]
  [:a {:title title
       :class class
       :href link
       :target "_blank"
       :rel "nofollow noopener noreferrer"}
   content])

(defn highlighted-tag
  [tag]
  [:span.tag tag " "])