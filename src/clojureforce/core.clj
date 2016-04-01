(ns clojureforce.core
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(def config-file (io/file (io/resource "oauth.yml")))

(str/split (slurp config-file) #"\n")

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
