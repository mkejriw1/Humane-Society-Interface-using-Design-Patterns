//Name: Archanaa R Sathyanarayana CWID: A20354423 Name: Mallika KejriwalCWID: A20365044
package animalcenter;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Sparrow extends Birds {
	
	Sparrow(String name, Long ID, int age, String type, String breed, boolean adopt, String medical, String notes) {
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

    //Draws the body
    page.setColor (Color.magenta);
    page.fillOval (MID-70, TOP+70, 360, 120);

    // Adds the name  to the body
    page.setColor (Color.black);
    page.drawString ("I like to fly!!", 365, 240);

    //Draws the wings
    page.setColor (Color.yellow);
    page.fillOval (MID+75, TOP-40, 85, 145);
    
    page.setColor (Color.yellow);
    page.fillOval (MID+75, TOP+150, 85, 145);

    //Draws the eye
    page.setColor (Color.yellow);
    page.fillOval (MID+0, TOP+100, 12, 12);

    //Draws the mouth
    page.setColor(Color.white);
    page.drawArc (MID-68, TOP+105, 75, 30, 190, 110);
    page.setColor (Color.black);
    page.drawString("Animal Name: "+getName(), 50, 100);
    page.drawString("Animal type: "+getType(), 200, 100);
    page.drawString("Ready for adoption: "+isReadyForAdoption().toString(), 50, 130);
    page.drawString("Medical condition: "+getMedicalCondition(), 200, 130);
    page.drawString("Picture of the animal:", 50, 150);
    page.drawString("Notes: "+getNotes(), 100, 500); 
    
    if (newWings){
    	//adding new wings
    	page.setColor (Color.black);
        page.fillOval (MID+150, TOP-40, 65, 155);
        
        page.setColor (Color.black);
        page.fillOval (MID+150, TOP+150, 65, 155);
	  
    	
    	
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
