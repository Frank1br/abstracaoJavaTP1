package br.edu.fatecpg.abstacao.model;

public class Cinema {
    public String local;
    public String filme;
    public double precoIngresso;

    public Cinema(String local, String filme, double precoIngresso) {
        this.local = local;
        this.filme = filme;
        this.precoIngresso = precoIngresso;
    }

    public void assistirFilme() {
        System.out.println("Assistindo ao filme '" + filme + "' no cinema localizado em " + local);
    }

    public void comprarIngresso() {
        System.out.println("Ingresso comprado para '" + filme + "' pelo valor de R$" + precoIngresso);
    }

    public void exibirInfo() {
        System.out.println("Cinema localizado em " + local + ", exibindo '" + filme + "', ingresso por R$" + precoIngresso);
    }

   
}


