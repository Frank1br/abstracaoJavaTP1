package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Desenho;

public class MainDesenho {

	public static void main(String[] args) {
        Desenho desenho = new Desenho("Lápis", 30.0, "Complexo");
        desenho.descreverDesenho();
        desenho.apresentarDimensao();
        desenho.adicionarDetalhes();
    }
}
