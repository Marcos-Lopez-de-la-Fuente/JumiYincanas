package layouts;

// Java program to show Example of SpringLayout. 
// in java. Importing different Package. 
import java.awt.*; 
import javax.swing.*; 

// construct a class Springclassdemo 
public class TestSpringLayout { 

    // Main Method 
    public static void main(String[] arguments) {

        // main window 
        // Function to set the default look  
        // and feel decorated status of JFrame. 
        JFrame.setDefaultLookAndFeelDecorated(true); 

        // Creating Object of "JFrame" class 
        JFrame frame = new JFrame("SpringLayoutExample Example"); 

        // Function to set the default  
        // close operation status of JFrame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // Function to set the  
        // size status of JFrame 
        frame.setSize(300, 200); 

        // to get the content pane 
        Container content = frame.getContentPane(); 

        // Creating Object of "SpringLayout" class 
        SpringLayout layout = new SpringLayout(); 
  
        // to set the layout class 
        frame.setLayout(layout); 
  
        // Initialization of object  
        // "b1" of JButton class. 
        Component b1 = new JButton("GEEKS"); 
  
        // Initialization of object  
        // "b2" of JButton class. 
        Component b2 = new JButton("GFG"); 
  
        // Initialization of object 
        // "b3" of JButton class. 
        Component b3 = new JButton("JAVA"); 
  
        // Initialization of object 
        // "b4" of JButton class. 
        Component b4 = new JButton("Sudo Placement"); 
  
        // Adding the JButton "b1" on frame 
        frame.add(b1); 
  
        // Adding the JButton "b2" on frame 
        frame.add(b2); 
  
        // Adding the JButton "b3" on frame 
        frame.add(b3); 
  
        // Adding the JButton "b4" on frame 
        frame.add(b4); 
  
        // It is used to put the layout 
        // constraint in JFrame using  
        // springLayout class on b1 JButton 
        layout.putConstraint(SpringLayout.WEST, b1,  
                   25, SpringLayout.WEST, content); 
                     
        layout.putConstraint(SpringLayout.NORTH, b1,  
                    10, SpringLayout.NORTH, content); 
  
        // It is used to put the layout 
        // constraint in JFrame using  
        // springLayout class on b2 JButton 
        layout.putConstraint(SpringLayout.WEST, b2,  
                   50, SpringLayout.WEST, content); 
                     
        layout.putConstraint(SpringLayout.NORTH, b2, 
                        10, SpringLayout.SOUTH, b1); 
  
        // It is used to put the layout 
        // constraint in JFrame using  
        // springLayout class on b3 JButton 
        layout.putConstraint(SpringLayout.WEST, b3,  
                   75, SpringLayout.WEST, content); 
                     
        layout.putConstraint(SpringLayout.NORTH, b3,  
                        10, SpringLayout.SOUTH, b2); 
  
        // It is used to put the layout 
        // constraint in JFrame using  
        // springLayout class on b4 JButton 
        layout.putConstraint(SpringLayout.WEST, b4,  
                        15, SpringLayout.EAST, b1); 
                          
        layout.putConstraint(SpringLayout.NORTH, b4, 
                    10, SpringLayout.NORTH, content); 
  
        // Function to set the 
        // visible status of JFrame 
        frame.setVisible(true); 
    } 
} 