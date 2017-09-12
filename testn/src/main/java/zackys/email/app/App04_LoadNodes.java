package zackys.email.app;

import org.neo4j.ogm.session.Session;

import zackys.email.model.User;
import zackys.email.neo4j.ogm.session.Neo4jSessionFactory;

public class App04_LoadNodes {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();

        //session.loadAll(User.class).forEach(System.out::println);

        User user = session.load(User.class, "a@xxx.co.jp");
        System.out.println(user);


    }

}
