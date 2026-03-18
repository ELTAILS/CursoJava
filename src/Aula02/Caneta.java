package Aula02; // e 3

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada = true;

    public void rabiscar(){
        if(this.tampada){
            System.out.println("A caneta está tampada");
        } else {
            System.out.println("Rabisco");
        }
    }

    public void pintar(){
        System.out.println((!this.tampada) ? "pintando" : "A caneta está tampada");
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Caneta Status");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("tampada: " + this.tampada);
    }

}
