package com.Axsos.Languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Axsos.Languages.models.Language;
import com.Axsos.Languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository Repo;
	
	public LanguageService(LanguageRepository repo) {
		this.Repo = repo;
	}
	
	 public List<Language> allLanguages() {
	        return Repo.findAll();
	    }
	 public Language findLanguageById(Long id) {
		 Optional<Language> optionallang = Repo.findById(id);
	        if(optionallang.isPresent()) {
	            return optionallang.get();
	        } else {
	            return null;
	        }
	 }
	 public Language SaveLang(Language lang) {
		 Repo.save(lang);
		 return lang;
	 }
	 public  void deletelang(Long id) {
		 Repo.deleteById(id);
	 }

	 

}
