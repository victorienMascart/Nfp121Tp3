package question2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class View  {
    private JTextField jTextField;
    private JButton jButton1;
    private JButton jButton2;

    public Number number;

    View(Number number){
        this.number = number;
        // create the window
        JFrame window = new JFrame();
        // give a title
        window.setTitle("Swing Window");
        // change the size
        window.setSize(400, 100);
        // exit program on window close action
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // center window on screen
        window.setLocationRelativeTo(null);
        // create a panel to include components
        JPanel jPanel = new JPanel();
        // create a textField
        this.jTextField = new JTextField(5);
        // add the textField to the window
        jPanel.add(this.jTextField);
        // create a button
        this.jButton1 = new JButton("+");
        // add the button to the window
        jPanel.add(this.jButton1);
        // create a button
        this.jButton2 = new JButton("-");
        // add the button to the window
        jPanel.add(this.jButton2);
        // add the panel to the window
        window.add(jPanel);
        // display the window
        window.setVisible(true);
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JTextField getjTextField() {
        return jTextField;
    }
}
