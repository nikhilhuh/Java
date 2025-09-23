package frames;

import java.awt.*;
import java.awt.event.*;

public class FrameInheritance extends Frame {

    FrameInheritance() {
        super("My First Frame");

        Label l = new Label("Hello, this is the frame window", Label.CENTER);
        add(l);

        setSize(400, 300);
        setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        FrameInheritance f = new FrameInheritance();
        f.setVisible(true);
    }
}
