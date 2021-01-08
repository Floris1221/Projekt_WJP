import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Shop extends JFrame {
    URL url = getClass().getResource("/sklep.jpg");
    ImageIcon img = new ImageIcon(url);
    JLabel tlo = new JLabel(img);
    JButton button1 = new JButton("+20 sekund");
    JButton button2 = new JButton("Pół na pół");
    JButton button3 = new JButton("Następna litera");
    JButton button4 = new JButton("Następna płytka");
    JLabel label1 = new JLabel("<html>Dla wszytskich zadań<br/> 500$</html>");
    JLabel label2 = new JLabel("<html>Dla zadań wyboru<br/> 450$</html>");
    JLabel label3 = new JLabel("<html>Dla zadań z wpisaniem<br/> 300$</html>");
    JLabel label4 = new JLabel("<html>Dla zadań z uporządkowaniem<br/> 250$</html>");
    JButton infoButton = new JButton("INFO");


    Shop(){     //Utworzenie i ustawienie parametrów Labeli i przycisków
        super("Sklep");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d.width-d.width/4,d.height-d.height/4);
        this.setVisible(true);
        this.setLocation(d.width/6,d.height/6);



        button1.setSize(180,60);
        button1.setLocation(40,this.getHeight()/2-50);
        button1.setFont(new Font("Calibri",Font.BOLD,20));
        if(Menu.monney< 500)
            button1.setEnabled(false);

        label1.setSize(200,100);
        label1.setLocation(40, button1.getY()-100);
        label1.setFont(new Font("Calibri",Font.BOLD,18));
        label1.setForeground(Color.YELLOW);



        button2.setSize(180,60);
        button2.setLocation(this.getWidth()/4+40,this.getHeight()/2-50);
        button2.setFont(new Font("Calibri",Font.BOLD,20));
        if(Menu.monney<450)
            button2.setEnabled(false);

        label2.setSize(200,100);
        label2.setLocation(button2.getX(), button2.getY()-100);
        label2.setFont(new Font("Calibri",Font.BOLD,18));
        label2.setFont(new Font("Calibri",Font.BOLD,18));
        label2.setForeground(Color.YELLOW);


        button3.setSize(180,60);
        button3.setLocation(this.getWidth()/2+40,this.getHeight()/2-50);
        button3.setFont(new Font("Calibri",Font.BOLD,20));
        if(Menu.monney<300)
            button3.setEnabled(false);


        label3.setSize(200,100);
        label3.setLocation(button3.getX(), button3.getY()-100);
        label3.setFont(new Font("Calibri",Font.BOLD,18));
        label3.setFont(new Font("Calibri",Font.BOLD,18));
        label3.setForeground(Color.YELLOW);

        button4.setSize(180,60);
        button4.setLocation(((this.getWidth()*3)/4)+40,this.getHeight()/2-50);
        button4.setFont(new Font("Calibri",Font.BOLD,20));
        if(Menu.monney<250)
            button4.setEnabled(false);


        label4.setSize(200,100);
        label4.setLocation(button4.getX(), button4.getY()-100);
        label4.setFont(new Font("Calibri",Font.BOLD,18));
        label4.setFont(new Font("Calibri",Font.BOLD,18));
        label4.setForeground(Color.YELLOW);


        infoButton.setLocation(this.getWidth()-110,30);
        infoButton.setSize(100,60);
        infoButton.setFont(new Font("Calibri",Font.BOLD,20));
        infoButton.setFocusPainted(false);

        //Informacje
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"+20 sekund -Dodaje 20 sekund do czasu testu \n Pół na pół - Zminiejsza możliwą liczbe odpowiedzi o połowe \n Następna litera - Poprawia pierwszą napotkaną błędną literę lub dodaje kolejną jeśli wszystkie poprzednie są prawidłowe \n Następna kafelka - Poprawia pierwszą napotkaną błędną kafelkę lub dodaje kolejną jeśli wszystkie poprzednie są prawidłowe");
            }
        });



        //Kupienie spomagania i zaktualizowanie dostępności dla wszystkich 4 przycisków
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.helper1++;
                Menu.monney = Menu.monney - 500;
                if(Menu.monney<500)
                    button1.setEnabled(false);
                if(Menu.monney<450)
                    button2.setEnabled(false);
                if(Menu.monney<300)
                    button3.setEnabled(false);
                if(Menu.monney<250)
                    button4.setEnabled(false);

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.helper2++;
                Menu.monney = Menu.monney - 450;
                if(Menu.monney<500)
                    button1.setEnabled(false);
                if(Menu.monney<450)
                    button2.setEnabled(false);
                if(Menu.monney<300)
                    button3.setEnabled(false);
                if(Menu.monney<250)
                    button4.setEnabled(false);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.helper3++;
                Menu.monney = Menu.monney - 300;
                if(Menu.monney<500)
                    button1.setEnabled(false);
                if(Menu.monney<450)
                    button2.setEnabled(false);
                if(Menu.monney<300)
                    button3.setEnabled(false);
                if(Menu.monney<250)
                    button4.setEnabled(false);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.helper4++;
                Menu.monney = Menu.monney - 250;
                if(Menu.monney<500)
                    button1.setEnabled(false);
                if(Menu.monney<450)
                    button2.setEnabled(false);
                if(Menu.monney<300)
                    button3.setEnabled(false);
                if(Menu.monney<250)
                    button4.setEnabled(false);
            }
        });














        tlo.add(infoButton);
        tlo.add(label1);
        tlo.add(label2);
        tlo.add(label3);
        tlo.add(label4);
        tlo.add(button2);
        tlo.add(button3);
        tlo.add(button4);
        tlo.add(button1);
        tlo.setIcon(img);
        this.add(tlo);


    }//Shop kon




}//Shop class
