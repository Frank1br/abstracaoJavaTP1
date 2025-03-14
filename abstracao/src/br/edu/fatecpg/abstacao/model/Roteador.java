package br.edu.fatecpg.abstacao.model;

public class Roteador {
    public String marca;
    public int velocidadeMbps;
    public boolean wifiLigado;

    public Roteador(String marca, int velocidadeMbps, boolean wifiLigado) {
        this.marca = marca;
        this.velocidadeMbps = velocidadeMbps;
        this.wifiLigado = wifiLigado;
    }

    public void ligarWifi() {
        wifiLigado = true;
        System.out.println("Wi-Fi do roteador " + marca + " ligado.");
    }

    public void desligarWifi() {
        wifiLigado = false;
        System.out.println("Wi-Fi do roteador desligado.");
    }

    public void mostrarInformacoes() {
        System.out.println("Roteador " + marca + " com " + velocidadeMbps + " Mbps.");
    }

   
}
