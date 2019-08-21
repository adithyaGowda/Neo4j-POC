package com.stackroute.repository;

import com.stackroute.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends Neo4jRepository<User,Integer> {

    @Query("MATCH (u:User) <- [r:RATED]-(m:Movie) RETURN u,r,m")
    Collection<User> getAllUsers();

    @Query("CREATE(m:Movie)-[:RATED {rating: {rating}]->(u:User)")
    User setRelation(@Param("rating") int rating);

}
