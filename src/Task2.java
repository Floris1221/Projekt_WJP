import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;


public class Task2 extends JFrame {
    URL url = getClass().getResource("/Zad.jpg");
    ImageIcon img = new ImageIcon(url);
    private JTextField textField1=new JTextField();
    public JButton nastepneButton = new JButton("Następne");
    private JButton odpowiedzButton = new JButton("Odpowiedź");
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    private JButton hint1 = new JButton("+20 sekund");
    private JButton hint2 = new JButton("Następna litera");
    private JButton infoButton = new JButton("Info");
    public static JButton helpButton = new JButton();
    private JLabel tlo = new JLabel();
    private  JButton sprawdzButton = new JButton("SPRAWDZ");
    String odp;
    boolean test;
    JProgressBar progres = new JProgressBar();
    Timer timer;
    int h = 0;
    String s ="";
    public static int podpowiedz;
    URL url10 = getClass().getResource("/chest.png");
    ImageIcon chest=new ImageIcon(new ImageIcon(url10).getImage().getScaledInstance(100,90,Image.SCALE_AREA_AVERAGING));
    private JButton sklep = new JButton("SKLEP",chest);
    URL url15 = getClass().getResource("/coin.png");
    ImageIcon coin=new ImageIcon(new ImageIcon(url15).getImage().getScaledInstance(70,50,Image.SCALE_AREA_AVERAGING));
    private JLabel label5 = new JLabel(coin);
    Timer Label5Chech = new Timer();
    String txtLabel5;

    Task2(int nastepne,boolean test){//Ogólne ustawienia okienka i elementów
        super("Zadanie");
        this.test = test;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);
        tlo.setIcon(img);
        System.out.println(Menu.helper2);
        podpowiedz=1;
        Label5Chech.schedule(Label5_task,0,500);

        label1.setFont(new Font("Calibri",Font.BOLD,24));
        label1.setSize(300,30);
        label1.setLocation(10,30);


        label2.setFont(new Font("Calibri",Font.BOLD,34));
        label2.setSize(d.width,50);
        label2.setLocation(0,d.height/2-250);
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



        textField1.setLocation(0,d.height/3);
        textField1.setSize(d.width,d.height/5);
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
        infoButton.setSize(100,60);
        infoButton.setFont(new Font("Calibri",Font.BOLD,20));
        infoButton.setFocusPainted(false);


        sklep.setSize(200,110);
        sklep.setFont(new Font("Calibri",Font.BOLD,24));
        sklep.setForeground(Color.YELLOW);
        sklep.setHorizontalTextPosition(SwingConstants.CENTER);
        sklep.setVerticalTextPosition(SwingConstants.BOTTOM);
        sklep.setLocation(infoButton.getX()-200,20);
        sklep.setContentAreaFilled(false);
        sklep.setFocusPainted(false);
        sklep.setBorderPainted(false);
        if(test)
            sklep.setVisible(false);

        label5.setSize(200,110);
        label5.setFont(new Font("Calibri",Font.BOLD,24));
        label5.setForeground(Color.YELLOW);
        label5.setLocation(sklep.getX()-200,20);
        if(test)
            label5.setVisible(false);


        sklep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shop s = new Shop();
            }
        });




        hint1.setLocation(d.width-190,infoButton.getY()+60);
        hint1.setSize(180,60);
        hint1.setFont(new Font("Calibri",Font.BOLD,20));
        hint1.setFocusPainted(false);
        hint1.setVisible(false);
        hint1.setEnabled(false);
        if(test)
            hint1.setVisible(true);
        if(Menu.helper1>0)
            hint1.setEnabled(true);



        hint2.setLocation(d.width-190,infoButton.getY()+120);
        hint2.setSize(180,60);
        hint2.setFont(new Font("Calibri",Font.BOLD,20));
        hint2.setFocusPainted(false);
        hint2.setVisible(false);
        hint2.setEnabled(false);
        if(test)
            hint2.setVisible(true);
        if(Menu.helper3>0)
            hint2.setEnabled(true);


        progres.setSize(d.width/3,20);
        progres.setLocation(d.width/3,30);
        progres.setMaximum(60);
        progres.setForeground(Color.GREEN);
        progres.setStringPainted(true);
        progres.setVisible(false);



        tlo.add(label5);
        tlo.add(sklep);
        tlo.add(hint1);
        tlo.add(hint2);
        tlo.add(progres);
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



        //Sprawdzanie czy wprowadzona wartość jest równa odpowiedzi
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

        //Tylko dla tesu zapisuje odpowiedz i przechodzi dalej
        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().toLowerCase().equals(odp)) {
                    Main.f.m.pktTest = Main.f.m.pktTest + 75;
                    Menu.monney = Menu.monney + 100;
                    Results.coins = Results.coins+100;
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
                        }
                        i=i+10;
                    }
                dispose();

            }
        });

        //Jak w Task1
        hint1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpButton.doClick();
                Task1.helpButton.doClick();
                Task3.helpButton.doClick();
                Menu.helper1--;
                podpowiedz--;
                Task1.podpowiedz--;
                Task3.podpowiedz--;
            }
        });

        hint2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String now = textField1.getText();
                now = now.trim();
                char[] table_now = now.toCharArray();
                char[] table_odpowiedz = odp.toCharArray();
                now = "";
                char litera = 0;
                //Sprawdzenie długości wprowadzonego słowa
                if (table_now.length > table_odpowiedz.length) {//Jełśi dłuższe od odpowiedzi
                    for (int i = 0; i < table_odpowiedz.length; i++) {
                        if (table_now[i] == table_odpowiedz[i]) {

                        } else {
                            table_now[i] = table_odpowiedz[i];//Zamienia błędno litere na porawna
                            break;
                        }
                    }

                } else {
                    for (int i = 0; i < table_now.length; i++) {//Jeśli krótsze
                        if (table_now[i] == table_odpowiedz[i]) {
                            if(i==table_now.length-1){//jeśli wszystko dobrze
                                try {
                                    litera=table_odpowiedz[i+1];   //dodaje litere
                                }catch (Exception e1){

                                }

                            }

                        } else {
                            table_now[i] = table_odpowiedz[i]; //Zamienia błedna litere
                            break;
                        }
                    }
                }
                for (int i = 0; i < table_now.length; i++)     //Usawia poprawione słowo
                    now = now + table_now[i];
                if(litera!=0){
                    now=now+litera;
                }
                //Jedna odpowiedz na test
                textField1.setText(now);
                Menu.helper2--;
                podpowiedz--;
                Task1.podpowiedz--;
                Task3.podpowiedz--;

            }
        });









        //Jak w Tasku1
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                h=h-20;
            }
        });




        if(test){
            progres.setVisible(true);
            fill();
        }

    }//Task2 kon

    public void fill()
    {
        timer = new Timer();
        timer.schedule(timerTask,0,1000);
    }

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            progres.setValue(h+1);
            s= String.valueOf(60-h);
            progres.setString(s);
            h++;
            if(h==50)
                progres.setForeground(Color.RED);
            if(progres.getValue()==progres.getMaximum()){
                timer.cancel();
                dispose();
            }
            if(Menu.helper1<1)
                hint1.setEnabled(false);
            if(Menu.helper3<1)
                hint2.setEnabled(false);
            if(podpowiedz<1) {
                hint1.setEnabled(false);
                hint2.setEnabled(false);
            }


        }
    };



    TimerTask Label5_task = new TimerTask() {
        @Override
        public void run() {
            s= String.valueOf(Menu.monney);
            label5.setText(s);
        }
    };

}//Task2 class
