//Name: Archanaa R Sathyanarayana CWID: A20354423 Name: Mallika KejriwalCWID: A20365044
package animalcenter;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dog extends Mammal{
	
	final int MID = 300;
    final int TOP = 100;    
	
	Dog(String name, Long ID, int age, String type, String breed, boolean adopt, String medical, String notes) {
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
	
	public JFrame draw(){
		JFrame f = new JFrame();		
		f.add(this);
		f.setSize(800, 800);
		f.setVisible(true);	
		unDress();
		unBelt();
		return f;
	}	
	
	@Override
	public void paint (Graphics page) {				    
	    
	    setBackground (Color.green);

	    page.setColor (Color.white);

	    //Draws the front body
	    page.setColor (Color.blue);
	    page.fillRect (MID-70, TOP+70, 120, 100);
	    
	    //draws back body 
	    page.setColor (Color.yellow);
	    page.fillRect (MID+50, TOP+60, 250, 150);	    
	    
	    // Adds the name to the body
	    page.setColor (Color.black);
	    page.drawString ("I am a Dog ! ", 465, 240);

	    //draw the legs 
	    page.setColor (Color.black);
	    page.fillRect (MID+50, TOP+200, 30, 80);
	    
	    page.setColor (Color.black);
	    page.fillRect (MID+100, TOP+200, 30, 80);
	    
	    page.setColor (Color.black);
	    page.fillRect (MID+200, TOP+200, 30, 80);
	    
	    page.setColor (Color.black);
	    page.fillRect (MID+240, TOP+200, 30, 80);

	    page.drawString("Animal Name: "+getName(), 100, 100);
	    page.drawString("Animal type: "+getType(), 300, 100);
	    page.drawString("Ready for adoption: "+isReadyForAdoption().toString(), 100, 130);
	    page.drawString("Medical condition: "+getMedicalCondition(), 300, 130);
	    page.drawString("Picture of the animal:", 100, 150);
	    page.drawString("Notes: "+getNotes(), 100, 400);
	    
	     //Draws the tail
	    page.setColor (Color.black);
	    page.drawArc(MID+275, TOP+90, 140, 75 ,190 , 110);

	    //Draws the eye
	    page.setColor (Color.yellow);
	    page.fillOval (MID+0, TOP+100, 12, 12);

	    //Draws the mouth
	    page.setColor(Color.white);
	    page.drawArc (MID-68, TOP+105, 75, 30, 190, 110);
	    
	    if(beltup) {
	    	//adding bell decoration
		  	page.setColor(Color.red);
		  	page.drawArc (300, 226, 70, 71 ,190 , 100);
		  	page.drawArc (300, 227, 70, 71 ,190 , 110);    
		  	page.drawArc (300, 228, 70, 71 ,190 , 110);  
		  	page.drawArc (300, 229, 70, 71 ,190 , 110);        
		  	page.fillOval (320, 293, 17, 17);
		  	    
		  	//add tail decoration
		  	page.setColor(Color.magenta);
		  	page.fillOval (677, 245, 23, 19);  //horizontal
		  	page.fillOval (673, 239, 19, 25);  //vertical
	    }
	    
	    if(dressup) {
	    	page.setColor(Color.pink);	    
		    page.fillRect (MID+90, TOP+60, 10, 150); 
		    page.setColor(Color.magenta);
		    page.fillRect (MID+100, TOP+60, 150, 150);  
		    page.setColor(Color.pink);	    
		    page.fillRect (MID+250, TOP+60, 10, 150); 
		    page.setColor (Color.black);
		    page.drawString ("I am a wearing a dress ! ", 410, 260);
		    page.drawString ("I am a Dog ! ", 410, 240);
	    }	   
	  }
		
	}


