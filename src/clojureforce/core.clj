(ns clojureforce.core
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(def config-file (io/file (io/resource "oauth.yml")))

(def lines (map-indexed vector (str/split (slurp config-file) #"\n")))

(for [line lines]
  (println (last line)))

(for [line (str/split (slurp config-file) #"\n")]
  (println line))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
