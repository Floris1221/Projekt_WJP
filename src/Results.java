import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.Formatter;
import java.util.Timer;
import java.util.TimerTask;

public class Results extends JFrame {
    URL url = getClass().getResource("/Zad.jpg");
    URL url2 = getClass().getResource("/wood3.png");
    ImageIcon wood1;
    ImageIcon wood2;
    ImageIcon img = new ImageIcon(url);
    JLabel tlo = new JLabel(img);
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    Formatter f = new Formatter();
    int p;
    public static int coins;
    Timer timer=new Timer();
    String s1;
    String s2;
    String s3;
    int ptk;



    Results(){//**Ogólne ustawienia okienka i elementów*
        super("Wyniki");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setResizable(false);
        this.setSize(d.width-d.width/4,d.height-d.height/4);
        this.setVisible(true);
        this.setLocation(d.width/6,d.height/6);
        coins=0;
        p=Menu.odnos;







        label1.setFont(new Font("Calibri",Font.BOLD,20));
        label1.setSize(370,110);
        label1.setLocation(150,(this.getHeight()*2/5)+20);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.CENTER);
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.CENTER);
        label1.setOpaque(true);
        label1.setForeground(Color.WHITE);


        label2.setFont(new Font("Calibri",Font.BOLD,20));
        label2.setSize(220,75);
        label2.setLocation(this.getWidth()-370,label1.getY()-80);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setHorizontalTextPosition(SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.CENTER);
        label2.setOpaque(true);
        label2.setForeground(Color.WHITE);

        wood1=new ImageIcon(new ImageIcon(url2).getImage().getScaledInstance(label1.getWidth()+600,label1.getHeight()+200,Image.SCALE_AREA_AVERAGING));
        wood2=new ImageIcon(new ImageIcon(url2).getImage().getScaledInstance(label2.getWidth()+350,label2.getHeight()+200,Image.SCALE_AREA_AVERAGING));
        label1.setIcon(wood1);
        label2.setIcon(wood2);


        tlo.add(label1);
        tlo.add(label2);
        this.add(tlo);

        //**Zamkniećie okna i odblokowanie następnego poziomu jeśli wynik powyżej połowy*
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                for(int i=9;i<Main.f.m.buttons.size();) {
                    if (Main.f.m.buttons.get(i).isVisible()) {

                    }else{
                        Main.f.m.buttons.get(i).setVisible(true);
                        Main.f.m.buttons.get(i + 1).setEnabled(true);
                    }
                    i=i+10;
                }

            }
        });

        //**Aktywacja timera*
        timer.schedule(timerTask,0,10);



    }//**Results kon*

    //**Zadanie timera który sprawdza czy zdobyte punkty pozwalają odblokować kolejny poziom i wyświetla odpowiedni komunikat*
    //**oraz aktualizuje liczbe zdobytych punktów i zarobionych monet*
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            ptk=Main.f.m.pktTest-p;
            s1="<html>Niestety nie udało Ci się zaliczyć, testu twój wynik to: "+ptk + " na "+450+ " możliwych</html>";
            s2="<html>Brawo!! Zdobyłeś "+ptk+" na "+450+" możliwych</html>";
            s3 ="Zarobiłeś "+coins+" $";
            if(ptk>224)
                label1.setText(s2);
            else
                label1.setText(s1);
            label2.setText(s3);

        }
    };




}//**Results class*
