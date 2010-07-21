(ns euler15)

(defn euler15 []
  (reduce * (map / (range 3 6) (range 1 3))))