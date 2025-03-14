package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Tigre;

public class MainTigre {

	public static void main(String[] args) {
        Tigre tigre = new Tigre("Rajah", 7, 220);
        tigre.rugir();
        tigre.caçar();
        tigre.descansar();
    }

}
