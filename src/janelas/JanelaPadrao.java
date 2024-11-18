package janelas;

import javax.swing.*;
import java.awt.*;

public class JanelaPadrao extends JFrame {
    protected Color bColor = new Color(32,10,104,255);
    public JanelaPadrao(){

        this.setLayout(null);
        this.setBounds(0,0,960,720);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(bColor);



    }
}
