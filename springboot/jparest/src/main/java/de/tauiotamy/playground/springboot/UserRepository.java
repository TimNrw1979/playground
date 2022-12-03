package de.tauiotamy.playground.springboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

//@RepositoryRestResource(collectionResourceRel = "users", path = "users")
//public interface UserRepository extends PagingAndSortingRepository<User, Long> {
//	List<User> findByName(@Param("name") String name);
//}

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByName(@Param("name") String name);
}