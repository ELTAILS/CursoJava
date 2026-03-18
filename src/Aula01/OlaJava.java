package Aula01;

import java.util.Scanner;

public class OlaJava {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual seu nome");
        String nome = sc.nextLine();
        System.out.printf("Bem vindo: " + nome);
    }
}
