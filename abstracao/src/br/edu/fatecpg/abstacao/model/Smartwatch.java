package br.edu.fatecpg.abstacao.model;

public class Smartwatch {
    public String marca;
    public String modelo;
    public boolean monitoramentoCardiaco;

    public Smartwatch(String marca, String modelo, boolean monitoramentoCardiaco) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitoramentoCardiaco = monitoramentoCardiaco;
    }

    public void exibirHora() {
        System.out.println("O smartwatch " + modelo + " da marca " + marca + " exibe a hora atual.");
    }

    public void monitorarBatimentos() {
        if (monitoramentoCardiaco) {
            System.out.println("Monitorando os batimentos cardíacos...");
        } else {
            System.out.println("Este modelo não possui monitoramento cardíaco.");
        }
    }

    public void receberNotificacao(String notificacao) {
        System.out.println("Nova notificação: " + notificacao);
    }

   
}
