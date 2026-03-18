package aula11e12;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //GETS e SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodos

    public void fazerAniversario(){
        setIdade(getIdade() + 1);
    }

    public void toInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }

}
