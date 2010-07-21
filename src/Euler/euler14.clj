(ns euler14)

(defn step [n]
  (if (even? n) (/ n 2) (inc (* n 3))))
 
(def memo-step (memoize step))
 
(defn collatz [n]
  [n (count (take-while (partial < 1) (iterate memo-step n)))])
 
(defn euler14 [max_num]
  (first (reduce #(if (> (nth %1 1) (nth %2 1)) 
                    %1 
                    %2) 
           (map #(collatz %) (range 3 (inc max_num))))))

;(dotimes [_ 5] (time (euler14 1000)))

"Elapsed time: 1747.691454 msecs"
"Elapsed time: 1694.556261 msecs"
"Elapsed time: 1564.054937 msecs"
"Elapsed time: 1652.250998 msecs"
"Elapsed time: 1654.000741 msecs"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
"Elapsed time: 1460.32679 msecs"
"Elapsed time: 1818.577814 msecs"
"Elapsed time: 1991.292489 msecs"
"Elapsed time: 1859.995739 msecs"
"Elapsed time: 1882.248621 msecs"
