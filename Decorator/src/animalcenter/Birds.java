//Name: Archanaa R Sathyanarayana CWID: A20354423 Name: Mallika KejriwalCWID: A20365044
package animalcenter;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Birds extends JPanel implements Animal {
	Long id;
	String name;
	String breed;
	int age = 5;
	Boolean readyForAdoption;
	String type;
	String medicalCondition;
	String notes;
	String birdDetails;
	boolean newWings = false;
	
	public void newWings() {
		newWings = true;
	}
	public void noWings() {
		newWings = false;
	}
	
	
	
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
    	draw();
        return null;
    }
	
	public void fly() {
	
	}	
	
}
