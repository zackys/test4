# ハンズオン

## Neo4j Browser（１）

Cypherクエリの実行は、「Neo4j Browser」を使って行います。

* Neo4j Browserの起動手順
  * Neo4jのコンソールアプリケーション(Neo4jサーバ)を起動
  * http://localhost:7474 へアクセス
    * 認証画面が表示された場合は、以下を入力
      * user:neo4j
      * password:インストール時に設定したパスワード

---

## Neo4j Browser（２）

画面最上部の入力欄よりCypherクエリを入力していきます。

画面右側の★印を押下して下さい。

---

## Neo4j Browser（１）

---

## ステートメント - CREATE

### p30

1.
```
CREATE (:Person {name:"長友", age:31})
CREATE (:Person {name:"平", age:32})
CREATE (:Person {name:"本田", age:31})
CREATE (:Person {name:"三瓶", age:41, job:"芸人"})
CREATE (:Team {name:"インテル"})
CREATE (:Team {name:"日本代表"});
```

---

## ステートメント - MATCHとRETURN

### p31

2.
```
MATCH (n) RETURN n
```
3.
```
MATCH (n:Person) RETURN n
```
4.
```
MATCH (n:Person) RETURN n.name, n:age, n.job
```
5.
```
MATCH (n:Person {age:32}) RETURN n.name AS name
```

---

## ステートメント - WHERE

### p32

5.
```
MATCH (n:Person)
 WHERE n.age = 32
 RETURN n.name AS name, n.age AS age
```
6.
```
MATCH (n:Person)
 WHERE n.age > 40
 RETURN n.name AS name, n.age AS age
```

---

## ステートメント - CREATE（２）

### p33

7.
```
CREATE (:Person {name:"香川", age:28})
          -[:MEMBER_OF]->
       (:Team {name:"ドルトムント"})
```
8.
```
MATCH (x:Person {name:"長友"}),
      (y:Person {name:"平"})
  CREATE (y)-[:MARRIED {at:2017}]->(x)
```

---

## ステートメント - CREATE（３）

### p35

9.
```
MATCH (nagatomo:Person {name:"長友"}),
      (taira:Person {name:"平"}),
      (sanpei:Person {name:"三瓶"}),
      (honda:Person {name:"本田"}),
      (japan:Team {name:"日本代表"}),
      (intel:Team {name:"インテル"})
CREATE (taira)-[:KNOWS]->(sanpei)
CREATE (nagatomo)-[:MEMBER_OF {since:2011}]->(intel)
CREATE (nagatomo)-[:MEMBER_OF {at:[2010,2014]}]->(japan)
CREATE (honda)-[:MEMBER_OF {at:[2010,2014]}]->(japan)
```

---

## ステートメント - SET

### p36

10.
```
MATCH (n:Person {name:"香川"})
 SET n.from = "兵庫"
```

11.
```
MATCH (n:Person {name:"香川"})
 SET n.from = "神戸"
```
---

## ステートメント - REMOVE

### p37

12.
```
MATCH (n:Person {name:"香川"})
 REMOVE n.from
```

---

## ステートメント - DELETE

### p37

12.
```
MATCH (x:Person {name:"香川"})-[r]->
      (y:Team {name:"ドルトムント"})
 DELETE r
```

13.
```
MATCH (n:Person {name:"香川"})
 DELETE n
```
