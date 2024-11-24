package janelas.paineis;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;

public class Painel_Dados_Usuario extends JPanel {
    JTextField nome;
    JTextField ultimoNome;
    JTextField anoNascimento;
    JTextField CPF;
    public Painel_Dados_Usuario(){

        JLabel titulo =  new JLabel("Dados do usuário");
        titulo.setMinimumSize(Constantes.Pdimension);
        titulo.setFont(Constantes.Lfont);
        nome = new JTextField("Nome");
        nome.setAlignmentX(JTextField.CENTER);
        nome.setMaximumSize(Constantes.Pdimension);
        ultimoNome = new JTextField("Ultimo Nome");
        ultimoNome.setAlignmentX(JTextField.CENTER);
        ultimoNome.setMaximumSize(Constantes.Pdimension);
        anoNascimento = new JTextField("Ano Nascimento");
        anoNascimento.setAlignmentX(JTextField.CENTER);
        anoNascimento.setMaximumSize(Constantes.Pdimension);
        CPF = new JTextField("CPF");
        CPF.setAlignmentX(JTextField.CENTER);
        CPF.setMaximumSize(Constantes.Pdimension);

        BoxLayout layout =  new BoxLayout(this,BoxLayout.Y_AXIS);



        this.setBackground(Constantes.PanelColor);
        this.setLayout(layout);
        this.add(titulo);
        this.setAlignmentX(JPanel.CENTER_ALIGNMENT);

        //this.setMaximumSize(new Dimension(500,100));
        this.add(nome);
        this.add(Box.createRigidArea(new Dimension(50,30)));
        this.add(ultimoNome);
        this.add(Box.createRigidArea(new Dimension(50,30)));
        this.add(anoNascimento);








    }
}
