package janelas.paineis;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;
import java.util.EventListener;

public class Painel_Dados_Login extends JPanel {
    JTextField email;
    JTextField senha;
    JButton botao;
    public Painel_Dados_Login(){
        JLabel titulo =  new JLabel("Dados de login");
        titulo.setMinimumSize(Constantes.Pdimension);
        titulo.setFont(Constantes.Lfont);
        email = new JTextField("Email");
        email.setAlignmentX(JTextField.CENTER);
        email.setMaximumSize(Constantes.Pdimension);
        senha = new JTextField("Senha");
        senha.setAlignmentX(JTextField.CENTER);
        senha.setMaximumSize(Constantes.Pdimension);
        botao = new JButton("Confirmar");
        botao.setAlignmentX(JButton.CENTER);
        botao.setMaximumSize(Constantes.Pdimension);
        botao.addActionListener(e ->{
            //Salvar os textFields
        });


        BoxLayout layout =  new BoxLayout(this, BoxLayout.Y_AXIS);

        this.setLayout(layout);
        this.setBackground(Constantes.PanelColor);
        this.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        this.add(titulo);
        this.add(email);
        this.add(Box.createRigidArea(new Dimension(50,30)));
        this.add(senha);
        this.add(Box.createRigidArea(new Dimension(50,30)));
        this.add(botao);



    }
}
