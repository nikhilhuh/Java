// Accept two numbers using TextField and display sum.

package topicwiseprograms;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletExample2 extends Applet implements ActionListener {
        Label l1 , l2, sumLabel;
        TextField t1, t2, sumTextField;
        Button sumButton;

        public void init() {
                l1 = new Label("Enter first number: ");
                t1 = new TextField(10);
                add(l1);
                add(t1);

                l2 = new Label("Enter second number: ");
                t2 = new TextField(10);
                add(l2);
                add(t2);


                sumButton = new Button("Calculate Sum");
                sumButton.addActionListener(this);
                add(sumButton);

                sumLabel = new Label("Sum: ");
                sumTextField = new TextField(10);
                add(sumLabel);
                add(sumTextField);
        }

        public void actionPerformed(ActionEvent e) {
                if(e.getSource() == sumButton) {
                        int num1 = Integer.parseInt(t1.getText());
                        int num2 = Integer.parseInt(t2.getText());
                        int sum = num1 + num2;
                        sumTextField.setText(sum + "");
                }
        }
}
