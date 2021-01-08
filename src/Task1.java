import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Task1 extends JFrame {
    URL url = getClass().getResource("/Zad2.jpg");
    ImageIcon img = new ImageIcon(url);
    public JButton button1 = new JButton();
    public JButton button2= new JButton();
    public JButton button3 = new JButton();
    public JButton button4 = new JButton();
    public JButton odpowiedzButton = new JButton("Odpowiedź");
    public JLabel label1 = new JLabel();
    public JButton nastepneButton = new JButton("Następne");
    private JButton infoButton = new JButton("Info");
    private JButton hint1 = new JButton("+20 sekund");
    private JButton hint2 = new JButton("Pół na pół");
    public JLabel label2 = new JLabel();
    private JLabel tlo = new JLabel();
    public static JButton helpButton = new JButton();
    public JButton[] buttons = {button1,button2,button3,button4};
    URL url1 = getClass().getResource("/yes_1.png");
    URL url2 = getClass().getResource("/no_1.png");
    ImageIcon yes;
    ImageIcon no;
    URL url3 = getClass().getResource("/wood3.png");
    String odpowiedz;
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


    Task1(int nastepne,boolean test){//Ogólne ustawienia okienka i elementów
        super("Zadanie");
        this.test=test;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);
        tlo.setIcon(img);
        podpowiedz=1;

        Label5Chech.schedule(Label5_task,0,500);

        button1.setLocation(0,d.height/2-150);
        button1.setSize(d.width/2,d.height/4);
        button1.setForeground(Color.WHITE);
        button2.setLocation(button1.getX()+button1.getSize().width,button1.getY());
        button2.setSize(d.width/2,d.height/4);
        button2.setForeground(Color.WHITE);
        button3.setLocation(0,button1.getLocation().y+button1.getSize().height);
        button3.setSize(d.width/2,d.height/4);
        button3.setForeground(Color.WHITE);
        button4.setLocation(button3.getLocation().x+button3.getSize().width,button1.getLocation().y+button1.getSize().height);
        button4.setSize(d.width/2,d.height/4);
        button4.setForeground(Color.WHITE);
        ImageIcon wood=new ImageIcon(new ImageIcon(url3).getImage().getScaledInstance(button1.getWidth()+200,button1.getHeight()+200,Image.SCALE_AREA_AVERAGING));
        yes=new ImageIcon(new ImageIcon(url1).getImage().getScaledInstance(button1.getWidth()+200,button1.getHeight()+200,Image.SCALE_AREA_AVERAGING));
        no=new ImageIcon(new ImageIcon(url2).getImage().getScaledInstance(button1.getWidth()+200,button1.getHeight()+200,Image.SCALE_AREA_AVERAGING));

        for(int i=0; i<buttons.length;i++){
            buttons[i].setFont(new Font("Calibri",Font.BOLD,50));
            buttons[i].setFocusPainted(false);
            buttons[i].setIcon(wood);
            buttons[i].setHorizontalTextPosition(SwingConstants.CENTER);
            buttons[i].setContentAreaFilled(false);
            buttons[i].setFocusPainted(false);
            buttons[i].setBorderPainted(false);
        }


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




        odpowiedzButton.setLocation(10,d.height-130);
        odpowiedzButton.setSize(280,80);
        odpowiedzButton.setFont(new Font("Calibri",Font.BOLD,28));
        odpowiedzButton.setFocusPainted(false);
        if(test)            //Jeśli Test powtarza się dla innych przycisków
            odpowiedzButton.setVisible(false);


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


        //Utworzenie sklepu
        sklep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shop s = new Shop();
            }
        });


        //Podpowiedz 1
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


        //Podpowiedz 2
        hint2.setLocation(d.width-190,infoButton.getY()+120);
        hint2.setSize(180,60);
        hint2.setFont(new Font("Calibri",Font.BOLD,20));
        hint2.setFocusPainted(false);
        hint2.setVisible(false);
        hint2.setEnabled(false);
        if(test)
            hint2.setVisible(true);
        if(Menu.helper2>0)
            hint2.setEnabled(true);



        //Wskaźnik czasu
        progres.setSize(d.width/3,20);
        progres.setLocation(d.width/3,30);
        progres.setMaximum(100);
        progres.setForeground(Color.GREEN);
        progres.setStringPainted(true);
        progres.setVisible(false);




        tlo.add(label5);
        tlo.add(sklep);
        tlo.add(hint1);
        tlo.add(hint2);
        tlo.add(infoButton);
        tlo.add(odpowiedzButton);
        tlo.add(nastepneButton);
        tlo.add(label1);
        tlo.add(label2);
        tlo.add(button4);
        tlo.add(button3);
        tlo.add(button2);
        tlo.add(button1);
        tlo.add(progres);
        this.add(tlo);



        //Zamknięcie okna

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

            }
        });


        //przycisk następny
        nastepneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.f.m.buttons.get(nastepne).setEnabled(true);
                if(test){//Jelsi test
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
                    }//if
                dispose();
            }
        });

        //Info takie samo dla Task 2 i 3
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Wybierz pasującą odpowiedź z podanych poniżej przykładów");
            }
        });

        //odpowiedz takie samo dla Task 2 i 3
        odpowiedzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,odpowiedz);
            }
        });


        //Podpowiedz w trakcie testu takie samo dla Task 2 i 3
        hint1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpButton.doClick();//Klikniecie statycznego przycisku pomocniczego wywołującego zmniejszenie Wartości JProgressBar dla wszystkich okien
                Task2.helpButton.doClick();
                Task3.helpButton.doClick();
                //Jedna odpowiedz na test
                Menu.helper1--;
                podpowiedz--;
                Task2.podpowiedz--;
                Task3.podpowiedz--;
            }
        });

        //Podpowiedz w trakcie testu Pół na pół
        hint2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                int i;
                int j;
                do{//Losuje przyciski które nie są odpowiedzią i je wyłącza
                    i=r.nextInt(3);
                    j=r.nextInt(3);
                }while(i==j||buttons[i].getText().equals(odpowiedz)||buttons[j].getText().equals(odpowiedz));
                buttons[i].setEnabled(false);
                buttons[j].setEnabled(false);
                Menu.helper2--;
                podpowiedz--;
                Task2.podpowiedz--;
                Task3.podpowiedz--;
            }
        });

        //Przycisk pomocniczy do wywołania zmiany czasu w trakcie testu dla wszystkich okienek
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                h=h-20;
            }
        });







        //start czsu dla testu
        if(test){
            progres.setVisible(true);
            fill();
        }



    }//Task1 kon

//Start timera
    public void fill()
    {
        timer = new Timer();
        timer.schedule(timerTask,0,1000);
    }

    //Dodawanie czasu do JProgessbar i sprawdzenie czy możliwe są podpowiedzi
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
            if(Menu.helper2<1)
                hint2.setEnabled(false);
            if(podpowiedz<1){
                hint1.setEnabled(false);
                hint2.setEnabled(false);
            }

        }
    };


    //Aktualizacja monet
    TimerTask Label5_task = new TimerTask() {
        @Override
        public void run() {
            s= String.valueOf(Menu.monney);
            label5.setText(s);
        }
    };







}// Task1 class
