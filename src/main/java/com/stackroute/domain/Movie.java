package com.stackroute.domain;

import lombok.*;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {

    @Id
    private int id;
    private String title;
    private String director;


}
