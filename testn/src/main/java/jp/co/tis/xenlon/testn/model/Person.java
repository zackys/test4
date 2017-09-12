package jp.co.tis.xenlon.testn.model;

import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label="User")
public class Person extends Entity {

    @Index(unique=true, primary=true)
    String username;

    public String toString() {
        return username + ":" + getGraphId();
    }
}
