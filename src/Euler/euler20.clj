(ns euler20)
;n! means n * (n - 1) * ... * 3 * 2 * 1
;Find the sum of the digits in the number 100!

(defn euler20 [n]
  (reduce #(+ (Integer. (str %1)) (Integer. (str %2))) 
    (seq (str (reduce * (map #(- n %) (range 0 100)))))))

;#(+ (Integer. (str %1)) (Integer. (str %2)))


(defn euler16 [sqer]
  (reduce #(+ (Integer. (str %1)) (Integer. (str %2))) (seq (str (hoch 2 sqer)))))