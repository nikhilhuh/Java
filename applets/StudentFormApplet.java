package applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class StudentFormApplet extends Applet implements ActionListener, ItemListener {
        Label nameLabel, ageLabel, genderLabel, departmentLabel, hobbiesLabel, resultLabel, eventLabel;
        TextField nameField, ageField;
        CheckboxGroup genderCheckboxGroup;
        Checkbox genderMale, genderFemale;
        Choice departmentChoice;
        List hobbiesList;
        Button submitButton, resetButton;
        TextArea resultArea;

        public void init() {
                // applet methods
                setBackground(Color.yellow);
                setForeground(Color.red);
                setFont(new Font("Arial", Font.BOLD, 21));

                setLayout(new FlowLayout(FlowLayout.CENTER));

                // Name
                nameLabel = new Label("Enter name:");
                nameField = new TextField(20);
                add(nameLabel);
                add(nameField);

                // Age
                ageLabel = new Label("Enter your age:");
                ageField = new TextField(3);
                add(ageLabel);
                add(ageField);

                // Gender
                genderLabel = new Label("Gender:");
                genderCheckboxGroup = new CheckboxGroup();
                genderMale = new Checkbox("Male", genderCheckboxGroup, false);
                genderFemale = new Checkbox("Female", genderCheckboxGroup, false);
                add(genderLabel);
                add(genderMale);
                add(genderFemale);

                // Department
                departmentLabel = new Label("Department:");
                departmentChoice = new Choice();
                departmentChoice.add("Computer Science");
                departmentChoice.add("Electronics");
                departmentChoice.add("Mechanical");
                departmentChoice.add("Civil");
                add(departmentLabel);
                add(departmentChoice);

                // Hobbies
                hobbiesLabel = new Label("Hobbies:");
                hobbiesList = new List(5, true); // multi-select
                hobbiesList.add("Reading");
                hobbiesList.add("Sports");
                hobbiesList.add("Travelling");
                hobbiesList.add("Gaming");
                hobbiesList.add("Music");
                add(hobbiesLabel);
                add(hobbiesList);

                // Buttons
                submitButton = new Button("Submit");
                add(submitButton);
                resetButton = new Button("Reset");
                add(resetButton);

                // Result
                resultLabel = new Label("Your form result data will come here: ");
                resultArea = new TextArea(5, 40);
                resultArea.setEditable(false);
                add(resultLabel);
                add(resultArea);

                // event label
                eventLabel = new Label("What user is editing: ");
                add(eventLabel);

                // Event Listeners
                submitButton.addActionListener(this);
                hobbiesList.addItemListener(this);
                genderMale.addItemListener(this);
                genderFemale.addItemListener(this);
                resetButton.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submitButton) {
                        String name = nameField.getText();
                        String age = ageField.getText();
                        String gender = genderCheckboxGroup.getSelectedCheckbox() != null
                                        ? genderCheckboxGroup.getSelectedCheckbox().getLabel()
                                        : "Not selected";
                        String department = departmentChoice.getSelectedItem();
                        String hobbies = String.join(", ", hobbiesList.getSelectedItems());

                        resultArea.setText("Name: " + name +
                                        "\nAge: " + age +
                                        "\nGender: " + gender +
                                        "\nDepartment: " + department +
                                        "\nHobbies: " + hobbies);
                } else if (e.getSource() == resetButton) {
                        nameField.setText("");
                        ageField.setText("");
                        genderCheckboxGroup.setSelectedCheckbox(null);
                        departmentChoice.select(0);
                        for (int i = 0; i < hobbiesList.getItemCount(); i++) {
                                hobbiesList.deselect(i);
                        }
                        resultArea.setText("Form reset.");
                        eventLabel.setText("User resetted the form.");
                }
        }

        public void itemStateChanged(ItemEvent e) {
                eventLabel.setText("User is editing- " + e.getItem());
        }
}
