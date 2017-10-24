```
LOAD CSV WITH HEADERS FROM "file:///social/Person.csv" AS line
CREATE (:Person {personId:line.id, name:line.name, age:line.age})
UNION
LOAD CSV WITH HEADERS FROM "file:///social/Company.csv" AS line
CREATE (:Company {companyId:line.id, name:line.name})
UNION
LOAD CSV WITH HEADERS FROM "file:///social/Project.csv" AS line
CREATE (:Project {projectId:line.id, name:line.name})
UNION
LOAD CSV WITH HEADERS FROM "file:///social/Interest.csv" AS line
CREATE (:Interest {interestId:line.id, name:line.name})
```
```
LOAD CSV WITH HEADERS FROM "file:///social/WORKS_FOR.csv" AS line
MATCH (n1:Person {personId:line.personId}), (n2:Company {companyId:line.companyId})
CREATE (n1)-[:WORKS_FOR]->(n2)
UNION
LOAD CSV WITH HEADERS FROM "file:///social/WORKED_ON.csv" AS line
MATCH (n1:Person {personId:line.personId}), (n2:Project {projectId:line.projectId})
CREATE (n1)-[:WORKED_ON]->(n2)
UNION
LOAD CSV WITH HEADERS FROM "file:///social/INTERESTED_IN.csv" AS line
MATCH (n1:Person {personId:line.personId}), (n2:Interest {interestId:line.interestId})
CREATE (n1)-[:INTERESTED_IN]->(n2)
```
