package janelas;

import javax.swing.*;
import java.awt.*;

public class JanelaPadrao extends JFrame {
    protected Color bColor = new Color(32,10,104,255);
    public static int WIDTH = 960;
    public static int HEIGHT = 720;

    public JanelaPadrao(){

        this.setLayout(null);
        this.setBounds(0,0,WIDTH,HEIGHT);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(bColor);



    }
}
