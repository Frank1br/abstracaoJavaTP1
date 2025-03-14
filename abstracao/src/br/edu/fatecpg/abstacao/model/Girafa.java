package br.edu.fatecpg.abstacao.model;

public class Girafa {
    public String nome;
    public int idade;
    public double altura; // em metros

    public Girafa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void comer() {
        System.out.println(nome + " está comendo folhas no topo das árvores.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo em pé.");
    }

    public void correr() {
        System.out.println(nome + " está correndo rapidamente.");
    }

    
}
