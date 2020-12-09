import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 extends JFrame {
    public JPanel panel;
    private JTextField textField1;
    private JButton infoButton;
    public JButton nastepneButton;
    private JButton odpowiedzButton;
    public JLabel label1;
    public JLabel label2;
    public static int exist;
    String odp;

    Task2(){
        exist=1;
        this.setSize(850,600);
        this.add(panel);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                exist=0;
            }
        });


    }//Task2 kon
}//Task2 class
