(ns euler14-not-my-solution)

(defn vl [n]
  (if (even? n)
    (/ n 2)
    (inc (* 3 n))))
 
(defn dist [n chain]
  (if (< n 2)
    chain
    (if (= n 2)
      (inc chain)
      (recur (vl n) (inc n)))))
 
(def dist-memo (memoize dist))
 
(defn E14 [limit]
  (loop [n 2 longest-chain 0 wanted-number 1]
    (if (<= limit n)
      (println "Done. longest chain under" limit "is:" longest-chain
               "starting at" wanted-number)
      (let [new-longest-chain (max longest-chain (dist-memo n 0))]
        (recur (inc n)
               new-longest-chain
               (if (= longest-chain new-longest-chain)
                 wanted-number
                 n))))))

(defn test [a b]
  (for [x (range 1 a) y (range 1 b)] [x y (bit-xor x y)]))

;(time (E14 1000000))