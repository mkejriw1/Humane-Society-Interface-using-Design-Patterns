package animalcenter;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Mammal extends JPanel implements Animal  {
	Long id;
	String name;
	String breed;
	int age;
	Boolean readyForAdoption;
	String type;
	String medicalCondition;
	String notes;
	String mammalDetails;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Boolean isReadyForAdoption() {
		return readyForAdoption;
	}
	public void setReadyForAdoption(boolean readyForAdoption) {
		this.readyForAdoption = readyForAdoption;
	}
	public String toString(){
    	
    	StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");        
        result.append("AnimaL Name: " + this.getName() + "\tAnimaL Type: "+ this.getType() +NEW_LINE);
        result.append("Ready for adoption " + this.isReadyForAdoption() + "\tMedical Condition: "+ this.getMedicalCondition() +NEW_LINE);
    	result.append("Notes: "+this.getNotes()+"\tAnimal ID: "+this.getId());
    	//System.out.println("anial is of type " + this.getClass());
    	mammalDetails = result.toString();
    	draw();
        return result.toString();
    }
	
}
