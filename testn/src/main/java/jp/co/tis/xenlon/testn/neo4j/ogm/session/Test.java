package jp.co.tis.xenlon.testn.neo4j.ogm.session;

import java.util.Collection;
import java.util.Collections;

import org.neo4j.ogm.model.Result;
import org.neo4j.ogm.session.Session;

import jp.co.tis.xenlon.testn.model.Email;
import jp.co.tis.xenlon.testn.model.Person;

public class Test {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();


        Collection<Person> ps = session.loadAll(Person.class);
        ps.stream().forEach(System.out::println);

        Collection<Email> emails = session.loadAll(Email.class);
        emails
        .stream().forEach(System.out::println);

        Person sent = session.load(Person.class, "Alice");
        System.out.println(sent);

        Person to1 = session.load(Person.class, "Bob");
        System.out.println(to1);

        Result res = session.query("MATCH (m:Email) return max(toInt(m.id)) as lastId;", Collections.emptyMap());
        res.forEach((map)->{
            map.keySet().stream().forEach(key->{System.out.println(key + ":" + map.get(key));});
        });

        int lastId = session.queryForObject(int.class, "MATCH (m:Email) return max(toInt(m.id)) as lastId;", Collections.emptyMap());
        System.out.println(lastId);

//        Email email = new Email();
//        email.setSentBy(sent);
//        email.addTo(to1);
//
//        session.save(object);

    }

}
