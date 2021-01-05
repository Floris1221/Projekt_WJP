import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.security.MessageDigest;

public class Task1 extends JFrame {
    URL url = getClass().getResource("/grass.jpg");
    ImageIcon img = new ImageIcon(url);
    public JButton button1 = new JButton();
    public JButton button2= new JButton();
    public JButton button3 = new JButton();
    public JButton button4 = new JButton();
    public JButton odpowiedzButton = new JButton("Odpoweidź");
    public JLabel label1 = new JLabel();
    public JButton nastepneButton = new JButton("Następne");
    private JButton infoButton = new JButton("Info");
    public JLabel label2 = new JLabel();
    private JLabel tlo = new JLabel();
    public JButton[] buttons = {button1,button2,button3,button4};
    URL url1 = getClass().getResource("/yes.png");
    URL url2 = getClass().getResource("/no.png");
    Icon yes = new ImageIcon(url1);
    Icon no = new ImageIcon(url2);
    String odpowiedz;
    boolean test;

    Task1(int nastepne,boolean test){
        super("Zadanie");
        this.test=test;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);
        tlo.setIcon(img);

        button1.setLocation(0,d.height/2-150);
        button1.setSize(d.width/2,d.height/4);
        button2.setLocation(button1.getX()+button1.getSize().width,button1.getY());
        button2.setSize(d.width/2,d.height/4);
        button3.setLocation(0,button1.getLocation().y+button1.getSize().height);
        button3.setSize(d.width/2,d.height/4);
        button4.setLocation(button3.getLocation().x+button3.getSize().width,button1.getLocation().y+button1.getSize().height);
        button4.setSize(d.width/2,d.height/4);

        for(int i=0; i<buttons.length;i++){
            buttons[i].setFont(new Font("Calibri",Font.BOLD,50));
            buttons[i].setFocusPainted(false);
        }


        label1.setFont(new Font("Calibri",Font.BOLD,24));
        label1.setSize(300,30);
        label1.setLocation(10,30);
        label1.setForeground(Color.WHITE);

        label2.setFont(new Font("Calibri",Font.BOLD,34));
        label2.setSize(d.width,50);
        label2.setLocation(0,d.height/2-250);
        label2.setForeground(Color.WHITE);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setHorizontalTextPosition(SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.CENTER);
        label2.setAutoscrolls(true);

        nastepneButton.setLocation(d.width-300,d.height-130);
        nastepneButton.setSize(280,80);
        nastepneButton.setFont(new Font("Calibri",Font.BOLD,28));
        nastepneButton.setEnabled(false);
        nastepneButton.setFocusPainted(false);


        odpowiedzButton.setLocation(10,d.height-130);
        odpowiedzButton.setSize(280,80);
        odpowiedzButton.setFont(new Font("Calibri",Font.BOLD,28));
        odpowiedzButton.setFocusPainted(false);
        if(test)
            odpowiedzButton.setVisible(false);


        infoButton.setLocation(d.width-110,30);
        infoButton.setSize(100,55);
        infoButton.setFont(new Font("Calibri",Font.BOLD,20));
        infoButton.setFocusPainted(false);



        tlo.add(infoButton);
        tlo.add(odpowiedzButton);
        tlo.add(nastepneButton);
        tlo.add(label1);
        tlo.add(label2);
        tlo.add(button4);
        tlo.add(button3);
        tlo.add(button2);
        tlo.add(button1);
        this.add(tlo);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });


        nastepneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.f.m.buttons.get(nastepne).setEnabled(true);
                if(test){
                        for(int i=9;i<Main.f.m.buttons.size();){
                            if(Main.f.m.buttons.get(i).isVisible()){

                            }else{
                                int p=0;
                                switch (i){
                                    case  9: {p=254; break;}
                                    case  19: {p=704; break;}
                                    case  29: {p=1096; break;}
                                    case  39: {p=1604; break;}
                                }
                                if(Main.f.m.pktTest>p) {
                                    Main.f.m.buttons.get(i).setVisible(true);
                                    Main.f.m.buttons.get(i + 1).setEnabled(true);
                                }
                            }
                                i=i+10;
                        }
                    }
                dispose();
            }
        });


        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Wybierz pasującą odpowiedź z podanych poniżej przykładów");
            }
        });

        odpowiedzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,odpowiedz);
            }
        });


    }//Task1 kon

}// Task1 class
