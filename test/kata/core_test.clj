(ns kata.core-test
  (:require [clojure.test :refer :all]
            [kata.core :refer :all]))

;; morse -> text

(deftest a-test
  (testing "FIXED"
    (is (= 1 1))))

(deftest letter-is-grater-test
  (testing "letter-is-grater-test"
    (is (= (letter-is-grater "...." 3) false))))

(deftest wrapper-test
  (testing "letter-is-grater-test"
    (is (= (wrapper "...." 3) "3"))))

(deftest substring-test
  (testing "substring-test"
    (is (= (substring "...." 3) "..."))))

(deftest last-index-test
  (testing "last-index-test"
    (is (= (last-index "... ") 3))))

(deftest last-index-test
  (testing "last-index-test"
    (is (= (get-space ".... ---" 3) 3))))

;; .... --- .-.. .-    => Ho
