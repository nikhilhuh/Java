package applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutApplet extends Applet implements ActionListener {
    CardLayout card;
    Panel cards;
    Button nextBtn, prevBtn;

    public void init() {
        // CardLayout object
        card = new CardLayout();
        cards = new Panel();
        cards.setLayout(card);

        // First "card"
        Panel card1 = new Panel();
        card1.add(new Label("This is Card 1"));
        card1.add(new TextField("Enter Name", 15));

        // Second "card"
        Panel card2 = new Panel();
        card2.add(new Label("This is Card 2"));
        card2.add(new Button("Card 2 Button"));

        // Third "card"
        Panel card3 = new Panel();
        card3.add(new Label("This is Card 3"));
        card3.add(new Checkbox("I agree"));

        // Add cards with names
        cards.add("first", card1);
        cards.add("second", card2);
        cards.add("third", card3);

        // Buttons to navigate
        nextBtn = new Button("Next");
        prevBtn = new Button("Previous");
        nextBtn.addActionListener(this);
        prevBtn.addActionListener(this);

        // Add everything to Applet
        setLayout(new BorderLayout());
        add(cards, BorderLayout.CENTER);

        Panel controlPanel = new Panel();
        controlPanel.add(prevBtn);
        controlPanel.add(nextBtn);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextBtn) {
            card.next(cards);
        } else if (e.getSource() == prevBtn) {
            card.previous(cards);
        }
    }
}
