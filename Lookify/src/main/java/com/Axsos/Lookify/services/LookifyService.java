package com.Axsos.Lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Axsos.Lookify.models.Lookify;
import com.Axsos.Lookify.repositories.LookifyRepository;


@Service
public class LookifyService {
	private final LookifyRepository Repo;
	
	public LookifyService(LookifyRepository repo) {
        this.Repo = repo;
    }
	public List<Lookify> allSongs() {
        return Repo.findAll();
    }
	public Lookify saveSong(Lookify song) {
		return Repo.save(song);
		
	}
	public Lookify songById(Long id) {
		 Optional<Lookify> optionalsong = Repo.findById(id);
	        if(optionalsong.isPresent()) {
	            return optionalsong.get();
	        } else {
	            return null;
	        }
	}
	public List<Lookify> Top10(){
		return Repo.findTop10ByOrderByRatingDesc();
	}
	public List<Lookify> byArtist(String artist){
		return Repo.findByArtistContaining(artist);
	}
	
	
	

}
