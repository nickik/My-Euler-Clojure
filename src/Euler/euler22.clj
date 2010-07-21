(ns euler22)

For example, when the list is sorted into alphabetical order, 
COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
So, COLIN would obtain a score of 938  53 = 49714.

(defn word [s]
  (reduce + (map #(- (int %) 64) s)))

(defn euler22 []
  (reduce + 
    (map #(* %1 %2) 
      (map #(word %) (sort (re-seq #"[\w]+" (slurp "/home/nick/names.txt")))) 
      (iterate inc 1))))

