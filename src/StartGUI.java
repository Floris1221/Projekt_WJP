import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

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
    URL url = getClass().getResource("/grass.jpg");
    ImageIcon img = new ImageIcon(url);
    public Menu m;

    StartGUI() {
        super("Językomania");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
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


        nowicjuszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                for(int i=1;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }

            }
        });



        początkującyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                for(int i=11;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }

            }
        });
        sredniozaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                for(int i=21;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }
            }
        });
        zaawansowanyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
                for(int i=31;i<m.buttons.size();i++){
                    m.buttons.get(i).setEnabled(false);
                }
            }
        });

      
    }//StartGUI

}//StartGUI class
