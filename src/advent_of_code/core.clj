(ns advent-of-code.core
  (:require [advent-of-code.day1 :as day1]
            [advent-of-code.day2 :as day2]
            [advent-of-code.day4 :as day4])
  (:gen-class))

(defn day1-p1
  []
  (day1/captcha-next day1/input))

(defn day1-p2
  []
  (day1/captcha-half day1/input))

(defn day2-p1
  []
  (day2/checksum day2/input))

(defn day2-p2
  []
  (day2/checksum-div day2/input))

(defn day4-p1
  []
  (day4/count-valid day4/input))

(defn day4-p2
  []
  (day4/count-valid-anagram day4/input))

(defn -main
  [& args]
  (day1-p1)
  (day1-p1)
  (day2-p1)
  (day2-p2)
  (day4-p1)
  (day4-p2))
