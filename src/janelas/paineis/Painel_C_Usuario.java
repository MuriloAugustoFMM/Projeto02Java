package janelas.paineis;

import janelas.JanelaPadrao;
import janelas.Janela_Cadastro;
import janelas.TextFieldPadrao;

import javax.swing.*;
import java.awt.*;


public class Painel_C_Usuario extends PainelPadrao {
    TextFieldPadrao nome;
    TextFieldPadrao ultimoNome;
    TextFieldPadrao anoDeNascimento;
    TextFieldPadrao CPF;
    JButton botao;

    public Painel_C_Usuario(){
        this.setBackground(JanelaPadrao.bColor);
        this.setLayout(new GridLayout(3,2));
        // inicialização das caixas de texto
        nome = new TextFieldPadrao("Nome");
        ultimoNome = new TextFieldPadrao("Ultimo Nome",this);
        anoDeNascimento = new TextFieldPadrao("Ano De Nascimento",this);
        CPF = new TextFieldPadrao("CPF",this);

        // Inicializando o Botão
        botao = new JButton();

        // adicionando ao painel
        this.add(nome);
        this.add(ultimoNome);
        this.add(anoDeNascimento);
        this.add(CPF);
        this.add(botao);







    }


}
