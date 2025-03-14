package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Professor;

public class MainProfessor {

	public static void main(String[] args) {
        Professor professor = new Professor("Carlos", 40, "Matemática");

        professor.ensinar();
        professor.avaliar(8);
        professor.corrigirProvas(9);
    }

}
