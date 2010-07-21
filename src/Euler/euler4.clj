(ns euler4)

;A palindromic number reads the same both ways.
;The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
;Find the largest palindrome made from the product of two 3-digit numbers.

(defn pali? [n]
  (let [s (seq (str n))]
    (when (= s (reverse s)) n)))

(defn faktor [n]
  )

(defn euler4 []
  (map faktor (filter number? (map pali? (iterate dec (* 999 999))))))
