import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.ArrayList;

public class Task3 extends JFrame {
    URL url = getClass().getResource("/grass.jpg");
    ImageIcon img = new ImageIcon(url);
    JLabel tlo = new JLabel(img);
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    public JButton nastepneButton = new JButton("Następne");
    private JButton odpowiedzButton = new JButton("Odpowiedź");
    private JButton infoButton = new JButton("Info");
    private JPanel panel1 = new JPanel();
    private  JButton sprawdzButton = new JButton("SPRAWDZ");
    public ArrayList <JLabel> labels = new ArrayList<JLabel>();
    public  ArrayList <Integer> correctAnswer = new ArrayList<Integer>();
    private Point pointPressed;
    public int k;
    public int x;
    public int x1;
    public Dimension d;
    boolean test;



    Task3(int nbol,int nastepne,boolean test) {
        super("Zadanie");
        this.test = test;
        d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d);
        this.setVisible(true);


        panel1.setSize(d.width, d.height / 5);
        panel1.setLocation(0, (d.height*2/5)-50);
        panel1.setBackground(Color.cyan);


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
        infoButton.setSize(100,55);
        infoButton.setFont(new Font("Calibri",Font.BOLD,20));
        infoButton.setFocusPainted(false);




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
                String odpowiedz = "";
                for(int i=0;i<labels.size();i++){
                    odpowiedz=odpowiedz+labels.get(correctAnswer.get(i)).getText()+" ";
                }
                JOptionPane.showMessageDialog(null,odpowiedz);
            }
        });

        sprawdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean corect = false;

                for(int i =0;i<labels.size()-1;i++){
                    if(labels.get(correctAnswer.get(i)).getX()<labels.get(correctAnswer.get(i+1)).getX()){
                        corect=true;
                    }else {
                        corect=false;
                        break;
                    }
                }

                if (corect){
                    Main.f.m.pktTest =Main.f.m.pktTest + 75;
                    Menu.monney =Menu.monney + 75;
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


    }//Task 3 kon


    void AddLabels(int x1, Dimension d,int k){
        for(int i =0;i<labels.size();i++){
            labels.get(i).setSize(85, 30);
            labels.get(i).setLocation(x1,d.height*3/5);
            labels.get(i).setOpaque(true);
            labels.get(i).setBackground(Color.WHITE);
            labels.get(i).addMouseMotionListener(slowaDragged);
            labels.get(i).addMouseListener(slowaPressed);
            labels.get(i).addMouseListener(slowaDrop);
            tlo.add(labels.get(i));
            x1=x1+k;
        }
        tlo.add(sprawdzButton);
        tlo.add(infoButton);
        tlo.add(odpowiedzButton);
        tlo.add(nastepneButton);
        tlo.add(label1);
        tlo.add(label2);
        tlo.add(panel1);
        this.add(tlo);

    }






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

    MouseAdapter slowaDrop = new MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            JComponent comp = (JLabel)e.getSource();
            int x = 10;
            int k =x+135;
            boolean Allinpanel = false;
            boolean corect = false;
            if(comp.getY()>panel1.getY() && comp.getY()<(panel1.getY()+panel1.getHeight())){
                for(int i=0;i<labels.size();i++){
                    if(labels.get(i).getY()>panel1.getY() && labels.get(i).getY()<(panel1.getY()+panel1.getHeight())){
                        x=x+k;
                    }
                }
                comp.setLocation(x,panel1.getY()+(panel1.getHeight()/2));
                for(int j=0;j<labels.size();j++){
                    if(labels.get(j).getY()>panel1.getY() && labels.get(j).getY()<(panel1.getY()+panel1.getHeight())){
                        Allinpanel=true;
                    }else{
                        Allinpanel=false;
                        break;
                    }
                }

                if (Allinpanel){
                    sprawdzButton.setEnabled(true);
                }else{
                    sprawdzButton.setEnabled(false);
                }


                for(int i =0;i<labels.size()-1;i++){
                    if(labels.get(correctAnswer.get(i)).getX()<labels.get(correctAnswer.get(i+1)).getX() && Allinpanel){
                        corect=true;
                    }else {
                        corect=false;
                        break;
                    }
                }
            }
            if (corect){
                nastepneButton.setEnabled(true);
            }else{
                nastepneButton.setEnabled(false);
            }


        }
    };


}
