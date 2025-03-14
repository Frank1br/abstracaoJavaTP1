package br.edu.fatecpg.abstacao.model;

public class Telescopio {
    public String tipo;
    public double abertura; // em milímetros
    public int aumentoMaximo;

    public Telescopio(String tipo, double abertura, int aumentoMaximo) {
        this.tipo = tipo;
        this.abertura = abertura;
        this.aumentoMaximo = aumentoMaximo;
    }

    public void observarEstrela(String estrela) {
        System.out.println("Observando a estrela " + estrela + " com um telescópio do tipo " + tipo + ".");
    }

    public void ajustarFoco() {
        System.out.println("Ajustando o foco do telescópio...");
    }

    public void mostrarDetalhes() {
        System.out.println("Telescópio do tipo " + tipo + " com abertura de " + abertura + "mm e aumento máximo de " + aumentoMaximo + "x.");
    }

    
}

