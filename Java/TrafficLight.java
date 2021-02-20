import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class TrafficLight extends JFrame implements ActionListener {
    JRadioButton buttonRed, buttonYellow, buttonGreen;

      Signal green = new Signal(Color.green);
      Signal yellow = new Signal(Color.yellow);
      Signal red = new Signal(Color.red);

    public TrafficLight(){
    
        setLayout(new FlowLayout());
        buttonRed = new JRadioButton("Red");
        buttonYellow = new JRadioButton("Yellow");
        buttonGreen = new JRadioButton("Green");
        // clear = new JRadioButton("Clear");
        buttonRed.addActionListener(this);
        buttonYellow.addActionListener(this);
        buttonGreen.addActionListener(this);
        // clear.addActionListener(this);  

        JPanel trafficPanel = new JPanel(new GridLayout(3,1));
        trafficPanel.add(red);
        trafficPanel.add(yellow);
        trafficPanel.add(green);
        JPanel lightPanel = new JPanel(new FlowLayout());
        lightPanel.add(buttonRed);
        lightPanel.add(buttonYellow);
        lightPanel.add(buttonGreen);
        // lightPanel.add(clear);
        add(trafficPanel);
        add(lightPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


    public static void main(String[] args){
      new TrafficLight();      
    }  
    public void actionPerformed(ActionEvent e){      
        if (e.getSource() == buttonRed){
            buttonRed.setSelected(true);
            buttonGreen.setSelected(false);
            buttonYellow.setSelected(false);
            green.turnOn(false);          
            yellow.turnOn(false);
            red.turnOn(true);
        } 
        else if (e.getSource() == buttonYellow){
            buttonRed.setSelected(false);
            buttonGreen.setSelected(false);
            buttonYellow.setSelected(true);
            yellow.turnOn(true);          
            green.turnOn(false);
            red.turnOn(false);
        } 
        else if (e.getSource() == buttonGreen){
            buttonRed.setSelected(false);
            buttonGreen.setSelected(true);
            buttonYellow.setSelected(false);
            red.turnOn(false);          
            yellow.turnOn(false);
            green.turnOn(true);
        }
        // else if(e.getSource() == clear){
        //     buttonRed.setSelected(false);
        //     buttonGreen.setSelected(false);
        //     buttonYellow.setSelected(false);
        //     red.turnOn(false);          
        //     yellow.turnOn(false);
        //     green.turnOn(false);
        // }
    }
}  
class Signal extends JPanel{

    Color on;
    boolean change;

    Signal(Color color){
        on = color;
        change = false;
    }

    public void turnOn(boolean a){
        change = a; 
        repaint();     
    }
    public Dimension getPreferredSize(){
        int size = (50)*2;
        return new Dimension( size, size );
    }
    public void paintComponent(Graphics g){
        
        g.setColor(Color.black);
        g.fillRect(0,0,150,250);
        if (change){
            g.setColor( on );
        } else {
            g.setColor(Color.white);
        }
        g.fillOval(10, 10, 80, 80);
    }
}