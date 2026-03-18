package aula13;

public abstract class Animal {
    protected double peso;
    protected Integer idade;
    protected Integer membros;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }

    public abstract void emitirSom();

}
