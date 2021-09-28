(ns tutorial.petstore)


(defn petToHuman
  "This function returns the age of a pet"
  [x]
  (def petStore {'dog 7, 'cat 5, 'goldfish 10})
  (get petStore x))

(defn age
  "Retuns the age of a pet"
  [petName petType petAge]
  (def ratio (petToHuman petType))
  (println petName "is" (* ratio petAge) "years old in human years"))

(age "Fido" 'dog 4)
(age "Spot" 'goldfish 35)
(age "21" 'dog 0.17)