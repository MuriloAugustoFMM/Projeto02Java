package janelas.links;

import janelas.Constantes;

import javax.swing.*;
import java.awt.*;

public class Links {
    public JLabel linkCadastro;
    public JLabel linkLogin;

    public Links(){
        linkCadastro = new JLabel("<html>Ir para a Tela Secundária</html>");
        linkCadastro.setForeground(Color.BLUE);
        linkCadastro.setSize(Constantes.Labeldimension);
        linkCadastro.setLocation(410,400);

        linkLogin = new JLabel("<html>Ir para a Tela Secundária</html>");
        linkLogin.setForeground(Color.BLUE);
        linkLogin.setSize(Constantes.Labeldimension);
        linkLogin.setLocation(410,400);


    }
}
