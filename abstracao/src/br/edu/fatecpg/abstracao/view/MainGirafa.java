package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Girafa;

public class MainGirafa {

	public static void main(String[] args) {
        Girafa girafa = new Girafa("Mel", 5, 4.5);
        girafa.comer();
        girafa.dormir();
        girafa.correr();
    }

}
