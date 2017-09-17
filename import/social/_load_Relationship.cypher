LOAD CSV WITH HEADERS FROM "file:///social/User_Company.csv" AS line
MATCH (n1:User {userId:line.userId}), (n2:Company {companyId:line.companyId})
CREATE (n1)-[:WORKS_FOR]->(n2)
UNION
LOAD CSV WITH HEADERS FROM "file:///social/User_Project.csv" AS line
MATCH (n1:User {userId:line.userId}), (n2:Project {projectId:line.projectId})
CREATE (n1)-[:WORKED_ON]->(n2)
UNION
LOAD CSV WITH HEADERS FROM "file:///social/User_Interest.csv" AS line
MATCH (n1:User {userId:line.userId}), (n2:Interest {interestId:line.interestId})
CREATE (n1)-[:INTERESTED_IN]->(n2);
