package br.edu.fatecpg.abstacao.model;

public class Trem {
    public String modelo;
    public int capacidadePassageiros;
    public double velocidadeMaxima; // em km/h

    public Trem(String modelo, int capacidadePassageiros, double velocidadeMaxima) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void partir() {
        System.out.println("O trem " + modelo + " está partindo da estação.");
    }

    public void parar() {
        System.out.println("O trem " + modelo + " está parando na estação.");
    }

    public void exibirInformacoes() {
        System.out.println("Trem modelo " + modelo + ", capacidade para " + capacidadePassageiros + " passageiros, velocidade máxima de " + velocidadeMaxima + " km/h.");
    }

    
}

