package br.edu.fatecpg.abstacao.model;

public class Pintura {
    public String artista;
    public String titulo;
    public int ano;

    public Pintura(String artista, String titulo, int ano) {
        this.artista = artista;
        this.titulo = titulo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("A obra '" + titulo + "' foi criada por " + artista + " no ano de " + ano + ".");
    }

    public void restaurar() {
        System.out.println("A pintura '" + titulo + "' está sendo restaurada.");
    }

    public void expor() {
        System.out.println("A pintura '" + titulo + "' está em exposição.");
    }

    
}
