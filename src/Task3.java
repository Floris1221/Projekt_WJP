import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Task3 extends JFrame {
    URL url = getClass().getResource("/Zad3.jpg");
    ImageIcon img = new ImageIcon(url);
    JLabel tlo = new JLabel(img);
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    public JButton nastepneButton = new JButton("Następne");
    private JButton odpowiedzButton = new JButton("Odpowiedź");
    private JButton infoButton = new JButton("Info");
    private JButton hint1 = new JButton("+20 sekund");
    private JButton hint2 = new JButton("Następna kafelka");
    private JPanel panel1 = new JPanel();
    private  JButton sprawdzButton = new JButton("SPRAWDZ");
    public static JButton helpButton = new JButton();
    public ArrayList <JLabel> labels = new ArrayList<JLabel>();
    public  ArrayList <Integer> correctAnswer = new ArrayList<Integer>();
    private Point pointPressed;
    URL url3 = getClass().getResource("/wood3.png");
    public int k;
    public int x;
    public int x1;
    public Dimension d;
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



    Task3(int nbol,int nastepne,boolean test) {//Ogólne ustawienia okienka i elementów
        super("Zadanie");
        this.test = test;
        d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);
        podpowiedz=1;
        Label5Chech.schedule(Label5_task,0,500);


        panel1.setSize(d.width, d.height / 5);
        panel1.setLocation(0, (d.height*2/5)-50);
        panel1.setBackground(Color.cyan);


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


        odpowiedzButton.setLocation(10,d.height-130);
        odpowiedzButton.setSize(280,80);
        odpowiedzButton.setFont(new Font("Calibri",Font.BOLD,28));
        odpowiedzButton.setFocusPainted(false);
        if(test)
            odpowiedzButton.setVisible(false);


        sprawdzButton.setLocation((nastepneButton.getX()-odpowiedzButton.getX())/2,d.height-150);
        sprawdzButton.setSize(300,100);
        sprawdzButton.setFont(new Font("Calibri",Font.BOLD,28));
        sprawdzButton.setEnabled(false);
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
        if(Menu.helper4>0)
            hint2.setEnabled(true);



        progres.setSize(d.width/3,20);
        progres.setLocation(d.width/3,30);
        progres.setMaximum(60);
        progres.setForeground(Color.GREEN);
        progres.setStringPainted(true);
        progres.setVisible(false);




        k = d.width/nbol;
        x=(k/2);
        x1=x;

        AddLabels(x1,d,k);








        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });

        //jak w Task1
        nastepneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main.f.m.buttons.get(nastepne).setEnabled(true);
            }
        });

        //jak w Task1
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Wpisz przetłumaczone słowo lub zdanie");
            }
        });
        //jak w Task1
        odpowiedzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String odpowiedz = "";
                for(int i=0;i<labels.size();i++){
                    odpowiedz=odpowiedz+labels.get(correctAnswer.get(i)).getText()+" ";
                }
                JOptionPane.showMessageDialog(null,odpowiedz);
            }
        });
        //Tylko dla testu
        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean corect = false;

                //Sprawdzenie czy poprawna odpowiedz
                for(int i =0;i<labels.size()-1;i++){
                    if(labels.get(correctAnswer.get(i)).getX()<labels.get(correctAnswer.get(i+1)).getX()){
                        corect=true;
                    }else {
                        corect=false;
                        break;
                    }
                }
                //jesli tak dodanie punktów
                if (corect){
                    Main.f.m.pktTest =Main.f.m.pktTest + 75;
                    Menu.monney =Menu.monney + 100;
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

        //jak w Task1
        hint1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helpButton.doClick();
                Task1.helpButton.doClick();
                Task2.helpButton.doClick();
                Menu.helper1--;
                podpowiedz--;
                Task2.podpowiedz--;
                Task1.podpowiedz--;
            }
        });

        //Ustawienie kafelki podpowiedz
        hint2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 10;
                int k =x+135;
                x=x+k;
                for(int i =0;i<labels.size();i++){
                    if(labels.get(correctAnswer.get(i)).getX()==x && labels.get(correctAnswer.get(i)).getY()==panel1.getY()+(panel1.getHeight()/2)){//Jeśli kafelka w dobrym miejscu

                    }else {
                        for(int j =i;j<labels.size();j++){//Czy inna zajmuje miejsce przeznaczone na poprawną
                            if(labels.get(correctAnswer.get(j)).getX()==x&& labels.get(correctAnswer.get(j)).getY()==panel1.getY()+(panel1.getHeight()/2)){//Jelsi tak
                                labels.get(correctAnswer.get(j)).setLocation(x1=x1+(k*j),d.height*3/5);//Wyrzucenie jej z panelu
                            }//if
                        }//for
                        labels.get(correctAnswer.get(i)).setLocation(x,panel1.getY()+(panel1.getHeight()/2));//Dodanie na to miejsce poprawnej
                        break;

                    }//else
                    x=x+k;
                }
                podpowiedz--;
                Task2.podpowiedz--;
                Task1.podpowiedz--;
            }
        });









        //jak w Task1
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



    }//Task 3 kon

    //Ustawienie labeli dodanych zgodznie z liczbą słów
    void AddLabels(int x1, Dimension d,int k){
        ImageIcon wood=new ImageIcon(new ImageIcon(url3).getImage().getScaledInstance(190,100,Image.SCALE_AREA_AVERAGING));
        for(int i =0;i<labels.size();i++){
            labels.get(i).setSize(85, 30);
            labels.get(i).setIcon(wood);
            labels.get(i).setHorizontalTextPosition(SwingConstants.CENTER);
            labels.get(i).setVerticalTextPosition(SwingConstants.CENTER);
            labels.get(i).setOpaque(true);
            labels.get(i).setLocation(x1,d.height*3/5);
            labels.get(i).addMouseMotionListener(slowaDragged);
            labels.get(i).addMouseListener(slowaPressed);
            labels.get(i).addMouseListener(slowaDrop);
            labels.get(i).setAlignmentY(CENTER_ALIGNMENT);
            labels.get(i).setAlignmentX(CENTER_ALIGNMENT);
            labels.get(i).setHorizontalAlignment(SwingConstants.CENTER);
            labels.get(i).setVerticalAlignment(SwingConstants.CENTER);
            labels.get(i).setFont(new Font("Calibri",Font.BOLD,16));
            labels.get(i).setForeground(Color.WHITE);
            tlo.add(labels.get(i));
            x1=x1+k;
        }
        //Dodanie reszty elementów
        tlo.add(label5);
        tlo.add(sklep);
        tlo.add(hint1);
        tlo.add(hint2);
        tlo.add(progres);
        tlo.add(sprawdzButton);
        tlo.add(infoButton);
        tlo.add(odpowiedzButton);
        tlo.add(nastepneButton);
        tlo.add(label1);
        tlo.add(label2);
        tlo.add(panel1);
        this.add(tlo);

    }





    //**Drag and Drop labeli*
    MouseAdapter slowaDragged = new MouseAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            JComponent comp = (JLabel)e.getSource();
            Point pointDragged = e.getPoint();
            Point loc =comp.getLocation();
            loc.translate(pointDragged.x - pointPressed.x, pointDragged.y - pointPressed.y);
            comp.setLocation(loc);
        }
    };


    MouseAdapter slowaPressed = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            pointPressed = e.getPoint();
        }
    };
    //**Drop i sprawdzenie czy Drop znalazł się wewnątrz panelu*
    MouseAdapter slowaDrop = new MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            JComponent comp = (JLabel)e.getSource();
            int x = 10;
            int k =x+135;
            boolean Allinpanel = false;
            boolean corect = false;
            if(comp.getY()>panel1.getY() && comp.getY()<(panel1.getY()+panel1.getHeight())){//**Jeśłi wewnątrz panelu*
                for(int i=0;i<labels.size();i++){
                    if(labels.get(i).getY()>panel1.getY() && labels.get(i).getY()<(panel1.getY()+panel1.getHeight())){//**Jeśli już jakieś są*
                        x=x+k;//**ustawienie lokalizacji*
                    }
                }
                comp.setLocation(x,panel1.getY()+(panel1.getHeight()/2));
                for(int j=0;j<labels.size();j++){//**Sprawdzenie czy wszystkie w panelu*
                    if(labels.get(j).getY()>panel1.getY() && labels.get(j).getY()<(panel1.getY()+panel1.getHeight())){
                        Allinpanel=true;
                    }else{
                        Allinpanel=false;
                        break;
                    }
                }

                if (Allinpanel){//**Jeśli tak uaktywnienie sprawdzenia (Tylko w trakcie Testu)*
                    sprawdzButton.setEnabled(true);
                }else{
                    sprawdzButton.setEnabled(false);
                }

                //**Sprawdzenie czy odpowiedz poprawna i czy wszystkie w panelu rózni sie od podobnej funkcji powyżej dlatego nie można ich połączyć*
                for(int i =0;i<labels.size()-1;i++){
                    if(labels.get(correctAnswer.get(i)).getX()<labels.get(correctAnswer.get(i+1)).getX() && Allinpanel){
                        corect=true;
                    }else {
                        corect=false;
                        break;
                    }
                }
            }
            if (corect){//**Jeśli poprawna odblokowuje przycisk następne*
                nastepneButton.setEnabled(true);
            }else{
                nastepneButton.setEnabled(false);
            }


        }
    };



    //**aktywacja timera tylko w trkacjie testu*
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
            if(Menu.helper4<1)
                hint2.setEnabled(false);
            if(podpowiedz<1) {
                hint1.setEnabled(false);
                hint2.setEnabled(false);
            }


        }
    };
    //**jak w Task1*
    TimerTask Label5_task = new TimerTask() {
        @Override
        public void run() {
            s= String.valueOf(Menu.monney);
            label5.setText(s);
        }
    };


}//Task3 class
