(ns euler26)

(use '[clojure.contrib.math])


(defn euler26 [a b]
  (count (set (for [base (range 2 (inc a)) 
        ext (range 2 (inc b))]
  (expt base ext)))))


