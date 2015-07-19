(defproject clojure-getting-started "1.0.0-SNAPSHOT"
  :description "Demo Clojure web app"
  :url "http://clojure-getting-started.herokuapp.com"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [environ "0.5.0"]
                 [camel-snake-kebab "0.3.2"]
                 [clj-webdriver "0.6.1" :exclusion [com.github.detro.ghostdriver/phantomjsdriver
                                                    org.seleniumhq.selenium/selenium-server
                                                    org.seleniumhq.selenium/selenium-java
                                                    org.seleniumhq.selenium/selenium-remote-driver]]
                 [org.seleniumhq.selenium/selenium-server "2.46.0"]
                 [org.seleniumhq.selenium/selenium-java "2.46.0"]
                 [org.seleniumhq.selenium/selenium-remote-driver "2.46.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "clojure-getting-started-standalone.jar"
  :profiles {:production {:env {:production true}}})
