package Aula06;

public class Controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //controtudor

    public Controle() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    //GET e SETS

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado " + getLigado());
        System.out.println("Está tocando " + getTocando());
        System.out.print("Volume: " + getVolume());
        for(int i = 0; i <= getVolume(); i+= 10){
            System.out.print(" | ");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(getLigado()) setVolume(getVolume() + 5);
    }

    @Override
    public void menosVolume() {
        if(getLigado()) setVolume(getVolume() - 5);
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0) setVolume(0);
    }

    @Override
    public void desliogarMudo() {
        if(getLigado() && getVolume() > 0) setVolume(50);
    }

    @Override
    public void play() {
        if(getLigado() && !getTocando()) this.setTocando(true);
    }

    @Override
    public void pause() {
        if(getLigado() && getTocando()) this.setTocando(false);
    }
}