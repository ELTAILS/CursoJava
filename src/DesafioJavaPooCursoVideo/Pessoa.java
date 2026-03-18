package DesafioJavaPooCursoVideo;

public abstract class Pessoa {
    protected String nome;
    protected Integer idade;
    protected String sexo;
    protected double expericencia;

    public Pessoa(String nome, Integer idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExpericencia(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getExpericencia() {
        return expericencia;
    }

    public void setExpericencia(double expericencia) {
        this.expericencia = expericencia;
    }


    public abstract void ganharExp();

}
