package jp.co.tis.xenlon.testn.model;

import org.neo4j.ogm.annotation.GraphId;

abstract class Entity {

    @GraphId
    private Long graphId;

    public Long getGraphId() {
        return graphId;
    }
}