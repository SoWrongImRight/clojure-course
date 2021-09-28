(ns tutorial.Sequences)

(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  (println (cons "yellow" colors))
  (println (cons colors "yellow"))

  (println (conj colors "yellow"))
  (println (conj ["red" "green" "blue"] "yellow"))
  (println (concat colors (seq ["black" "white"])))

  (println (distinct (seq [ 1 5 3 4 62 4 8 6 5 21 5 4 3 5])))

  (println (reverse colors))
  (println (first colors))
  (println (rest colors))
  (println (last colors))

  (println (sort (seq [ 1 5 3 4 62 4 8 6 5 21 5 4 3 5])))

  )
(Seq)
