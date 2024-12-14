package janelas.links;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;

public class Links {
    public JLabel linkCadastro;
    public JLabel linkLogin;

    public Links(){
        linkCadastro = new JLabel("NAO TENHO CONTA");
        linkCadastro.setForeground(Color.BLUE);
        linkCadastro.setSize(Constantes.linkDimension);
        linkCadastro.setLocation(410,400);

        linkLogin = new JLabel("JA TENHO CONTA");
        linkLogin.setForeground(Color.BLUE);
        linkLogin.setSize(Constantes.linkDimension);
        linkLogin.setLocation(390,620);


    }
}
