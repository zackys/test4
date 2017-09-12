package jp.co.tis.xenlon.testn.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Email extends Entity {

    String id;

    //@Relationship(type="SENT", direction=Relationship.OUTGOING)
    @Relationship(type="SENT", direction=Relationship.INCOMING)
    //@Relationship(type="SENT")
    Person sentBy;

    //@Relationship 無くても可（名前がTYPE名と一致するので）
    Set<Person> to;

    Set<Person> cc;

    Set<Person> bcc;

    String content;

    public String toString() {
        //return id + ":" + (sentBy == null ? "[EMPTY]" : sentBy.username);
        //return id + ":to " + to.stream().map(t->t.username).reduce("", (a, b)->{return a+b+",";});
        //return id + ":cc " + (cc == null ? "[EMPTY]" : cc.stream().map(t->t.username).reduce("", (a, b)->{return a+b+",";}));
        //return id + ":bcc " + (bcc == null ? "[EMPTY]" : bcc.stream().map(t->t.username).reduce("", (a, b)->{return a+b+",";}));
        return id + ":content " + (content == null ? "[EMPTY]" : content);
    }

    public void setSentBy(Person p) {
        sentBy = p;
    }

    public void addTo(Person p) {
        if (to == null) {
            to = new HashSet<>();
        }

        to.add(p);
    }

    public void addCc(Person p) {
        if (cc == null) {
            cc = new HashSet<>();
        }

        cc.add(p);
    }

    public void addBcc(Person p) {
        if (bcc == null) {
            bcc = new HashSet<>();
        }

        bcc.add(p);
    }
}
