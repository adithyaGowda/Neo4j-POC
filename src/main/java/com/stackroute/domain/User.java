package com.stackroute.domain;


import lombok.*;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    private int id;
    private String name;
    private int age;

    @Relationship(type = "RATED", direction = Relationship.INCOMING)
    private List<Movie> movie;


}
