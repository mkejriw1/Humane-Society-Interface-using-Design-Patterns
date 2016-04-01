//Name: Archanaa R Sathyanarayana CWID: A20354423 Name: Mallika KejriwalCWID: A20365044
package animalcenter;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Chicken extends Birds{
	
	Chicken(String name, Long ID, int age, String type, String breed, boolean adopt, String medical, String notes) {
		this.id = ID;
		this.name = name ;
		this.type = type;
		this.breed = breed;
		this.age = age;		
		this.readyForAdoption = adopt;
		this.medicalCondition = medical;
		this.notes = notes;
	}

	@Override
	public JFrame draw(){
		JFrame f = new JFrame();		
		f.add(this);
		f.setSize(800, 800);
		f.setVisible(true);
		noWings();
		return f;
	}

	public void paint (Graphics page)
    {

    final int MID = 300;
    final int TOP = 100;


    setBackground (Color.green);

    page.setColor (Color.white);

    //Draws the up body
    page.setColor (Color.red);
    page.fillOval (MID-70, TOP+70, 120, 100);
    
    //draws down body 
    page.setColor (Color.yellow);
    page.fillOval (MID-80, TOP+170, 150, 150);
    page.setColor (Color.black);
    page.drawString("Animal Name: "+getName(), 100, 100);
    page.drawString("Animal type: "+getType(), 300, 100);
    page.drawString("Ready for adoption: "+isReadyForAdoption().toString(), 100, 130);
    page.drawString("Medical condition: "+getMedicalCondition(), 300, 130);
    page.drawString("Picture of the animal:", 100, 140);
    page.drawString("Notes: "+getNotes(), 100, 400);
    
    // Adds the name to the body
    page.setColor (Color.black);
    page.drawString ("I am a Chicken! ", 260, 340);


    //Draws the eye
    page.setColor (Color.black);
    page.fillOval (MID+0, TOP+100, 12, 12);
    
    page.setColor (Color.black);
    page.fillOval (MID-40, TOP+100, 12, 12);
    
    //draw the legs 
    page.setColor (Color.black);
    page.fillRect (MID-40, TOP+310, 10, 30);
    
    page.setColor (Color.black);
    page.fillRect (MID+10, TOP+310, 10, 30);
    
    if (newWings){
    	page.setColor (Color.black);
        page.fillOval (MID-135, TOP+220, 65, 35);
        
        page.setColor (Color.black);
        page.fillOval (MID+60, TOP+220, 65, 35);
	  
    	
    }

        }
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		
	}

}
