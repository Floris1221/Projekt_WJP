import javax.swing.*;

public class StartGUI extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton nowicjuszButton;
    private JButton poczatkujacyButton;
    private JButton sredniozaawansowanyButton;
    private JButton zaawanowasnyButton;

    StartGUI(){
        super("Językomania");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setSize(500,300);
    }

    public static void main(String[] args) {
        JFrame frame=new StartGUI();
        frame.setVisible(true);

    }
}
