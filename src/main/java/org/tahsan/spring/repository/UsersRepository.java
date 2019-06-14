package org.tahsan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tahsan.spring.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByName(String name);

	Users getById(Long id);

}
