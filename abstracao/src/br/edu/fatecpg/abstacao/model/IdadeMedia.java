package br.edu.fatecpg.abstacao.model;

public class IdadeMedia {
    public String periodo;
    public int inicioAno;
    public int fimAno;

    public IdadeMedia(String periodo, int inicioAno, int fimAno) {
        this.periodo = periodo;
        this.inicioAno = inicioAno;
        this.fimAno = fimAno;
    }

    public void descreverPeriodo() {
        System.out.println("A " + periodo + " ocorreu entre " + inicioAno + " e " + fimAno + ".");
    }

    public void mencionarEvento() {
        System.out.println("A Peste Negra foi um dos eventos mais marcantes da Idade Média.");
    }

    public void falarSobreCultura() {
        System.out.println("A Idade Média teve forte influência da Igreja Católica.");
    }

    
}

