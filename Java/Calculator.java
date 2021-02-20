import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
    
  public static void main(String[] args) {

    new Calculator();

  }  
    String t1="",t2="",t3="";
    JLabel l;
    JButton add,sub,mul,div, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    Calculator(){               
    
        b1 = new JButton("1"); 
        b2 = new JButton("2"); 
        b3 = new JButton("3"); 
        b4 = new JButton("4"); 
        b5 = new JButton("5"); 
        b6 = new JButton("6"); 
        b7 = new JButton("7"); 
        b8 = new JButton("8"); 
        b9 = new JButton("9");
        b10 = new JButton("=");
        b11 = new JButton(".");
        b12 = new JButton("c");
        b13 = new JButton("0");
        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("x");
        div=new JButton("/");
        l=new JLabel("0");
        
        JPanel p = new JPanel(new GridLayout(4,4));

        p.add(b1); 
        p.add(b2); 
        p.add(b3);  
        p.add(b12);
        p.add(b4); 
        p.add(b5); 
        p.add(b6);  
        p.add(add);
        p.add(b7); 
        p.add(b8); 
        p.add(b9);
        p.add(sub);
        p.add(b11);
        p.add(b13);
        p.add(div);
        p.add(mul);

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(b10);

        JPanel play = new JPanel(new GridLayout(3,1)); 
        play.add(l);
        play.add(p);
        play.add(p1);
        add(play);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        b9.addActionListener(this); 
        b8.addActionListener(this); 
        b7.addActionListener(this); 
        b6.addActionListener(this); 
        b5.addActionListener(this); 
        b4.addActionListener(this); 
        b3.addActionListener(this); 
        b2.addActionListener(this); 
        b1.addActionListener(this); 
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){

        String s = ae.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {

            if (!t2.equals("")) {

                t3 = t3 + s;
                l.setText(t3);

            }

            else{

                t1 = t1 + s;
                l.setText(t1);

            }
                
            // l.setText(t1+t2+t3); 

        }
        else if (s.charAt(0) == 'c') { 

            t3 = t1 = t2 = "";  
            l.setText("0"); 

        } 
        else if (s.charAt(0) == '=') { 
  
            double val; 
  
            if (t2.equals("+")) 
                val= (Double.parseDouble(t1) + Double.parseDouble(t3)); 

            else if (t2.equals("-")) 
                val= (Double.parseDouble(t1) - Double.parseDouble(t3)); 

            else if (t2.equals("/")) 
                val= (Double.parseDouble(t1) / Double.parseDouble(t3)); 

            else
                val= (Double.parseDouble(t1) * Double.parseDouble(t3)); 

            l.setText(val+""); 
            t1 = Double.toString(val); 
            t2 = t3 = ""; 

        }
        else { 
            if(t2.equals("") && t3.equals("")&&t1.equals("")&&s.equals("-")){
              t1+=s;
            }
             
            else if(t2.equals("") || t3.equals("") && (!t1.equals(""))) 
                t2 = s;

            else{

                double val; 
                if (t2.equals("+")) 
                    val= (Double.parseDouble(t1) + Double.parseDouble(t3)); 

                else if (t2.equals("-")) 
                    val= (Double.parseDouble(t1) - Double.parseDouble(t3)); 

                else if (t2.equals("/")) 
                    val= (Double.parseDouble(t1) / Double.parseDouble(t3)); 

                else
                    val= (Double.parseDouble(t1) * Double.parseDouble(t3));

                t1=Double.toString(val);
                t2=s; 
                t3 = "";

            } 

            l.setText(t1);

        }
    }
}