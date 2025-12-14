package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.User;

@Repository //nesse caso é opcional registrar o componente porque já tem o extends abaixo que indica que herda do JPA
public interface UserRepository extends JpaRepository<User, Long> {

}
