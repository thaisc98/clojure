(ns kata.core
  (:gen-class)
  (:use [clojure.string :only (last-index-of)]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn letter-is-grater [letter col]
  (<= (count letter) col))

(defn substring [letter col]
  (subs letter 0 col))

(defn last-index [letter]
  (last-index-of letter " "))

(defn get-space [letter col]
  (last-index (subs letter 0  col)))


(defn wrapper [letter col]
  (if (letter-is-grater letter col) (str letter) (str col)))