package br.edu.fatecpg.abstacao.model;

public class Osmose {
    public String tipo;
    public String meio; 
    public boolean transportePassivo;

    public Osmose(String tipo, String meio, boolean transportePassivo) {
        this.tipo = tipo;
        this.meio = meio;
        this.transportePassivo = transportePassivo;
    }

    public void explicarProcesso() {
        System.out.println("A osmose move a água do meio " + meio + " para um com mais solutos.");
    }

    public void mostrarExemplo() {
        System.out.println("Um exemplo é a absorção de água pelas raízes das plantas.");
    }

    public void verificarTransporte() {
        System.out.println("A osmose é um transporte " + (transportePassivo ? "passivo" : "ativo") + ".");
    }

    
}

