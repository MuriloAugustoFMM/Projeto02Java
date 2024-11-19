package janelas;

import javax.swing.*;
import java.awt.*;

public class JanelaPadrao {
    public static Color bColor = new Color(32,10,104,255);
    public static int WIDTH = 960;
    public static int HEIGHT = 720;



    public void CentrarlizarJanela(Component c){
        c.setBounds(WIDTH/2 - c.getWidth(), HEIGHT/2 - c.getHeight(),c.getWidth(),c.getHeight());
    }
}
