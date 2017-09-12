package zackys.email.app;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.session.Session;

import zackys.email.model.User;
import zackys.email.neo4j.ogm.session.Neo4jSessionFactory;

public class App01_SaveNode {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();

        List<User> users = new ArrayList<User>() {
            {
                this.add(new User("ID0001", "AAA", "a@xxx.co.jp", 25));
                this.add(new User("ID0002", "BBB", "b@xxx.co.jp", 32));
                this.add(new User("ID0003", "CCC", "c@xxx.co.jp", 53));
                this.add(new User("ID0004", "DDD", "d@xxx.co.jp", 44));
                this.add(new User("ID0005", "EEE", "e@xxx.co.jp", 32));
                this.add(new User("ID0006", "FFF", "f@xxx.co.jp", 56));
            }
        };

        users.stream().forEach(session::save);
    }

}
