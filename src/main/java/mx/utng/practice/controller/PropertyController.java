package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Property;
import mx.utng.practice.repository.PropertyRepository;



@Named
@ViewScoped
public class PropertyController {

	@Autowired
	private PropertyRepository propertyRepository;
	private Property property = new Property();
   private List<Property> properties;
   private boolean editMode = false;
   
   @PostConstruct
	public void init(){
	   setProperties(propertyRepository.findAll());
	}
   
	public void save(){
		propertyRepository.save(property);
		if(!editMode){
		 getProperties().add(property);
		}
		property = new Property();
		setEditMode(false);
		}
	
	public void delete(Property property){
		propertyRepository.delete(property);
		properties.remove(property);
	}
	
	public void update(Property property){
		setProperty(property);
		setEditMode(true);
	}
	public void cancel(){
		property = new Property();
		setEditMode(false);
	}

	public PropertyRepository getPropertyRepository() {
		return propertyRepository;
	}

	public void setPropertyRepository(PropertyRepository propertyRepository) {
		this.propertyRepository = propertyRepository;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
}



