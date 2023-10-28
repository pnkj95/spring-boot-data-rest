package com.spring.data.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource annotation is used to customize the rest end point i.e. if we want to change the endpoint path
//@RepositoryRestResource(collectionResourceRel = "users",path="userpath")
//To Change REST API Path
//@RepositoryRestResource(path = "users")
public interface WebsiteUserRepository extends JpaRepository<WebsiteUser, Long> {

	List<WebsiteUser> findByName(@Param("name") String name);
}
