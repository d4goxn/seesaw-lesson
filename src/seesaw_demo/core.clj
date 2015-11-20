(ns seesaw-demo.core
  (:use seesaw.core)
  (:gen-class))

(defn -main [& args]
  (invoke-later (-> (frame :title "Haro"
                           :content "Ima window!"
                           :on-close :exit)
                    pack!
                    show!)))
