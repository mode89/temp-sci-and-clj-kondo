(ns hooks)

(defn my-macro-hook [node]
  (println "my-macro-hook")
  node)
