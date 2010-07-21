(ns euler10)

;The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;Find the sum of all the primes below two million.

(use 'clojure.contrib.math)

(defn nextprim [x]
  (if (< x 2) 2 
(loop [nextprim x, div 2, start x]
    (if (= (mod nextprim div) 0) 
(defn prim-coll []
  (iterate nextprim 2))
        (recur (inc nextprim) 2 start) 
        (if (> div (sqrt nextprim)) 
          (if (> nextprim start) 
            nextprim 
            (recur (inc nextprim) 2 start)) 
          (recur nextprim (inc div) start))))))
  

(defn prim-coll []
  (iterate nextprim 2))

(defn euler10 []
  (reduce + (take-while #(< % 20000) (prim-coll))))

Einfache Lösung: 142913828922
(use 'clojure.contrib.lazy-seqs)
(reduce + (take-while #(< % 20000) primes)) 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?





