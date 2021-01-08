import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;


public class StartGUI extends JFrame {
    URL url2 = getClass().getResource("/cloud.png");
    ImageIcon cloud=new ImageIcon(new ImageIcon(url2).getImage().getScaledInstance(200,150,Image.SCALE_AREA_AVERAGING));
    URL url3 = getClass().getResource("/cloud_hover.png");
    ImageIcon cloud_hover=new ImageIcon(new ImageIcon(url3).getImage().getScaledInstance(200,150,Image.SCALE_AREA_AVERAGING));
    public JLabel label1 = new JLabel("Wybierz poziom trudność");
    private JButton nowicjuszButton = new JButton("Nowicjusz",cloud);
    private JButton początkującyButton = new JButton("Początkujący",cloud);
    private JButton sredniozaawansowanyButton = new JButton("Srediozaawansowany",cloud);
    private JButton zaawansowanyButton = new JButton("Zaawansowany",cloud);
    private JLabel tlo = new JLabel();
    private JPanel panel1;
    private JPanel panel2;
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    URL url = getClass().getResource("/Start.jpg");
    ImageIcon img=new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(d.width,d.height,Image.SCALE_AREA_AVERAGING));
    public Menu m;

    StartGUI() {//Ogólne ustawienia okna i elementów
        super("Językomania");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);
        tlo.setIcon(img);



        nowicjuszButton.setHorizontalTextPosition(SwingConstants.CENTER);
        nowicjuszButton.setContentAreaFilled(false);
        nowicjuszButton.setFocusPainted(false);
        nowicjuszButton.setBorderPainted(false);
        początkującyButton.setHorizontalTextPosition(SwingConstants.CENTER);
        początkującyButton.setContentAreaFilled(false);
        początkującyButton.setFocusPainted(false);
        początkującyButton.setBorderPainted(false);
        sredniozaawansowanyButton.setHorizontalTextPosition(SwingConstants.CENTER);
        sredniozaawansowanyButton.setContentAreaFilled(false);
        sredniozaawansowanyButton.setFocusPainted(false);
        sredniozaawansowanyButton.setBorderPainted(false);
        zaawansowanyButton.setHorizontalTextPosition(SwingConstants.CENTER);
        zaawansowanyButton.setContentAreaFilled(false);
        zaawansowanyButton.setFocusPainted(false);
        zaawansowanyButton.setBorderPainted(false);

        nowicjuszButton.setSize(200,100);
        początkującyButton.setSize(200,100);
        sredniozaawansowanyButton.setSize(200,100);
        zaawansowanyButton.setSize(200,100);
        nowicjuszButton.setLocation((d.width/2)-125,d.height/4);
        początkującyButton.setLocation((d.width/2)-125,(d.height/4)+120);
        sredniozaawansowanyButton.setLocation((d.width/2)-125,(d.height/4)+240);
        zaawansowanyButton.setLocation((d.width/2)-125,(d.height/4)+360);
        label1.setFont(new Font("Calibri",Font.BOLD,30));
        label1.setSize(400,100);
        label1.setLocation(nowicjuszButton.getX()-25,nowicjuszButton.getY()-150);
        label1.setForeground(Color.WHITE);
        tlo.add(nowicjuszButton);
        tlo.add(początkującyButton);
        tlo.add(sredniozaawansowanyButton);
        tlo.add(zaawansowanyButton);
        tlo.add(label1);
        this.add(tlo);



        //Otworzenie poziomu I
        nowicjuszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                m.pktTest=0;
                Menu.odnos=0;
                for(int i=1;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }

            }
        });



        //Otworzenie poziomu II
        początkującyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                m.pktTest=450;
                Menu.odnos=450;
                for(int i=11;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }

            }
        });
        //Otworzenie poziomu III
        sredniozaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                m.pktTest=900;
                Menu.odnos=900;
                for(int i=21;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }
            }
        });
        //Otworzenie poziomu IV
        zaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                m.pktTest=1350;
                Menu.odnos=1350;
                for(int i=31;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }
            }
        });

        //Zmiana ikonki przycisków po najeździe
        nowicjuszButton.addMouseListener(hover);
        początkującyButton.addMouseListener(hover);
        sredniozaawansowanyButton.addMouseListener(hover);
        zaawansowanyButton.addMouseListener(hover);

        nowicjuszButton.addMouseListener(hover_off);
        początkującyButton.addMouseListener(hover_off);
        sredniozaawansowanyButton.addMouseListener(hover_off);
        zaawansowanyButton.addMouseListener(hover_off);

      
    }//StartGUI

    MouseAdapter hover = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
            JButton button = (JButton) e.getSource();
            button.setIcon(cloud_hover);
        }
    };
    MouseAdapter hover_off = new MouseAdapter() {
        @Override
        public void mouseExited(MouseEvent e) {
            super.mouseExited(e);
            JButton button = (JButton) e.getSource();
            button.setIcon(cloud);
        }
    };


}//StartGUI class
