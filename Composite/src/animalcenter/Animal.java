package animalcenter;

import java.awt.Graphics;

public interface Animal {
	
    public void draw();
    public void move();    
	public void eat();
	public void sleep();
	public void makeNoise();
	public String getType();
	public String getBreed();
    public String getName();
    public Long getId();
}    
    
    