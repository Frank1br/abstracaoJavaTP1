package br.edu.fatecpg.abstacao.model;

public class Tigre {
    public String nome;
    public int idade;
    public double peso; // em kg

    public Tigre(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void rugir() {
        System.out.println(nome + " está rugindo ferozmente!");
    }

    public void caçar() {
        System.out.println(nome + " está caçando na selva.");
    }

    public void descansar() {
        System.out.println(nome + " está descansando à sombra de uma árvore.");
    }

    
}

