package janelas.telas;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends TelaPadrao {
    JLabel nome, ultimonome, sexo, telefone, email, senha;
    JTextField tnome, tultimonome, ttelefone, temail, tsenha;
    JRadioButton homem, mulher;
    ButtonGroup sexos;
    JButton submit;
    public TelaCadastro(){
        nome = new JLabel("Nome:");
        nome.setFont(Constantes.Lfont);
        nome.setSize(Constantes.Labeldimension);
        nome.setLocation(20,30);
        add(nome);

        tnome = new JTextField();
        tnome.setSize(Constantes.Labeldimension);
        tnome.setLocation(nome.getX() + 120,30);
        add(tnome);

        ultimonome = new JLabel("Ultimo Nome:");
        ultimonome.setFont(Constantes.Lfont);
        ultimonome.setSize(Constantes.Labeldimension);
        ultimonome.setLocation(20,130);
        add(ultimonome);

        tultimonome = new JTextField();
        tultimonome.setSize(Constantes.Labeldimension);
        tultimonome.setLocation(ultimonome.getX() + 220,ultimonome.getY());
        add(tultimonome);

        sexo = new JLabel("Sexo:");
        sexo.setSize(Constantes.Labeldimension);
        sexo.setFont(Constantes.Lfont);
        sexo.setLocation(20,230);
        add(sexo);

        homem = new JRadioButton("Homem");
        homem.setFont(Constantes.radioFont);
        homem.setSize(130,50);
        homem.setLocation(sexo.getX() + 120,sexo.getY());

        mulher = new JRadioButton("Mulher");
        mulher.setFont(Constantes.radioFont);
        mulher.setSize(130,50);
        mulher.setLocation(sexo.getX() + 120,sexo.getY() + 50);

        sexos = new ButtonGroup();
        sexos.add(homem);
        sexos.add(mulher);

        add(homem);
        add(mulher);

        telefone = new JLabel("Telefone:");
        telefone.setFont(Constantes.Lfont);
        telefone.setSize(Constantes.Labeldimension);
        telefone.setLocation(20,350);
        add(telefone);

        ttelefone = new JTextField();
        ttelefone.setSize(Constantes.Labeldimension);
        ttelefone.setLocation(telefone.getX() + 160,telefone.getY());
        add(ttelefone);

        email = new JLabel("Email:");
        email.setFont(Constantes.Lfont);
        email.setSize(Constantes.Labeldimension);
        email.setLocation(20,450);
        add(email);

        temail = new JTextField();
        temail.setSize(Constantes.Labeldimension);
        temail.setLocation(email.getX() + 120,email.getY());
        add(temail);

        senha = new JLabel("Senha:");
        senha.setFont(Constantes.Lfont);
        senha.setSize(Constantes.Labeldimension);
        senha.setLocation(20,550);
        add(senha);

        tsenha = new JTextField();
        tsenha.setSize(Constantes.Labeldimension);
        tsenha.setLocation(sexo.getX() + 120,senha.getY());
        add(tsenha);

        submit =  new JButton("Enviar");
        submit.setSize(Constantes.Labeldimension);
        submit.setLocation(40,620);
        add(submit);
        setSize(Constantes.JanelaDimensao);



    }
}
