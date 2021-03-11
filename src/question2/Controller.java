package question2;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    public Number number;
    public View view;

    public Controller(Number number, View view) {
        this.view = view;
        this.number = number;
    }

    public void display() {
        this.view.getjButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number.incrementValue();
            }
        });

        this.view.getjButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number.decrementValue();
            }
        });

        this.view.getjTextField().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();
                int value = Integer.parseInt(t.getText());
                number.setValue(value);
            }
        });
    }
}
