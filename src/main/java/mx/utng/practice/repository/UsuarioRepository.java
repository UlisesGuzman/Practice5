package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query("select usuario from Usuario usuario")
	public List<Usuario> findAll();
}
