package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

	@Query("select property from Property property")
	public List<PropertyRepository> finAll();
}
