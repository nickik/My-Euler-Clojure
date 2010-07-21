(ns euler5)

;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(defn teilbar [testnumber]
  (when (every? true? (map (fn [x] (zero? (mod testnumber x)))) (range 11 21)) testnumber))

(defn euler5 []
  (some #(and (number? %) %) (map teilbar (iterate #(+ % 20) 2520)))) 

;;;;;;;;;

Downgeladene lösung:
;(defn gcd [a b] (if (zero? b) a (recur b (mod a b))))
;(defn lcm [a b] (/ (* a b) (gcd a b)))

;(dotimes [_ 5] (time (problem5)))
;(defn problem5 [] (reduce #(lcm %1 %2) (range 1 21)))

Downgeladen bischen modifiziert speedtest:
;(dotimes [_ 5] (time (problem5-2)))
;(defn problem5-2 [] (reduce #(lcm %1 %2) (range 11 21)))




