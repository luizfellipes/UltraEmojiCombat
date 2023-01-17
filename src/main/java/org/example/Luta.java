package org.example;

public class Luta {
    private String desafiado;
    private String desafiando;
    private int rounds;
    private String aprovada;

    public Luta(String desafiado, String desafiando, int rounds, String aprovada) {
        this.desafiado = desafiado;
        this.desafiando = desafiando;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiando() {
        return desafiando;
    }

    public void setDesafiando(String desafiando) {
        this.desafiando = desafiando;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getAprovada() {
        return aprovada;
    }

    public void setAprovada(String aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta() {

    }

    public void lutar(){

    }
}
