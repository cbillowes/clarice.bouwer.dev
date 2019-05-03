(ns clarice.panels.welcome)

(defn panel []
  [:div#welcome.panel
   [:h1 "Hello Clarice."]
   [:p
    [:em "/ klarr'is / "]
    "Clarice is a given name of Latin and Greek origin. The \"Clarice\" spelling is the Germanic "
    "variant of the Latin Clarus (bright, clear, famous)."]
   [:p "This Clarice has been writing software for over 15 years. She loves it. "
    "She makes sure she doesn't get caught up in the perils of that thing called a comfort zone. "
    "It keeps her excited and continuously learning while enjoying her life-long passion."]])
