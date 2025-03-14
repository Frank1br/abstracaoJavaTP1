package br.edu.fatecpg.abstacao.model;

public class Celula {
    public String tipo;
    public int quantidade;
    public String funcao;

    public Celula(String tipo, int quantidade, String funcao) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.funcao = funcao;
    }

    public void dividir() {
        System.out.println("A célula do tipo " + tipo + " está se dividindo.");
    }

    public void especializar() {
        System.out.println("A célula do tipo " + tipo + " está se especializando para a função: " + funcao);
    }

    public void exibirInfo() {
        System.out.println("Célula do tipo " + tipo + ", quantidade: " + quantidade + ", função: " + funcao);
    }

    
}
