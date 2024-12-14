package janelas.telas;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends TelaPadrao {
    JLabel nome, ultimonome, sexo, telefone, email, senha;
    JTextField tnome, tultimonome, tsexo, ttelefone, temail, tsenha;
    public TelaCadastro(){
        nome = new JLabel("Nome");
        nome.setFont(Constantes.Lfont);
        nome.setSize(Constantes.Labeldimension);
        nome.setLocation(500,30);
        add(nome);

        tnome = new JTextField();
        tnome.setSize(Constantes.Labeldimension);
        tnome.setLocation(420,80);
        add(tnome);

        ultimonome = new JLabel("Ultimo Nome");
        ultimonome.setFont(Constantes.Lfont);
        
        setSize(Constantes.JanelaDimensao);



    }
}
