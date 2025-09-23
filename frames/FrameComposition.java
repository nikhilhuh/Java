package frames;

import java.awt.*;
import java.awt.event.*;

public class FrameComposition {
        public static void main(String[] args){
                Frame f = new Frame("Frame without extending Frame Class");
                 
                Label l = new Label("This is frame using composition methods", Label.CENTER);
                f.add(l);

                f.setSize(600,400);
                f.setLayout(new FlowLayout());

                f.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent we){
                                System.exit(0);
                        }
                });

                f.setVisible(true);
        }
}
