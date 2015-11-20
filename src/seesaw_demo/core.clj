(ns seesaw-demo.core
  (:use seesaw.core)
  (:gen-class))

(native!)

(def b (button :text "shh!"))

(def ls (vertical-panel
          :items ["Ima window!" "I'm with stupid ^"]))

(def f (frame :title "Haro"
              :content (vertical-panel
                         :items [ls b])
              :on-close :exit))

(listen b :action (fn [e]
                    (alert e "ok")
                    (config! ls :items ["..."])
                    (config! b :enabled? false)
                    (pack! f)))

(defn -main [& args]
  (invoke-later (-> f pack! show!)))
