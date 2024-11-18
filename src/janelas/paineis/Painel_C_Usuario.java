package janelas.paineis;

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
        // inicialização das caixas de texto
        nome = new TextFieldPadrao("Nome");
        ultimoNome = new TextFieldPadrao("Ultimo Nome");
        anoDeNascimento = new TextFieldPadrao("Ano de Nascimento");
        CPF = new TextFieldPadrao("CPF");

        // Inicializando o Botão
        botao = new JButton();

        // adicionando ao painel
        this.add(nome);
        this.add(ultimoNome);
        this.add(anoDeNascimento);
        this.add(CPF);
        this.add(botao);

        // Definindo suas posições



    }
}
