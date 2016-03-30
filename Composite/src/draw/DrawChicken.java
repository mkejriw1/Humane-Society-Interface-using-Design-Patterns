package draw;
import javax.swing.JApplet;


import java.awt.*;

public class DrawChicken extends JApplet
{
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

        }
}