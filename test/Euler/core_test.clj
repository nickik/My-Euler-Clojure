(ns Euler.core-test
  (:use [Euler.core] :reload-all)
  (:use [clojure.test]))

(deftest firsteulertest
  (is (= [1 2 3] (firstfunc))))
