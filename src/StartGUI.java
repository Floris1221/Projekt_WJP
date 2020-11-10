import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGUI extends JFrame {
    private JPanel CardPanel;
    private JPanel panel1;
    private JLabel label1;
    private JButton nowicjuszButton;
    private JButton początkującyButton;
    private JButton sredniozaawansowanyButton;
    private JButton zaawansowanyButton;
    private JScrollPane panel2;
    private JPanel panel2v1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;

    StartGUI(){
        super("Językomania");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(CardPanel);
        this.setSize(700,1000);
        ImageIcon one = new ImageIcon("1.png");


        nowicjuszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
                panel1.setVisible(false);
            }
        });
        początkującyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
                panel1.setVisible(false);
            }
        });
        sredniozaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
                panel1.setVisible(false);
            }
        });
        zaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
                panel1.setVisible(false);
            }
        });
    }//StartGUI
}
