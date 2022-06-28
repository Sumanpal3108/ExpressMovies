package com.example.infygo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String>{
	//@Query(value = "select * from movie", nativeQuery = true)
	Optional<Movie> findBymovieTitle(String MovieTitle);

	
	
}