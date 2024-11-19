package OOPS.applet;

import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        // Create an ImageIcon from an image file
        ImageIcon i1 = new ImageIcon("france.jpg");

        // Create a JLabel with text, icon, and alignment
        JLabel j1 = new JLabel("France", i1, JLabel.CENTER);

        // Create a JFrame to hold the label
        JFrame jf = new JFrame("Hello Java Swing");

        // Add the label to the frame
        jf.add(j1);

        // Set the default close operation and frame size
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 300);

        // Make the frame visible
        jf.setVisible(true);
    }
}
