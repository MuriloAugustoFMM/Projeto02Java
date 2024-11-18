package janelas.paineis;

import janelas.JanelaPadrao;

import javax.swing.*;
import java.awt.*;

public class PainelPadrao extends JPanel {

    public PainelPadrao(){
        this.setLayout(null);
        this.setVisible(true);
        this.setBounds(JanelaPadrao.WIDTH/2,JanelaPadrao.HEIGHT/2,500,200);
    }
}
