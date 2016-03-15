(defproject purple "0.0.1"
    :description "A Clojure RESTful API for CRUD operations in a SQLite3 database."
    :dependencies
      [[org.clojure/clojure "1.8.0"]
            [org.clojure/clojure-contrib "1.2.0"]
            [ring/ring-jetty-adapter "0.2.5"]
            [ring-json-params "0.1.0"]
            [compojure "1.1.8"]
            [org.clojure/java.jdbc "0.3.5"]
            [org.xerial/sqlite-jdbc "3.7.2"]
            [clj-json "0.2.0"]]
    :dev-dependencies
      [[lein-run "1.0.0-SNAPSHOT"]]
    :main ^:skip-aot purple.core
)
