(ns tutorial.Atoms)

(defn Atoms
  []
  (def amount (atom 100))
  (println @amount)
  (swap! amount dec)
  (println @amount)
  (reset! amount 120)
  (println @amount)
  (compare-and-set! amount 120 140)
  (println @amount))


(Atoms)