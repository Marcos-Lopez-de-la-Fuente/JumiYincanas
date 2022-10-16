package layouts.tests;

// Java Program to illustrate the GroupLayout class
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;

// creating a class GroupLayoutExample
public class TestGroupLayout {

    // Main Method
    public static void main(String[] args) {

        // Function to set the Default Look
        // And Feel Decorated of JFrame.
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Creating Object of 
        // "JFrame" class
        JFrame frame = new JFrame("GroupLayoutExample");

        // Function to set the Default 
        // Close Operation of JFrame.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Creating Object of "JLabel" class
        JLabel label = new JLabel("Label:");

        // Creating Object of 
        // "JTextField" class
        JTextField textField = new JTextField();

        // Creating Object of 
        // "JCheckBox" class
        JCheckBox checkBox1 = new JCheckBox("CheckBox1");

        // Creating Object of "JCheckBox" class
        JCheckBox checkBox2 = new JCheckBox("CheckBox2");

        // Creating Object of "JButton" class
        JButton findButton = new JButton("Button 1");

        // Creating Object of "JButton" class
        JButton cancelButton = new JButton("Button 2");

        // used to set the Border of a checkBox1
        checkBox1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        // used to set the Border of a checkBox2
        checkBox2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        // Creating Object of "GroupLayout" class
        GroupLayout layout = new GroupLayout(frame.getContentPane());

        // to get the content pane
        frame.getContentPane().setLayout(layout);

        // it used to set Auto Create Gaps
        layout.setAutoCreateGaps(true);

        // it used to set Auto Create Container Gaps
        layout.setAutoCreateContainerGaps(true);

        // it used to set the horizontal group
        layout.setHorizontalGroup(
            layout.createSequentialGroup()

            // Adding the label
            .addComponent(label)

            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(LEADING)

            // Adding the textfield
            .addComponent(textField)

            // Adding the Sequential Group
            .addGroup(layout.createSequentialGroup()

            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(LEADING)

            // Adding the checkBox1
            .addComponent(checkBox1))

            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(LEADING)
    
            // Adding the checkBox2
            .addComponent(checkBox2))))
    
            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(LEADING)
    
            // Adding the findButton
            .addComponent(findButton)
        
            // Adding the CancelButton
            .addComponent(cancelButton))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);

        layout.setVerticalGroup(
            layout.createSequentialGroup()

            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(BASELINE)

            // Adding the label
            .addComponent(label)
    
            // Adding the textField
            .addComponent(textField)

            // Adding the findButton
            .addComponent(findButton))

            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(LEADING)

            // Adding the sequential Group
            .addGroup(layout.createSequentialGroup()

            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(BASELINE)

            // Adding the checkBox1
            .addComponent(checkBox1)

            // Adding the checkBox2
            .addComponent(checkBox2))

            // Adding the Parallel Group
            .addGroup(layout.createParallelGroup(BASELINE)))

            // Adding the CancelButton
            .addComponent(cancelButton))
        );

        frame.pack();
        frame.setVisible(true);
    }
}