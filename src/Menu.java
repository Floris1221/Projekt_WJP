

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Time;
import java.util.*;
import java.util.Timer;

public class Menu extends JFrame {
    URL url = getClass().getResource("/grass.jpg");
    ImageIcon img = new ImageIcon(url);
    URL url1 = getClass().getResource("/one.png");
    ImageIcon one = new ImageIcon(url1);
    URL url2 = getClass().getResource("/two.png");
    ImageIcon two = new ImageIcon(url2);
    URL url3 = getClass().getResource("/three.png");
    ImageIcon three = new ImageIcon(url3);
    URL url4 = getClass().getResource("/four.png");
    ImageIcon four = new ImageIcon(url4);
    URL url5 = getClass().getResource("/five.png");
    ImageIcon five = new ImageIcon(url5);
    URL url6 = getClass().getResource("/six.png");
    ImageIcon six = new ImageIcon(url6);
    URL url7 = getClass().getResource("/seven.png");
    ImageIcon seven = new ImageIcon(url7);
    URL url8 = getClass().getResource("/eight.png");
    ImageIcon eight = new ImageIcon(url8);
    URL url9 = getClass().getResource("/nine.png");
    ImageIcon nine = new ImageIcon(url9);
    URL url10 = getClass().getResource("/chest.png");
    ImageIcon chest=new ImageIcon(new ImageIcon(url10).getImage().getScaledInstance(100,90,Image.SCALE_AREA_AVERAGING));
    ScrollablePicture picture = new ScrollablePicture(img,1);
    private JScrollPane panel = new JScrollPane(picture);
    private JButton button1 = new JButton(one);
    private JButton button2 = new JButton(two);
    private JButton button3 = new JButton(three);
    private JButton button4 = new JButton(four);
    private JButton button5 = new JButton(five);
    private JButton button6 = new JButton(six);
    private JButton button7 = new JButton(seven);
    private JButton button8 = new JButton(eight);
    private JButton button9 = new JButton(nine);
    private JButton button10 = new JButton("TEST");
    private JButton button11 = new JButton(one);
    private JButton button12 = new JButton(two);
    private JButton button13 = new JButton(three);
    private JButton button14 = new JButton(four);
    private JButton button15 = new JButton(five);
    private JButton button16 = new JButton(six);
    private JButton button17 = new JButton(seven);
    private JButton button18 = new JButton(eight);
    private JButton button19 = new JButton(nine);
    private JButton button20 = new JButton("TEST");
    private JButton button21 = new JButton(one);
    private JButton button22 = new JButton(two);
    private JButton button23 = new JButton(three);
    private JButton button24 = new JButton(four);
    private JButton button25 = new JButton(five);
    private JButton button26 = new JButton(six);
    private JButton button27 = new JButton(seven);
    private JButton button28 = new JButton(eight);
    private JButton button29 = new JButton(nine);
    private JButton button30 = new JButton("TEST");
    private JButton button31 = new JButton(one);
    private JButton button32 = new JButton(two);
    private JButton button33 = new JButton(three);
    private JButton button34 = new JButton(four);
    private JButton button35 = new JButton(five);
    private JButton button36 = new JButton(six);
    private JButton button37 = new JButton(seven);
    private JButton button38 = new JButton(eight);
    private JButton button39 = new JButton(nine);
    private JButton button40 = new JButton("TEST");
    private JLabel tlo = new JLabel();
    private JButton sklep = new JButton("SKLEP",chest);
    private JLabel label1 = new JLabel("POZIOM NOWICJUSZ");
    private JLabel label2 = new JLabel("POZIOM POCZĄTKUJĄCY");
    private JLabel label3 = new JLabel("POZIOM SREDNIOZAAWANSOWANY");
    private JLabel label4 = new JLabel("POZIOM ZAAWANSOWANY");
    URL url15 = getClass().getResource("/coin.png");
    ImageIcon coin=new ImageIcon(new ImageIcon(url15).getImage().getScaledInstance(70,50,Image.SCALE_AREA_AVERAGING));
    private JLabel label5 = new JLabel(coin);
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    int pktTest;
    public static int odnos;
    public static int h =0;
    static int monney = 0;
    static int helper1=0;
    static int helper2=0;
    static int helper3=0;
    static int helper4=0;
    Timer timer = new Timer();
    String s;

