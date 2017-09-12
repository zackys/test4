package zackys.email.app;

import java.util.Collections;

import org.neo4j.ogm.session.Session;

import zackys.email.neo4j.ogm.session.Neo4jSessionFactory;

public class App02_ExecuteQuery1 {

    public static void main(String[] args) {
        Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();

        session.query("MATCH (n) DETACH DELETE n", Collections.emptyMap());
    }

}
