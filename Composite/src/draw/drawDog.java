package draw;
import javax.swing.JApplet;

import java.awt.*;

public class drawDog extends JApplet
{
    public void paint (Graphics page)
    {

    final int MID = 300;
    final int TOP = 100;


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


     //Draws the tail
    page.setColor (Color.black);
   page.drawArc(MID+275, TOP+90, 140, 75 ,190 , 110);

    //Draws the eye
    page.setColor (Color.yellow);
    page.fillOval (MID+0, TOP+100, 12, 12);

    //Draws the mouth
    page.setColor(Color.white);
    page.drawArc (MID-68, TOP+105, 75, 30, 190, 110);
        }
}