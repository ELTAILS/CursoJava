package Aula02;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "caneta azul";
        c1.destampar();
        c1.carga = 1;
        c1.status();
        System.out.println("caneta 2");
        teste();
    }

    public static void teste(){
        Caneta c2 = new Caneta();
        c2.modelo = "caneta vermelha";
        c2.destampar();
        c2.carga = 2;
        c2.status();
    }

}
