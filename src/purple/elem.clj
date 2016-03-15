(ns purple.elem
  (:require [clojure.java.jdbc :refer :all])
  (:refer-clojure :exclude (list get delete)))

(def db
  {:classname   "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname     "db/database.db"
   }
)

(defn list []
   (query db "select * from bookmark")
)

(defn get [id]
  (query db (str "select * from bookmark where id=" id))
)

(defn post [request]
  (let [dado (get-in request [:json-params])]
    (insert! db :bookmark {:url (get-in dado ["url"])})
  )
)

(defn put [request]
  (let [dado (get-in request [:json-params])]
    (update! db :bookmark {:url (get-in dado ["url"])} ["id = ?" (get-in dado ["id"])] )
  )
)

(defn delete [id]
  (delete! db :bookmark ["id = ?" id])
)