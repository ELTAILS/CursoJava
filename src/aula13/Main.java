package aula13;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        c1.reagir("Oi");
        c1.reagir("Vai apanhar");
        System.out.println("---------------------");
        c1.reagir(11);
        c1.reagir(21);
        System.out.println("---------------------");
        c1.reagir(true);
        c1.reagir(false);
        System.out.println("---------------------");
        c1.reagir(2,12.5);
        c1.reagir(17,4.5);
    }
}
