(ns euler16)

;2 hoch 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
;What is the sum of the digits of the number 2 hoch 1000?

(defn hoch [x hoch]
  (reduce * (repeat hoch x)))
  
(defn euler16 [sqer]
  (reduce #(+ (Integer. (str %1)) (Integer. (str %2))) (seq (str (hoch 2 sqer)))))

;(dotimes [_ 5] (time (euler16 1000)))

"Elapsed time: 56.950992 msecs"
"Elapsed time: 58.063221 msecs"
"Elapsed time: 38.738311 msecs"
"Elapsed time: 15.212841 msecs"
"Elapsed time: 13.548656 msecs"

;(dotimes [_ 5] (time (reduce + (map #(-> % int (- 48)) (-> 1 (bit-shift-left 1000) str)))))

"Elapsed time: 3.59042 msecs"
"Elapsed time: 10.262813 msecs"
"Elapsed time: 2.637081 msecs"
"Elapsed time: 5.061496 msecs"
"Elapsed time: 2.238635 msecs"

;(dotimes [_ 5] (time (reduce + (map #(Integer. (str %)) (str (.pow (BigInteger. "2") 1000))))))

"Elapsed time: 3.263353 msecs"
"Elapsed time: 2.282146 msecs"
"Elapsed time: 5.701455 msecs"
"Elapsed time: 4.509537 msecs"
"Elapsed time: 14.544529 msecs"