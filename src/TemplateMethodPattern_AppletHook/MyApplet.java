package TemplateMethodPattern_AppletHook;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet{

    String message;

    //钩子init()
    public void init(){
        message = "Hello World,I'm alive";
        repaint();
    }

    //钩子start()
    public void start(){
        message = "Now I'm starting up...";
        repaint();
    }

    //钩子stop()
    public void stop(){
        message = "Oh,now I'm being stopped";
        repaint();
    }

    //钩子destroy()
    public void destroy(){

    }

    //钩子paint()
    public void paint(Graphics graphics){
        graphics.drawString(message,5,15);
    }

}
