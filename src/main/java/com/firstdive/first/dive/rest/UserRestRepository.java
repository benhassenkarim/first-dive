package com.firstdive.first.dive.rest;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users", collectionResourceRel="users")
public interface UserRestRepository extends PagingAndSortingRepository<User, Long>{
List<User>findByRole(String Role);
	
}
