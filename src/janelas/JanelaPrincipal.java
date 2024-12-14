package janelas;

import janelas.links.Links;
import janelas.telas.TelaCadastro;
import janelas.telas.TelaLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JanelaPrincipal extends JFrame {
    TelaLogin telaLogin;
    TelaCadastro telaCadastro;
    Integer tela = 0;
    Container container;
    Links links;
    public JanelaPrincipal(){
        links = new Links();

        container = getContentPane();//container da janela

        telaLogin = new TelaLogin();//tela de login

        telaCadastro = new TelaCadastro();//tela de cadastro

        definirTela();

        links.linkCadastro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tela = 1;
                definirTela();
            }
        });
        links.linkLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tela = 0;
                definirTela();
            }
        });


        setLayout(null);
        setSize(Constantes.JanelaDimensao);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void definirTela(){
        switch (tela){
         case 0:
             container.removeAll();
             container.add(telaLogin);
             container.repaint();
             telaLogin.add(links.linkCadastro);
             break;
         case 1:
             container.removeAll();
             container.add(telaCadastro);
             container.repaint();
             telaCadastro.add(links.linkLogin);

             break;
        }
}

}
