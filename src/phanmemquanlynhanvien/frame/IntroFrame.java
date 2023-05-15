package phanmemquanlynhanvien.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IntroFrame extends JFrame implements ActionListener {

    private JLabel heading;
    private JButton clickHereButton;

    public IntroFrame() throws InterruptedException {
        this.getContentPane().setBackground(Color.CYAN);
        this.setSize(1170, 650);
        this.setLocation(200, 50);
        this.setLayout(null);

        heading = new JLabel("PHAN MEM QUAN LY NHAN VIEN");
        heading.setBounds(110, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.black);
        this.add(heading);

        clickHereButton = new JButton("NHAN DE TIEP TUC");
        clickHereButton.setBounds(400, 400, 300, 70);
        clickHereButton.setBackground(Color.PINK);
        clickHereButton.setForeground(Color.BLUE);
        clickHereButton.addActionListener(this);
        clickHereButton.setFocusable(false);
        this.add(clickHereButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        while (true) {
            heading.setVisible(false);
            Thread.sleep(500);
            heading.setVisible(true);
            Thread.sleep(500);

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    public static void main(String[] arss) {
        try {
            new IntroFrame();
        } catch (InterruptedException ex) {
            Logger.getLogger(IntroFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
