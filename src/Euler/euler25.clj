(ns euler25)

(defn fibs []
  (map first (iterate 
               (fn [[a b]] [b (+ a b)]) [0 1])))

(defn euler25 []
  (first (filter number? (map #(when (>= (count (str %1)) 1000) %2) (fibs) (iterate inc 1)))))
