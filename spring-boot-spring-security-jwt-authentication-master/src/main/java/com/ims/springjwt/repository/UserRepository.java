package com.ims.springjwt.repository;

import java.util.List;
import java.util.Optional;

import com.ims.springjwt.models.Materials;
import com.ims.springjwt.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Optional<User> findByEmail(String email);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	@Query(value ="select * from users INNER JOIN user_roles ur on users.id = ur.user_id where role_id = 1",nativeQuery = true)
	List<User> fetchUser();


}
