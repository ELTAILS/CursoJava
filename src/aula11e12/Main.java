package aula11e12;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(19);
        v1.setSexo("M");
        v1.toInformacoes();
        System.out.println("-------------------");
        //Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Cleiton");
        a1.setIdade(14);
        a1.setSexo("M");
        a1.setCurso("Ensino fundamental");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
        a1.toInformacoes();
        System.out.println("-------------------");
        //Professor
        Professor p1 = new Professor();
        p1.setNome("João lucas");
        p1.setIdade(14);
        p1.setSexo("M");
        p1.setSalario(0);
        p1.setEspecialidade("Escolinha dominical");
        p1.toInformacoes();
        System.out.println("-------------------");
        //Bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Felipe");
        b1.setIdade(24);
        b1.setSexo("M");
        b1.setCurso("Psicologia");
        b1.setMatricula(2222);
        b1.toInformacoes();
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println("-------------------");
        //tecnico
        Tecnico t1 = new Tecnico();
        t1.setNome("Wagner");
        t1.setIdade(25);
        t1.setSexo("M");
        t1.setCurso("TI");
        t1.setMatricula(2425);
        t1.toInformacoes();
        t1.setRegistroProficional("Programador Back-end");
        t1.toInformacoes();
        t1.participar();
        System.out.println("-------------------");
    }
}
