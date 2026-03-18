package Aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    //GETS e SETS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //Metodos

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            return;
        }

        this.setAprovada(false);
        this.setDesafiante(null);
        this.setDesafiado(null);
    }

    public void luta(){
        if(this.isAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " Ganhou a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " Ganhou a luta!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                default:
                    System.out.println("Erro: luta canselada por motivos desconhecidos");
                    break;
            }
        } else {
            System.out.println("luta imposivel");
        }

    }

}
