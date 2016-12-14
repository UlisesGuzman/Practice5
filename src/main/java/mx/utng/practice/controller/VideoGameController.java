package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;


import mx.utng.practice.model.VideoGame;
import mx.utng.practice.model.VideoGame;
import mx.utng.practice.repository.VideoGameRepository;
import mx.utng.practice.repository.VideoGameRepository;

@Named
@ViewScoped
public class VideoGameController {
	
	
	@Autowired
	private VideoGameRepository videoGameRepository;
	
	private VideoGame videoGame = new VideoGame();
	private List<VideoGame> videoGames;

	private boolean editMode = false;

	@PostConstruct
	public void init(){
		setVideoGames(videoGameRepository.findAll());
	}
	
	public void save(){
		videoGameRepository.save(videoGame);
		if(!editMode){
			getVideoGames().add(videoGame);
		}
		videoGame = new VideoGame();
		setEditMode(false);
	}
	
	
	public void delete(VideoGame videoGame){
		videoGameRepository.delete(videoGame);
		videoGames.remove(videoGame);
	}
	
	public VideoGame getVideoGame(){
		return videoGame;
	}
	
	public void setVideoGame(VideoGame videoGame){
		this.videoGame = videoGame;
	}
	
	public void update(VideoGame videoGame){
		setVideoGame(videoGame);
		setEditMode(true);
	}
	
	public void cancel(){
		videoGame = new VideoGame();
		setEditMode(false);
	}

	public VideoGameRepository getGameRepository() {
		return videoGameRepository;
	}

	public void setGameRepository(VideoGameRepository videoGameRepository) {
		this.videoGameRepository = videoGameRepository;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	


}