    Menu(){
        super("Menu");                      //Utworzenie ramki
        Main.f.dispose();
        buttons.addAll(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39,button40));
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);
        timer.schedule(timerTask,0,500);



        //Ustawienie przycisków uruchamiających zadania
        for(int i=0;i<buttons.size();i++){
            buttons.get(i).setSize(128,128);
            buttons.get(i).setContentAreaFilled(false);
            buttons.get(i).setFocusPainted(false);
            buttons.get(i).setBorderPainted(false);
            picture.add(buttons.get(i));
        }



        //Ustawienie Przycisków test
        button10.setContentAreaFilled(true);
        button10.setBorderPainted(true);
        button10.setBackground(Color.cyan);
        button10.setFont(new Font("Calibri",Font.BOLD,40));
        button10.setForeground(Color.WHITE);
        button10.setSize(150,90);

        button20.setContentAreaFilled(true);
        button20.setBorderPainted(true);
        button20.setBackground(Color.cyan);
        button20.setFont(new Font("Calibri",Font.BOLD,40));
        button20.setForeground(Color.WHITE);
        button20.setSize(150,90);

        button30.setContentAreaFilled(true);
        button30.setBorderPainted(true);
        button30.setBackground(Color.cyan);
        button30.setFont(new Font("Calibri",Font.BOLD,40));
        button30.setForeground(Color.WHITE);
        button30.setSize(150,90);

        button40.setContentAreaFilled(true);
        button40.setBorderPainted(true);
        button40.setBackground(Color.cyan);
        button40.setFont(new Font("Calibri",Font.BOLD,40));
        button40.setForeground(Color.WHITE);
        button40.setSize(150,90);


        //Ustawienie lebeli
        int x = (d.width/3)/2;
        int y = 200;
        int i =0;

        label1.setFont(new Font("Calibri",Font.BOLD,38));
        label1.setSize(d.width,60);
        label1.setLocation(10,y-150);
        label1.setForeground(Color.WHITE);


        label2.setFont(new Font("Calibri",Font.BOLD,38));
        label2.setSize(d.width,60);
        label2.setLocation(10,y+1000);
        label2.setForeground(Color.WHITE);



        label3.setFont(new Font("Calibri",Font.BOLD,38));
        label3.setSize(d.width,60);
        label3.setLocation(10,y+2100);
        label3.setForeground(Color.WHITE);



        label4.setFont(new Font("Calibri",Font.BOLD,38));
        label4.setSize(d.width,60);
        label4.setLocation(10,y+3200);
        label4.setForeground(Color.WHITE);

        sklep.setSize(200,110);
        sklep.setFont(new Font("Calibri",Font.BOLD,24));
        sklep.setForeground(Color.YELLOW);
        sklep.setHorizontalTextPosition(SwingConstants.CENTER);
        sklep.setVerticalTextPosition(SwingConstants.BOTTOM);
        sklep.setLocation(d.width-250,20);
        sklep.setContentAreaFilled(false);
        sklep.setFocusPainted(false);
        sklep.setBorderPainted(false);


        label5.setSize(200,110);
        label5.setFont(new Font("Calibri",Font.BOLD,24));
        label5.setForeground(Color.YELLOW);
        label5.setLocation(sklep.getX()-200,20);

        //Utworzenie sklepu
        sklep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shop s = new Shop();
            }
        });




        //Umiejscowiennie poziomów
        while(i<buttons.size()){
            buttons.get(i).setLocation(x,y);
            buttons.get(i+1).setLocation(x+(d.width/3),y+150);
            buttons.get(i+2).setLocation(x+(d.width/3)+(d.width/3),y+30);
            buttons.get(i+3).setLocation(x+(d.width/3)+(d.width/3),y+350);
            buttons.get(i+4).setLocation(x-30,y+300);
            buttons.get(i+5).setLocation(x-30+(d.width/3),y+470);
            buttons.get(i+6).setLocation(x,y+650);
            buttons.get(i+7).setLocation(x+(d.width/3)+(d.width/3),y+600);
            buttons.get(i+8).setLocation(x-250+(d.width/3)+(d.width/3),y+700);
            buttons.get(i+9).setLocation(x+(d.width/3),y+900);
            i=i+10;
            y=y+1100;
        }






        picture.add(label5);
        picture.add(sklep);
        picture.add(label1);
        picture.add(label2);
        picture.add(label3);
        picture.add(label4);
        

        this.add(panel);





        Questions q = new Questions();
        //Twprzenie zadań

        //Zad 1
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {//Czy Test
                boolean test;
                    if(button10.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    //Tworzenie Zadania i przypisanie jego elementom takim
                    //Jak label i przyciski odpowiednich paramterów
                    Task1 task1 = new Task1(1,test);
                    task1.label1.setText(q.teksty[0][0]);
                    task1.label2.setText(q.teksty[0][1]);
                    //Ustawienie przycisków w Task1
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[0][i+2]);
                        //Przycisk z poprawną odpowiedzią
                        if(i+1==Integer.parseInt(q.teksty[0][6]))
                        {
                            task1.odpowiedz = q.teksty[0][i+2];
                            int finalI = i;
                            //Jego Listener
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    //Ustawia ikone i odblokowuje przycisk następne
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    //Jeśli Test Przypisanie punktów za odpowiedz
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                        pktTest = pktTest + 75;
                                        monney = monney + 100;
                                        Results.coins = Results.coins+100;
                                    }
                                }
                            });
                        }
                        else{//Błędne odpowiedzi
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    //Jeśli test
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Zad 2             Task1
        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean test;
                    if(button10.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    Task1 task1 = new Task1(2,test);
                    task1.label1.setText(q.teksty[1][0]);
                    task1.label2.setText(q.teksty[1][1]);
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[1][i+2]);
                        if(i+1==Integer.parseInt(q.teksty[1][6]))
                        {
                            task1.odpowiedz = q.teksty[1][i+2];
                            int finalI = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                        pktTest = pktTest + 75;
                                        monney = monney + 100;
                                        Results.coins = Results.coins+100;
                                    }
                                }
                            });
                        }
                        else{
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Zad 3             Task1
        button3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean test;
                    if(button10.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    Task1 task1 = new Task1(3,test);
                    task1.label1.setText(q.teksty[2][0]);
                    task1.label2.setText(q.teksty[2][1]);
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[2][i+2]);
                        if(i+1==Integer.parseInt(q.teksty[2][6]))
                        {
                            task1.odpowiedz = q.teksty[2][i+2];
                            int finalI = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                        pktTest = pktTest + 75;
                                        monney = monney + 100;
                                        Results.coins = Results.coins+100;
                                    }
                                }
                            });
                        }
                        else{
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Zad 4             Task1
        button4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean test;
                    if(button10.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    Task1 task1 = new Task1(4,test);
                    task1.label1.setText(q.teksty[3][0]);
                    task1.label2.setText(q.teksty[3][1]);
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[3][i+2]);
                        if(i+1==Integer.parseInt(q.teksty[3][6]))
                        {
                            task1.odpowiedz = q.teksty[3][i+2];
                            int finalI = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                    }
                                    pktTest = pktTest + 75;
                                    monney = monney + 100;
                                    Results.coins = Results.coins+100;
                                }
                            });
                        }
                        else{
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Zad 5


        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Czy test
                boolean test;
                if(button10.isVisible()){
                    test=false;
                }else{
                    test=true;
                }//Utworzenie okna
                    Task2 task2 = new Task2(5,test);
                    //ustawienie parametró dla konkretnego zadania
                    task2.label1.setText(q.teksty[4][0]);
                    task2.label2.setText(q.teksty[4][1]);
                    task2.odp = q.teksty[4][2];

                    task2.setVisible(true);

                }
        });

        //Zad 6
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean test;
                if(button10.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task2 task2 = new Task2(6,test);
                    task2.label1.setText(q.teksty[5][0]);
                    task2.label2.setText(q.teksty[5][1]);
                    task2.odp = q.teksty[5][2];

                    task2.setVisible(true);

                }
        });

        //Zad 7
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean test;
                if(button10.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task2 task2 = new Task2(7,test);
                    task2.label1.setText(q.teksty[6][0]);
                    task2.label2.setText(q.teksty[6][1]);
                    task2.odp = q.teksty[6][2];

                    task2.setVisible(true);

            }
        });

        //Zad 8             Task1
        button8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean test;
                    if(button10.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    Task1 task1 = new Task1(8,test);
                    task1.label1.setText(q.teksty[7][0]);
                    task1.label2.setText(q.teksty[7][1]);
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[7][i+2]);
                        if(i+1==Integer.parseInt(q.teksty[7][6]))
                        {
                            task1.odpowiedz = q.teksty[7][i+2];
                            int finalI = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                        pktTest = pktTest + 75;
                                        monney = monney + 100;
                                        Results.coins = Results.coins+100;
                                    }
                                }
                            });
                        }
                        else{
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Zad 9             Task1
        button9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean test;
                    if(button10.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    Task1 task1 = new Task1(9,test);
                    task1.label1.setText(q.teksty[8][0]);
                    task1.label2.setText(q.teksty[8][1]);
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[8][i+2]);
                        if(i+1==Integer.parseInt(q.teksty[8][6]))
                        {
                            task1.odpowiedz = q.teksty[8][i+2];
                            int finalI = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                        pktTest = pktTest + 75;
                                        monney = monney + 100;
                                        Results.coins = Results.coins+100;
                                    }
                                }
                            });
                        }
                        else{
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Test
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wylosowanie 6 pytań z zadań z podanego poziomu
                button10.setVisible(false);
                int z,x,c,v,b,n;
                boolean jest = false;
                Random r = new Random();
                z=r.nextInt(8);

                do{
                    x=r.nextInt(8);
                    if(x==z)
                        jest=true;
                    else
                        jest = false;
                }while(jest);


                do{
                    c=r.nextInt(8);
                    if(c==z||c==x)
                        jest=true;
                    else
                        jest = false;
                }while(jest);


                do{
                    v=r.nextInt(8);
                    if(v==z||v==x||v==c)
                        jest=true;
                    else
                        jest = false;
                }while(jest);


                do{
                    b=r.nextInt(8);
                    if(b==z||b==x||b==c||b==v)
                        jest=true;
                    else
                        jest = false;
                }while(jest);

                do{
                    n=r.nextInt(8);
                    if(n==z||n==x||n==c||n==v||n==b)
                        jest=true;
                    else
                        jest = false;
                }while(jest);
                //Tabela wyników
                Results results =new Results();
                buttons.get(z).doClick();
                buttons.get(x).doClick();
                buttons.get(c).doClick();
                buttons.get(v).doClick();
                buttons.get(b).doClick();
                buttons.get(n).doClick();

            }
        });







        // ///////////////////NOWICJUSZ///////////////////////////





        //Zad 1
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //czy test
                int nbol;
                    nbol = Integer.parseInt(q.teksty[10][2]);
                boolean test;
                if(button20.isVisible()){
                    test=false;
                }else{
                    test=true;
                }//Utworzenie task3
                    Task3 task3 = new Task3(nbol+1,11,test);
                    task3.label1.setText(q.teksty[10][0]);
                    task3.label2.setText(q.teksty[10][1]);
                    for(int i=0;i<=nbol;i++){
                        task3.labels.add(new JLabel(q.teksty[10][i+3]));
                        task3.correctAnswer.add(Integer.valueOf(q.teksty[10][i+4+nbol]));
                    }
                    task3.AddLabels(task3.x1,task3.d,task3.k);

                }
        });

        //Zad 2             Task1
        button12.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean test;
                    if(button20.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    Task1 task1 = new Task1(12,test);
                    task1.label1.setText(q.teksty[11][0]);
                    task1.label2.setText(q.teksty[11][1]);
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[11][i+2]);
                        if(i+1==Integer.parseInt(q.teksty[11][6]))
                        {
                            task1.odpowiedz = q.teksty[11][i+2];
                            int finalI = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                        pktTest = pktTest + 75;
                                        monney = monney + 100;
                                        Results.coins = Results.coins+100;
                                    }
                                }
                            });
                        }
                        else{
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Zad 3
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean test;
                if(button20.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task2 task2 = new Task2(13,test);
                    task2.label1.setText(q.teksty[12][0]);
                    task2.label2.setText(q.teksty[12][1]);
                    task2.odp = q.teksty[12][2];

                    task2.setVisible(true);

                }
        });

        //Zad 4
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nbol;
                    nbol = Integer.parseInt(q.teksty[13][2]);
                boolean test;
                if(button20.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task3 task3 = new Task3(nbol+1,14,test);
                    task3.label1.setText(q.teksty[13][0]);
                    task3.label2.setText(q.teksty[13][1]);
                    for(int i=0;i<=nbol;i++){
                        task3.labels.add(new JLabel(q.teksty[13][i+3]));
                        task3.correctAnswer.add(Integer.valueOf(q.teksty[13][i+4+nbol]));
                    }
                    System.out.println(task3.labels.size());
                    task3.AddLabels(task3.x1,task3.d,task3.k);

                }
        });

        //Zad 5
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nbol;
                    nbol = Integer.parseInt(q.teksty[14][2]);
                boolean test;
                if(button20.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task3 task3 = new Task3(nbol+1,15,test);
                    task3.label1.setText(q.teksty[14][0]);
                    task3.label2.setText(q.teksty[14][1]);
                    for(int i=0;i<=nbol;i++){
                        task3.labels.add(new JLabel(q.teksty[14][i+3]));
                        task3.correctAnswer.add(Integer.valueOf(q.teksty[14][i+4+nbol]));
                    }
                    System.out.println(task3.labels.size());
                    task3.AddLabels(task3.x1,task3.d,task3.k);

                }
        });

        //Zad 6
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean test;
                if(button20.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task2 task2 = new Task2(16,test);
                    task2.label1.setText(q.teksty[15][0]);
                    task2.label2.setText(q.teksty[15][1]);
                    task2.odp = q.teksty[15][2];

                    task2.setVisible(true);

                }
        });

        //Zad 7
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nbol;
                    nbol = Integer.parseInt(q.teksty[16][2]);
                boolean test;
                if(button20.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task3 task3 = new Task3(nbol+1,17,test);
                    task3.label1.setText(q.teksty[16][0]);
                    task3.label2.setText(q.teksty[16][1]);
                    for(int i=0;i<=nbol;i++){
                        task3.labels.add(new JLabel(q.teksty[16][i+3]));
                        task3.correctAnswer.add(Integer.valueOf(q.teksty[16][i+4+nbol]));
                    }
                    System.out.println(task3.labels.size());
                    task3.AddLabels(task3.x1,task3.d,task3.k);

                }
        });

        //Zad 8             Task1
        button18.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean test;
                    if(button20.isVisible()){
                        test=false;
                    }else{
                        test=true;
                    }
                    Task1 task1 = new Task1(18,test);
                    task1.label1.setText(q.teksty[17][0]);
                    task1.label2.setText(q.teksty[17][1]);
                    for(int i=0;i<task1.buttons.length;i++)
                    {
                        task1.buttons[i].setText(q.teksty[17][i+2]);
                        if(i+1==Integer.parseInt(q.teksty[17][6]))
                        {
                            task1.odpowiedz = q.teksty[17][i+2];
                            int finalI = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.nastepneButton.setEnabled(true);
                                    task1.buttons[finalI].setIcon(task1.yes);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                        }
                                        pktTest = pktTest + 75;
                                        monney = monney + 100;
                                        Results.coins = Results.coins+100;
                                    }
                                }
                            });
                        }
                        else{
                            int finalI1 = i;
                            task1.buttons[i].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    task1.buttons[finalI1].setIcon(task1.no);
                                    if(task1.test){
                                        for(int j=0; j<task1.buttons.length; j++){
                                            task1.buttons[j].setEnabled(false);
                                            task1.nastepneButton.setEnabled(true);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    task1.setVisible(true);
                }
        });

        //Zad 9
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean test;
                if(button20.isVisible()){
                    test=false;
                }else{
                    test=true;
                }
                    Task2 task2 = new Task2(19,test);
                    task2.label1.setText(q.teksty[18][0]);
                    task2.label2.setText(q.teksty[18][1]);
                    task2.odp = q.teksty[18][2];

                    task2.setVisible(true);

                }
        });

        //Test
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button20.setVisible(false);
                int z,x,c,v,b,n;
                boolean jest = false;
                Random r = new Random();
                z=r.nextInt(8)+10;

                do{
                    x=r.nextInt(8)+10;
                    if(x==z)
                        jest=true;
                    else
                        jest = false;
                }while(jest);


                do{
                    c=r.nextInt(8)+10;
                    if(c==z||c==x)
                        jest=true;
                    else
                        jest = false;
                }while(jest);


                do{
                    v=r.nextInt(8)+10;
                    if(v==z||v==x||v==c)
                        jest=true;
                    else
                        jest = false;
                }while(jest);


                do{
                    b=r.nextInt(8)+10;
                    if(b==z||b==x||b==c||b==v)
                        jest=true;
                    else
                        jest = false;
                }while(jest);

                do{
                    n=r.nextInt(8)+10;
                    if(n==z||n==x||n==c||n==v||n==b)
                        jest=true;
                    else
                        jest = false;
                }while(jest);

                Results results =new Results();
                buttons.get(z).doClick();
                buttons.get(x).doClick();
                buttons.get(c).doClick();
                buttons.get(v).doClick();
                buttons.get(b).doClick();
                buttons.get(n).doClick();

            }
        });


        /////////////////////////////////////SREDNIOZAAWANSOWANY//////////////////////////////


    }//Menu kon




    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            s= String.valueOf(monney);
            label5.setText(s);
        }
    };




}// Menu class
