package Aula04;

public class Caneta {

    private String modelo;
    private String cor;
    private Boolean tampada;
    private float ponta;
    //Construtor
    public Caneta(String modelo, String cor, Boolean tampada, float ponta){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setTampada(tampada);
        this.setPonta(ponta);
    }
    //GETS
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Boolean getTampada() {
        return tampada;
    }

    public float getPonta() {
        return ponta;
    }
    //SETS
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(Boolean tampada) {
        this.tampada = tampada;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    //Outros
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }

}
