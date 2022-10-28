// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        int z = 10;
        int k = 640;
        g.drawRect(10,10,width,height);
        for(int x = 0; x < 950; x+=15)
        {
            g.drawLine(x1,y1,x2,y2);
            x1+=15;
            y2-=10;
        }
        x1 = 10;
        y2 = 640;
        for(int x = 0;x < 950; x+=15)
        {
            g.drawLine(x2,y2,x1,y1);
            x2-=15;
            y1-=10;
        }
        x2 = 990;
        y1 = 10;
        y2 = 10;
        for (int x = 0; x < 950; x+=15)
        {
            g.drawLine(x1,y1,x2,y2);
            x1+=15;
            y2+=10;

        }
        x1 = 10;
        y2 = 10;
        for (int x = 0; x < 950; x+=15)
        {
            g.drawLine(x2,y2,x1,y1);
            x2-=15;
            y1+=10;
        }
    }
}
