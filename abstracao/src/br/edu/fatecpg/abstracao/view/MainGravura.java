package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Gravura;

public class MainGravura {
	
	public static void main(String[] args) {
        Gravura gravura = new Gravura("Xilogravura", 30.5, "10/05/2020");
        gravura.exibirDetalhes();
        gravura.analisarTecnica();
        gravura.verificarEstado();
    }
}
