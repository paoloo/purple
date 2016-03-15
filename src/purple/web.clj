(ns purple.web
  (:use compojure.core)
  (:use ring.middleware.json-params)
  (:require [clj-json.core :as json])
  (:require [purple.elem :as elem]))

(defn json-response [data & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json"}
   :body (json/generate-string data)})

(defroutes handler
  (GET "/bookmark" [] (json-response (elem/list)))
  (GET "/bookmark/:id" [id] (json-response (elem/get id)))
  (POST "/bookmark" req (json-response (elem/post req)))
  (PUT "/bookmark" req (json-response (elem/put req)))
  (DELETE "/bookmark/:id" [id] (json-response (elem/delete id)))
)

(def app
  (-> handler
    wrap-json-params))
