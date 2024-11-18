package janelas;

import janelas.paineis.PainelPadrao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextFieldPadrao extends JTextField {

    public TextFieldPadrao(String str){
        this.setBounds(0,0,150,50);


        this.setText(str);

    }
}
