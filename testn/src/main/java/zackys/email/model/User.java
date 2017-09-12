package zackys.email.model;

import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Transient;

public class User extends Entity {

    public User() {
    }



    public User(String userId, String name, String address, int age) {
        super();
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.age = age;
    }



    @Property
    String userId;

    @Property
    String name;

    @Index(unique=true, primary=true)
    @Property
    String address;

    @Transient
    int age;

    @Override
    public String toString() {
        return String.format("User[%s]:name=%s\t email=%s\t age=%d", userId, name, address, age);
    }

    @Relationship(type="DELONG_TO")
    Dpt dpt;

    public String getUserId() {
        return userId;
    }

    public void setDpt(Dpt dpt) {
        this.dpt = dpt;
    }
}
