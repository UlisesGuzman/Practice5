package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.VideoGame;

@Repository
public interface VideoGameRepository 
extends JpaRepository<VideoGame, Long>{ 
	@Query ("select videoGame from VideoGame videoGame")
	public List<VideoGame> findAll();
	

}