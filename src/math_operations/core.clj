(ns math-operations.core
  (:gen-class))

(defn exp
  "Simple exponential function using loop"
  [num exponent]
  (loop [result 1 e exponent]
    (if (zero? e)
      result
      (recur (* result num) (dec e)))))

(defn exp-improved
  "Exponential function using reduce"
  [num exponent]
  (reduce * (repeat exponent num)))

(defn factorial
  "Factorial function using loop"
  [num]
  (if (zero? num)
    1
    (loop [product num multiplier (dec num)]
      (if (> multiplier 1)
        (recur (* product multiplier) (dec multiplier))
        product))))

(defn factorial-improved
  "Factorial function using reduce"
  [num]
  (if (zero? num)
    1
    (reduce * (range 1 (inc num)))))
