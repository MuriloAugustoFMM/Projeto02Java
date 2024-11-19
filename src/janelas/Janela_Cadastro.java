package janelas;

import janelas.paineis.Painel_C_Usuario;

import javax.swing.*;
import java.awt.*;

public class Janela_Cadastro extends JFrame {
    Painel_C_Usuario painelCUsuario = new Painel_C_Usuario();

    public Janela_Cadastro(){
        this.setTitle("Cadastro");
        this.setLayout(new FlowLayout());
        this.add(painelCUsuario);
        this.setBounds(0,0,JanelaPadrao.WIDTH,JanelaPadrao.HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(JanelaPadrao.bColor);
        this.setVisible(true);

    }


}
