package janelas.paineis;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;

public class Painel_Central extends JPanel {

    public Painel_Central(){
        BoxLayout layout = new BoxLayout(this,BoxLayout.Y_AXIS);
        JLabel titulo = new JLabel("Cadastro Usuário");
        titulo.setAlignmentX(JLabel.LEFT);
        titulo.setFont(Constantes.Lfont);
        this.setLayout(layout);
        this.setBackground(Constantes.PanelColor);
        this.add(titulo);
        this.add(Box.createRigidArea(new Dimension(50,25)));
        this.add(new Painel_Dados_Usuario());
        this.add(Box.createRigidArea(new Dimension(50,50)));
        this.add(new Painel_Dados_Academicos());
        this.add(Box.createRigidArea(new Dimension(50,50)));
        this.add(new Painel_Dados_Login());


    }
}
