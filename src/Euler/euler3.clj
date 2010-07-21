(ns euler3)

;A palindromic number reads the same both ways. 
;The largest palindrome made from the product of 
;two 2-digit numbers is 9009 = 91  99.

;Find the largest palindrome made from the product of two 3-digit numbers.

(defn palindromic? [n]
  (let [s (str n)]
    (= (reverse s) (seq (str s)))))

(defn divable [n]
  (some true? (map #(when (and (zero? (mod n %)) (>=  (count (str (/ n %))) 3)) true) (reverse (range 100 1000)))))

(defn euler3 []
   (apply max (filter number? (map #(when (divable %) %) (filter number? (map #(when (palindromic? %) %) 
                  (for [a (reverse (range 100 1000)) b (reverse (range 100 1000))]
  (* a b))))))))
