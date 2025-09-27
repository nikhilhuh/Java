// Create frame with a label & button, display message on click.

package topicwiseprograms;

import java.awt.*;
import java.awt.event.*;

public class FrameExample {
        public static void main(String[] args) {
                Frame f = new Frame("Frame Example 1");
                Label l1 = new Label("Click the button to see a message");
                Button b = new Button("Click Me");
                Label l2 = new Label("");

                f.setLayout(new FlowLayout());
                f.add(l1);
                f.add(b);

                l2.setPreferredSize(new Dimension(200,30));
                f.add(l2);

                b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                l2.setText("Hello from the Frame");
                        }
                });

                f.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent we) {
                                System.exit(0);
                        }
                });

                f.setSize(600, 600);
                f.setVisible(true);
        }
}
