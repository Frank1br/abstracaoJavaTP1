package br.edu.fatecpg.abstacao.model;

public class Computador {
    public String marca;
    public int memoriaRam; // em GB
    public double processadorGHz; // Velocidade do processador em GHz

    public Computador(String marca, int memoriaRam, double processadorGHz) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.processadorGHz = processadorGHz;
    }

    public void ligar() {
        System.out.println("O computador da marca " + marca + " está ligando...");
    }

    public void executarPrograma(String programa) {
        System.out.println("Executando o programa: " + programa + " com " + memoriaRam + "GB de RAM.");
    }

    public void desligar() {
        System.out.println("O computador está sendo desligado.");
    }

   
}

