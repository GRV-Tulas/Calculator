import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class DemoCalculator extends Applet implements ActionListener {
    double a, b, c;
    String op = "";
    TextField t1;

    // Buttons for digits, operators, and clear
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    public void paint(Graphics gh) {
        gh.drawRect(80, 40, 420, 300);
        gh.drawRect(110, 70, 350, 40);
    }

    public void init() {
        t1 = new TextField();
        t1.setBounds(110, 70, 350, 40);

        // Initialize buttons
        b1 = createButton("1", 100, 150);
        b2 = createButton("4", 100, 200);
        b3 = createButton("7", 100, 250);
        b4 = createButton("clr", 100, 300);
        b5 = createButton("2", 200, 150);
        b6 = createButton("5", 200, 200);
        b7 = createButton("8", 200, 250);
        b8 = createButton("0", 200, 300);
        b9 = createButton("3", 300, 150);
        b10 = createButton("6", 300, 200);
        b11 = createButton("9", 300, 250);
        b12 = createButton("=", 300, 300);
        b13 = createButton("+", 400, 150);
        b14 = createButton("-", 400, 200);
        b15 = createButton("/", 400, 250);
        b16 = createButton("*", 400, 300);

        setLayout(null);

        add(t1);
        addButtons(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16);
    }

    // Helper method to create buttons
    private Button createButton(String label, int x, int y) {
        Button button = new Button(label);
        button.setBounds(x, y, 80, 20);
        button.addActionListener(this);
        return button;
    }

    // Helper method to add buttons to the applet
    private void addButtons(Button... buttons) {
        for (Button button : buttons) {
            add(button);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            t1.setText(t1.getText() + "1");
        } else if (ae.getSource() == b2) {
            t1.setText(t1.getText() + "4");
        } else if (ae.getSource() == b3) {
            t1.setText(t1.getText() + "7");
        } else if (ae.getSource() == b4) {
            a = 0;
            b = 0;
            c = 0;
            t1.setText("");
        } else if (ae.getSource() == b5) {
            t1.setText(t1.getText() + "2");
        } else if (ae.getSource() == b6) {
            t1.setText(t1.getText() + "5");
        } else if (ae.getSource() == b7) {
            t1.setText(t1.getText() + "8");
        } else if (ae.getSource() == b8) {
            t1.setText(t1.getText() + "0");
        } else if (ae.getSource() == b9) {
            t1.setText(t1.getText() + "3");
        } else if (ae.getSource() == b10) {
            t1.setText(t1.getText() + "6");
        } else if (ae.getSource() == b11) {
            t1.setText(t1.getText() + "9");
        } else if (ae.getSource() == b12) {
            b = Double.parseDouble(t1.getText());
            if (op.equals("+")) {
                c = a + b;
            } else if (op.equals("-")) {
                c = a - b;
            } else if (op.equals("/")) {
                c = a / b;
            } else if (op.equals("*")) {
                c = a * b;
            }
            t1.setText("" + c);
        } else if (ae.getSource() == b13) {
            a = Double.parseDouble(t1.getText());
            op = "+";
            t1.setText("");
        } else if (ae.getSource() == b14) {
            a = Double.parseDouble(t1.getText());
            op = "-";
            t1.setText("");
        } else if (ae.getSource() == b15) {
            a = Double.parseDouble(t1.getText());
            op = "/";
            t1.setText("");
        } else if (ae.getSource() == b16) {
            a = Double.parseDouble(t1.getText());
            op = "*";
            t1.setText("");
        }
    }
}
