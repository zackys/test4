
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

### p32

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

