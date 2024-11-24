package janelas.paineis;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;

public class Painel_Dados_Academicos extends JPanel {
    JTextField curso;
    JTextField periodo;
    JTextField periodosTotais;
    public  Painel_Dados_Academicos(){
        JLabel titulo =  new JLabel("Dados academicos");
        titulo.setMinimumSize(Constantes.Pdimension);
        titulo.setFont(Constantes.Lfont);
        curso =  new JTextField("Curso");
        curso.setMaximumSize(Constantes.Pdimension);
        curso.setAlignmentX(JTextField.CENTER);
        periodo = new JTextField("Periodo");
        periodo.setMaximumSize(Constantes.Pdimension);
        periodo.setAlignmentX(JTextField.CENTER);
        periodosTotais = new JTextField("Periodos totais");
        periodosTotais.setMaximumSize(Constantes.Pdimension);
        periodosTotais.setAlignmentX(JTextField.CENTER);



        BoxLayout layout =  new BoxLayout(this,BoxLayout.Y_AXIS);
        this.setLayout(layout);
        this.setBackground(Constantes.PanelColor);
        this.setAlignmentX(JPanel.CENTER_ALIGNMENT);

        this.add(titulo);
        this.add(curso);
        this.add(Box.createRigidArea(new Dimension(50,30)));
        this.add(periodo);
        this.add(Box.createRigidArea(new Dimension(50,30)));
        this.add(periodosTotais);



    }

}
