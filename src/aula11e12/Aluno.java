package aula11e12;

public class Aluno extends Pessoa{
    private Integer Matricula;
    private String curso;

    //GET e SETS
    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Metodos

    public void pagarMensalidade(){
        System.out.println("O/a " + getNome() + " pagou a mensalidade");
    }

    @Override
    public void toInformacoes(){
        super.toInformacoes();
        System.out.println("Numero da matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }

}
