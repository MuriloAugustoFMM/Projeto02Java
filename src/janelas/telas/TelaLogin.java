package janelas.telas;

import janelas.Constantes;
import janelas.JanelaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaLogin extends TelaPadrao {
    Container container;
    JanelaPrincipal janelaPrincipal;
    JLabel login;
    JLabel email;
    JTextField temail;
    JLabel senha;
    JTextField tsenha;
    JButton logar;
    private String semail, ssenha;
    public TelaLogin(){

        //container = getContentPane();
        setLayout(null);

        login = new JLabel("Login");
        login.setFont(Constantes.Lfont);
        login.setSize(Constantes.Labeldimension);
        login.setLocation(520,30);
        add(login);


        email = new JLabel("Email");
        email.setFont(Constantes.Lfont);
        email.setSize(Constantes.Labeldimension);
        email.setLocation(520,100);
        add(email);

        temail = new JTextField();
        temail.setSize(Constantes.Labeldimension);
        temail.setLocation(410,150);
        add(temail);

        senha = new JLabel("Senha");
        senha.setFont(Constantes.Lfont);
        senha.setSize(Constantes.Labeldimension);
        senha.setLocation(520,220);
        add(senha);

        tsenha = new JTextField();
        tsenha.setSize(Constantes.Labeldimension);
        tsenha.setLocation(410,270);
        add(tsenha);

        logar = new JButton("Logar");
        logar.setSize(Constantes.Labeldimension);
        logar.setLocation(410,350);
        add(logar);

        setSize(Constantes.JanelaDimensao);
        setBackground(Constantes.baseColor);
    }


}
