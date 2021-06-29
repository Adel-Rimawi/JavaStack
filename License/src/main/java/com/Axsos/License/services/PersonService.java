package com.Axsos.License.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Axsos.License.models.License;
import com.Axsos.License.models.Person;
import com.Axsos.License.repositories.LicenseRepository;
import com.Axsos.License.repositories.PersonRepository;

@Service
public class PersonService {
	private final LicenseRepository Repo;
	private final PersonRepository PersonRepo;
	
	
	
	public PersonService(LicenseRepository repo, PersonRepository personRepo) {
		Repo = repo;
		PersonRepo = personRepo;
	}
	public Person savePerson(Person person) {
		return PersonRepo.save(person);
	}
	
	public License saveLicense(License license) {
		license.setNumber(generateLicenseNumber());
		return Repo.save(license);
	}
	

	public List<Person> allPersons() {
		return  PersonRepo.findAll();
	}
	public int generateLicenseNumber() {
		License l = Repo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return Repo.save(l);
	}
	public List<Person> nullLicense(){
		return PersonRepo.findByLicenseIdIsNull();
	}
	public Person findPersonbyid(long id) {
        if(PersonRepo.findById(id).isPresent()) {
            return PersonRepo.findById(id).get();
        } else {
            return null;
        }
		
	}
	
	
	
}
