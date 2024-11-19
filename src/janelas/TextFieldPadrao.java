package janelas;

import janelas.paineis.PainelPadrao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextFieldPadrao extends JTextField{
    protected static int TFwidth = 150;
    protected static int TFheight = 50;

    public TextFieldPadrao(String str,Component c){
        this.setBounds(0,0,TFwidth,TFheight);
        this.setText(str);
        this.setVisible(true);

    }
    public TextFieldPadrao(String str){
        this.setBounds(0,0,TFwidth,TFheight);
        this.setText(str);
        this.setVisible(true);
    }


}
