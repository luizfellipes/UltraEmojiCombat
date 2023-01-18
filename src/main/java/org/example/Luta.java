package org.example;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiando;
    private int rounds;
    private Boolean aprovada;

    public Luta() {
        this.desafiado = desafiado;
        this.desafiando = desafiando;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiando() {
        return desafiando;
    }

    public void setDesafiando(Lutador desafiando) {
        this.desafiando = desafiando;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiando = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiando = null;
        }

    }

    public void lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiando.apresentar();
            int vencedor = (int) (Math.random() * 3);
            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empate !");
                    this.desafiado.empatarLuta();
                    this.desafiando.empatarLuta();
                }
                case 1 -> {
                    System.out.println("desafiado ganhou a luta");
                    this.desafiado.ganharLuta();
                    this.desafiando.perderLuta();
                }
                case 2 -> {
                    System.out.println("desafiando ganhou a luta !");
                    this.desafiado.perderLuta();
                    this.desafiando.ganharLuta();
                }
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }


}
