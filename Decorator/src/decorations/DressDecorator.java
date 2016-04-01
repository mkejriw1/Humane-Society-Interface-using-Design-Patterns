//Name: Archanaa R Sathyanarayana CWID: A20354423 Name: Mallika KejriwalCWID: A20365044
package decorations;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import animalcenter.Mammal;

public class DressDecorator extends MammalDecorator {
	
	Mammal mammal;
	int MID = 300, TOP = 100;
	
	public DressDecorator(Mammal m) {
		mammal = m;
	}

	@Override
	public JFrame draw() {
		JFrame f = new JFrame();		
		f.add(this);
		f.setSize(800, 800);
		f.setVisible(true);		
		return f;		
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
	
	@Override
	public void paint(Graphics page) {
		mammal.unBelt();
		mammal.dressUp();
		mammal.paint(page);
		System.out.println("Inside decorator paint");			    
	}
}
