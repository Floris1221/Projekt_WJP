import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


public class Task2 extends JFrame {
    URL url = getClass().getResource("/grass.jpg");
    ImageIcon img = new ImageIcon(url);
    private JTextField textField1=new JTextField();
    private JButton menuButton = new JButton();
    public JButton nastepneButton = new JButton("Następne");
    private JButton odpowiedzButton = new JButton("Odpowieź");
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    private JButton infoButton = new JButton("Info");
    private JLabel tlo = new JLabel();
    public static int exist=0;
    String odp;

    Task2(int nastepne){
        super("Zadanie");
        exist=1;
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


        textField1.setLocation(0,d.height/2);
        textField1.setSize(d.width,d.height/4);
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.setFont(new Font("Calibri",Font.BOLD,30));
        textField1.setAutoscrolls(true);


        odpowiedzButton.setLocation(10,d.height-130);
        odpowiedzButton.setSize(280,80);
        odpowiedzButton.setFont(new Font("Calibri",Font.BOLD,28));


        infoButton.setLocation(d.width-110,30);
        infoButton.setSize(100,55);
        infoButton.setFont(new Font("Calibri",Font.BOLD,20));




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
                exist=0;
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
                exist=0;
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

    }//Task2 kon
}//Task2 class
