package DesafioJavaPooCursoVideo;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de PHP");
        v[2] = new Video("Aula 2 de PHP");
        v[0].sobreVideo();
        System.out.println("-------------------------");
        Gafanhoto[] g = new Gafanhoto[3];
        g[0] = new Gafanhoto("Wagner",20,"M",true);
        g[1] = new Gafanhoto("Guilerme",19,"M",false);
        g[2] = new Gafanhoto("Layla",25,"F",true);
        g[0].dadosGafanhostos();
    }
}
