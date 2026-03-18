package Aula05;

public class ContaUsuario {
    static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco("Wagner Junior");
        conta1.abrirConta("cc");
        conta1.depositar(1000.0f);
        conta1.rendimento(6);
        System.out.println(conta1.getSaldo());
    }
}

