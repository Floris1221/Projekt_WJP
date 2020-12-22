import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;

public class Task1 extends JFrame {

    public JPanel panel;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton odpowiedzButton;
    public JLabel label1;
    public JButton następneButton;
    private JButton menuButton;
    public JLabel label2;
    private JButton infoButton;
    public JButton[] buttons = {button1,button2,button3,button4};
    URL url1 = getClass().getResource("/yes.png");
    URL url2 = getClass().getResource("/no.png");
    Icon yes = new ImageIcon(url1);
    Icon no = new ImageIcon(url2);
    public static int  exist=0;

    Task1(){
        exist=1;
        this.add(panel);
        this.setSize(850,600);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                exist=0;
            }
        });
    }


}// Task1 class
