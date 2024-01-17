import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class calculator extends Frame implements WindowListener, ActionListener {
    Label l1, l2,l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4, b5, b6, b7;
    calculator(String s)
    {
        this.setLayout(null);

        l1 = new Label("First No.:");
        l1.setBounds(20,40,80,20);
        this.add(l1);

        l2 = new Label("Second No.:");
        l2.setBounds(20,70,80,20);
        this.add(l2);

        l3 = new Label("Answer:");
        l3.setBounds(20,100,80,20);
        this.add(l3);

        t1 = new TextField();
        t1.setBounds(110,40,80,20);
        this.add(t1);

        t2 = new TextField();
        t2.setBounds(110,70,80,20);
        this.add(t2);

        t3 = new TextField();
        t3.setBounds(110,100,80,20);
        this.add(t3);

        b1 = new Button("Add");
        b1.setBounds(35,140,65,20);
        this.add(b1);

        b2 = new Button("Subtract");
        b2.setBounds(110,140,65,20);
        this.add(b2);

        b3 = new Button("Divide");
        b3.setBounds(35,170,65,20);
        this.add(b3);

        b4 = new Button("Multiply");
        b4.setBounds(110,170,65,20);
        this.add(b4);

        b5 = new Button("Power");
        b5.setBounds(35,200,65,20);
        this.add(b5);

        b6 = new Button("Modulus");
        b6.setBounds(110,200,65,20);
        this.add(b6);

        b7 = new Button("Clear");
        b7.setBounds(70,230,65,20);
        this.add(b7);

       

        this.setSize(240,300);
        this.setTitle(s);
        this.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        addWindowListener(this);        

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            //ADD
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 + num2;
            String ans = String.valueOf(res);
            t3.setText(ans);
        }
        else if(e.getSource()==b2)
        {
            //SUBTRACT
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 - num2;
            String ans = String.valueOf(res);
            t3.setText(ans);
        }
        else if(e.getSource()==b3)
        {
            //DIVIDE
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 / num2;
            String ans = String.valueOf(res);
            t3.setText(ans);
        }
        else if(e.getSource()==b4)
        {
            //MULTIPLY
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 * num2;
            String ans = String.valueOf(res);
            t3.setText(ans);
        }
        else if(e.getSource()==b5)
        {
            //POWER
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double res = Math.pow(num1, num2);
            String ans = String.valueOf(res);
            t3.setText(ans);
        }
        else if(e.getSource()==b6)
        {
            //MODULUS
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int res = num1 % num2;
            String ans = String.valueOf(res);
            t3.setText(ans);
        }
        else if(e.getSource()==b7)
        {
           //CLEAR
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        
    }
    public void windowClosing(WindowEvent e) {
        this.dispose(); 
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
         new calculator("Basic Calculator");
        
        
    }
}