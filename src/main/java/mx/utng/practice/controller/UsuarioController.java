package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Usuario;
import mx.utng.practice.repository.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	private Usuario usuario = new Usuario();
   private List<Usuario> usuarios;
   private boolean editMode = false;
   
   @PostConstruct
	public void init(){
	   setUsuarios(usuarioRepository.findAll());
	}
   
	public void save(){
		usuarioRepository.save(usuario);
		if(!editMode){
		 getUsuarios().add(usuario);
		}
		usuario = new Usuario();
		setEditMode(false);
		}
	
	public void delete(Usuario usuario){
		usuarioRepository.delete(usuario);
		usuarios.remove(usuario);
	}
	
	public void update(Usuario usuario){
		setUsuario(usuario);
		setEditMode(true);
	}
	public void cancel(){
		usuario = new Usuario();
		setEditMode(false);
	}

	public UsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}


	
	
}
