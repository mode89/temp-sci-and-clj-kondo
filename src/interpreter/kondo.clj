(ns interpreter.kondo)

(defn my-macro-hook [node]
  (println "my-macro-hook")
  node)
