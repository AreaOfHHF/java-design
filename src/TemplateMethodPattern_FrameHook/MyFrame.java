package TemplateMethodPattern_FrameHook;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }

    //钩子
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I Love You!";
        graphics.drawString(msg,100,100);
    }

}
