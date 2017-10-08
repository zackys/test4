
### p31

1

```
CREATE (:Person {name:"長友", age:31})
CREATE (:Person {name:"平", age:32})
CREATE (:Person {name:"本田", age:31})
CREATE (:Person {name:"三瓶", age:41, job:"芸人"})
CREATE (:Team {name:"インテル"})
CREATE (:Team {name:"日本代表"});
```

---

### 2

2.
```
MATCH (n) RETURN n
```

```
MATCH (n:Person) RETURN n
```

```
MATCH (n:Person) RETURN n.name, n:age, n.job
```

```
MATCH (n:Person {age:32}) RETURN n.name AS name
```

