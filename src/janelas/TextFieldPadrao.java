package janelas;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextFieldPadrao extends JTextField {

    public TextFieldPadrao(String str){
        this.setBounds(0,0,150,50);
        this.setHorizontalAlignment(SwingConstants.CENTER);

        this.setText(str);

    }
}
