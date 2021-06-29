package com.Axsos.License.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.Axsos.License.models.Person;

@Service
public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();
	List<Person> findByLicenseIdIsNull();
}
