import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


public class Task2 extends JFrame {
    URL url = getClass().getResource("/grass.jpg");
    ImageIcon img = new ImageIcon(url);
    private JTextField textField1=new JTextField();
    public JButton nastepneButton = new JButton("Następne");
    private JButton odpowiedzButton = new JButton("Odpowieź");
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    private JButton infoButton = new JButton("Info");
    private JLabel tlo = new JLabel();
    private  JButton sprawdzButton = new JButton("SPRAWDZ");
    String odp;
    boolean test;

    Task2(int nastepne,boolean test){
        super("Zadanie");
        this.test = test;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);
        tlo.setIcon(img);

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
        if(test)
            nastepneButton.setVisible(false);



        textField1.setLocation(0,d.height/2);
        textField1.setSize(d.width,d.height/4);
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.setFont(new Font("Calibri",Font.BOLD,30));
        textField1.setAutoscrolls(true);


        odpowiedzButton.setLocation(10,d.height-130);
        odpowiedzButton.setSize(280,80);
        odpowiedzButton.setFont(new Font("Calibri",Font.BOLD,28));
        odpowiedzButton.setFocusPainted(false);
        if(test)
            odpowiedzButton.setVisible(false);


        sprawdzButton.setLocation((nastepneButton.getX()-odpowiedzButton.getX())/2,d.height-150);
        sprawdzButton.setSize(300,100);
        sprawdzButton.setFont(new Font("Calibri",Font.BOLD,28));
        sprawdzButton.setFocusPainted(false);
        sprawdzButton.setVisible(false);
        if(test)
            sprawdzButton.setVisible(true);



        infoButton.setLocation(d.width-110,30);
        infoButton.setSize(100,55);
        infoButton.setFont(new Font("Calibri",Font.BOLD,20));
        infoButton.setFocusPainted(false);




        tlo.add(sprawdzButton);
        tlo.add(infoButton);
        tlo.add(odpowiedzButton);
        tlo.add(textField1);
        tlo.add(nastepneButton);
        tlo.add(label1);
        tlo.add(label2);
        this.add(tlo);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });



        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(textField1.getText().toLowerCase().equals(odp)){
                    nastepneButton.setEnabled(true);
                }else{
                    nastepneButton.setEnabled(false);
                }
            }
        });


        nastepneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main.f.m.buttons.get(nastepne).setEnabled(true);
            }
        });

        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Wpisz przetłumaczone słowo lub zdanie");
            }
        });

        odpowiedzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,odp);
            }
        });


        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().toLowerCase().equals(odp)) {
                    Main.f.m.pktTest = Main.f.m.pktTest + 75;
                    Menu.monney = Menu.monney + 75;
                }
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
                dispose();

            }
        });

    }//Task2 kon
}//Task2 class
