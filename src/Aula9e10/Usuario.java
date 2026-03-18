package Aula9e10;

public class Usuario {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        //Registrando pessoas
        p[0] = new Pessoa("Wagner Junior",19,"M");
        p[1] = new Pessoa("Guilherme",18,"M");
        p[2] = new Pessoa("Nicole", 21, "F");

        Livro[] l = new Livro[3];
        //Registrando livros
        l[0] = new Livro("Demon Slayer - Kimetsu No Yaiba Vol. 1","Koyoharu Gotouge",192,p[1]);
        l[1] = new Livro("Tokyo Ghoul Vol. 1","Sui Ishida",224,p[0]);
        l[2] = new Livro("Ataque Dos Titãs Vol. 1","Hajime Isayama",192,p[2]);

        l[1].abrir();
        l[1].folhear(100);
        l[1].detalhes();

    }
}
