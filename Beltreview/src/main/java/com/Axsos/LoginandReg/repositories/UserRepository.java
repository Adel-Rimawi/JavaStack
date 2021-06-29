package com.Axsos.LoginandReg.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Axsos.LoginandReg.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);

}
