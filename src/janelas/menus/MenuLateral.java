package janelas.menus;

import javax.swing.*;
import java.awt.*;

public class MenuLateral extends JMenuBar {
    public MenuLateral(){
        this.setLayout(new FlowLayout());
        for(int i =0; i < 5; i++){
            this.add(new JMenuItem());
        }
        this.setVisible(true);

    }
}
