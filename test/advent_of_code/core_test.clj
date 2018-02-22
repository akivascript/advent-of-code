(ns advent-of-code.core-test
  (:require [clojure.test :refer :all]
            [advent-of-code.core :refer :all]))

(deftest day01-p1
  (is (= (day1-p1) 995)))

(deftest day01-p2
  (is (= (day1-p2) 1130)))

(deftest day02-p1
  (is (= (day2-p1) 37923)))

(deftest day02-p2
  (is (= (day2-p2) 263)))

(deftest day04-p1
  (is (= (day4-p1) 466)))

(deftest day04-p2
  (is (= (day4-p2) 251)))
