package zackys.email.neo4j.ogm.session;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4jSessionFactory {

    //private final static SessionFactory sessionFactory = new SessionFactory("xenlon.c2j.ast.test.model");
    private final static SessionFactory sessionFactory = new SessionFactory("zackys.email.model");
    private static Neo4jSessionFactory factory = new Neo4jSessionFactory();

    public static Neo4jSessionFactory getInstance() {
        return factory;
    }

    private Neo4jSessionFactory() {
    }

    public Session getNeo4jSession() {
        return sessionFactory.openSession();
    }
}