package janelas;

import janelas.menus.MenuLateral;
import janelas.paineis.Painel_Central;
import janelas.paineis.Painel_Dados_Usuario;

import javax.swing.*;
import java.awt.*;

public class Janela_Cadastro extends JFrame {


    public Janela_Cadastro(){
        this.setTitle("Cadastro");
        BorderLayout layout =  new BorderLayout();
        this.setLayout(layout);
        this.add(new Painel_Central(),BorderLayout.CENTER);
        this.add(Box.createRigidArea(new Dimension(200,500)),BorderLayout.WEST);
        this.add(Box.createRigidArea(new Dimension(100,500)),BorderLayout.EAST);


        this.setBounds(0,0,Constantes.JanelaWidth,Constantes.JanelaHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Constantes.baseColor);
        this.setVisible(true);

    }


}
