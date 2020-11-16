import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

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
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
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
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    String coment;


    StartGUI(){
        super("Językomania");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(CardPanel);
        this.setSize(700,1000);
        this.setVisible(true);
        buttons.addAll(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button23,button24,button25,button26,button27,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39,button40,button41,button42,button43,button44));


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
                for(int i=0;i<10;i++){
                    buttons.get(i).setEnabled(true);
                }

            }
        });
        sredniozaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
                panel1.setVisible(false);
                for(int i=0;i<20;i++){
                    buttons.get(i).setEnabled(true);
                }
            }
        });
        zaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(true);
                panel1.setVisible(false);
                for(int i=0;i<30;i++){
                    buttons.get(i).setEnabled(true);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task1 task1 = new Task1();


            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task1 task1 = new Task1();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task1 task1 = new Task1();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task1 task1 = new Task1();
            }
        });
    }//StartGUI
}//StartGUI class
