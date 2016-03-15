# purple
A Clojure RESTful API for CRUD operations in a SQLite3 database

An educational experiment on designing an API to provide CRUD operations for a SQLite3 database. The original concept is to cache RESTful control calls to Raspberry Pi's GPIO (where a servo is connected) and, later, provide movimentation and sensors' data for a neural network in order to "learn" the movimentation and perform it by itself.

This is a simple bookmark application. The SQLite database was created with a single statement:
```
CREATE TABLE bookmark(id integer primary key, url text);
```

#### OPERATIONS

### CREATE:
```bash
curl -X POST -H "Content-Type: application/json" -d '{"url": "paoloo.github.io"}' http://localhost:8080/bookmark
```
### READ:
```bash
curl http://localhost:8080/bookmark
```
### UPDATE:
```bash
curl -X PUT -H "Content-Type: application/json" -d '{"id":11, "url": "www.bb.com"}' http://localhost:8080/bookmark
```
### DELETE:
```bash
curl -X DELETE http://localhost:8080/bookmark/2
```

