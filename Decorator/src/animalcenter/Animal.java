//Name: Archanaa R Sathyanarayana CWID: A20354423 Name: Mallika KejriwalCWID: A20365044
package animalcenter;

import java.awt.Graphics;

import javax.swing.JFrame;

public interface Animal {
	
    public JFrame draw();
    public void move();    
	public void eat();
	public void sleep();
	public void makeNoise();
	public String getType();
	public String getBreed();
    public String getName();
    public Long getId();
}    
    
    