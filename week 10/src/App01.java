import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App01 implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JTextField txt1, txt2, txt3, txt4;
    private JButton btn1, btn2, btn3, btn4;
    
    public App01(){
        fr = new JFrame("Calculator");
        p1 = new JPanel(); p2 = new JPanel();
        txt1 = new JTextField(); txt2 = new JTextField(); txt3 = new JTextField();
        btn1 = new JButton("Plus"); btn2 = new JButton("Minus");
        btn3 = new JButton("Times"); btn4 = new JButton("Divide");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
        p1.setLayout(new GridLayout(4, 1));
        p1.add(txt1); p1.add(txt2);
        p1.add(p2); p1.add(txt3);
        
        p2.setLayout(new FlowLayout());
        p2.add(btn1); p2.add(btn2); p2.add(btn3); p2.add(btn4);
        fr.getContentPane().add(p1);
        
        fr.setFont(new Font("TimesRoman", Font.BOLD, 60));
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(btn1)){
            System.out.println("btn1");
        } else if (ae.getSource().equals(btn2)){
            System.out.println("btn2");
        } else if (ae.getSource().equals(btn3)){
            System.out.println("btn3");
        } else if (ae.getSource().equals(btn4)){
            System.out.println("btn4");
        }
    }
    
    public static void main(String[] args) {
        new App01();
    }
}
