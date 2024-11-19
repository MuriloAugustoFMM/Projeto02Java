package janelas;

import janelas.paineis.PainelPadrao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextFieldPadrao extends JTextField {
    protected static int TFwidth = 150;
    protected static int TFheight = 50;

    public TextFieldPadrao(String str,int x, int y){
        this.setBounds(0,0,TFwidth,TFheight);
        this.setText(str);
        this.CentralizarNoContainer(x,y);

    }
    public TextFieldPadrao(String str){
        this.setBounds(0,0,TFwidth,TFheight);
        this.setText(str);

    }

    public void CentralizarNoContainer(int x, int y){
        this.setBounds(x/2 - TFwidth/2,y/2 - TFheight/2,TFwidth,TFheight);
    }

    public void AlinharAbaixo(Component c){
        this.setBounds( c.getX() , c.getY() + TFheight ,TFwidth,TFheight );

    }

}
