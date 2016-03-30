package draw;
import javax.swing.JApplet;
import java.awt.*;
public class DrawSparrow extends JApplet
{
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
        }
}