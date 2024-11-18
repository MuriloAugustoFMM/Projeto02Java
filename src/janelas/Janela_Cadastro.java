package janelas;

import janelas.paineis.Painel_C_Usuario;

import javax.swing.*;
import java.awt.*;

public class Janela_Cadastro extends JanelaPadrao {

    public Janela_Cadastro(){
        this.add(new Painel_C_Usuario());
        this.setTitle("Cadastro");
        this.setVisible(true);

    }


}
