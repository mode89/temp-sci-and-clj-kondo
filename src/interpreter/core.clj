(ns interpreter.core
  (:require [sci.core :as sci]))

(def my-macro ^:sci/macro
  (fn [_ _ x y]
    `(+ ~x ~y)))

(defn -main []
  (println
    (sci/eval-string
      (slurp "example.clj")
      {:bindings {'my-macro my-macro}})))
