(ns euler9)

A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
a hoch 2 + b hoch 2 = c hoch 2

For example, 3 hoch 2 + 4 hoch 2 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

Lösung: 31875000

(def quards
     (for [i (range 1 (inc 1000))]
       [i (* i i)]))



 
