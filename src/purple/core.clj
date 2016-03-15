(ns purple.core
  (:use ring.adapter.jetty)
  (:require [purple.web :as web]))

(run-jetty #'web/app {:port 8080})
