(ns clojure-getting-started.web-test
  (:require [clojure.test :refer :all]
            [ring.adapter.jetty :refer [run-jetty]]
            [clj-webdriver.taxi :refer :all]
            [clojure-getting-started.web :refer :all]
            [clojure-getting-started.config :refer :all]))

(deftest first-test
  (is true "Tests are now written!"))

(defn start-server []
  (run-jetty app {:port test-port, :join? false}))

(defn stop-server [server]
  (.stop server))

(defn start-browser []
  (set-driver! {:browser :firefox}))

(defn stop-browser [] (quit))

(deftest homepage-greeting
  (let [server (start-server)]
    (start-browser)
    (to test-base-url)
    (is (= (text "body") (pr-str ["Hello" :from 'Heroku])))
    (stop-browser)
    (stop-server server)))



