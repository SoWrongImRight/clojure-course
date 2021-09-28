(ns tutorial.conditionals)
(defn CondIf
  []
  (println "\nCOndIf")
  (if (= 5 5)
    (println "Equal")
    (println "Not Equal"))
  )
(CondIf)

(defn CondIfDo
  []
  (println "\nCondIfDo")
  (if (= 5 6 )
    (do (println "Equal first statement")
        (println "Second statment"))
    (do (println "Not equal first statement")
        (println "Second statement"))
  ))
(CondIfDo)

(defn CondNestedIf
  []
  (println "\nNestedIf")
  (if (and (= 5 5)  (or (= 3 3) (not true)))
    (println "True")
    (println "False")))
(CondNestedIf)

(defn CondCase
  []
  (println "\nCondCase:")
  (def pet "dog")
  (case pet
    "cat" (println "I have a cat")
    "dog" (println "I have a dog"))
)
(CondCase)

(defn CondCond
  [amount]
  (println "\nCondCond")
  (cond
        (<= amount 2) (println "few")
        (<= amount 10) (println "several")
        (<= amount 100) (println "many")
        :else (println "loads")
        ))
(CondCond 55)