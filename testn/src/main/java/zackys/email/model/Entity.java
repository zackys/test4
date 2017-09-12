package zackys.email.model;

import org.neo4j.ogm.annotation.GraphId;

abstract class Entity {

    @GraphId
    private Long id;

    public Long getId() {
        return id;
    }
}