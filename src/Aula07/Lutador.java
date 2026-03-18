package Aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Contruct

    public Lutador(String nome,String nacionalidade,int idade, double altura, double peso,int vitorias,int derrotas,int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    //GETS e SETS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        double peso = this.getPeso();
        if(peso < 52.2 || peso > 120.2) System.out.println("Peso invalido para esse torneio");
        if(peso <= 70.3) System.out.println("Leve");
        if(peso <= 83.9) {
            System.out.println("Medio");
        } else {
            System.out.println("Pesado");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Metodos

    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status(){
        System.out.print(getNome() + " ");
        System.out.print("Pesando: " + getPeso() + " ");
        System.out.print(getVitorias() + " Vitorias ");
        System.out.print(getDerrotas() + " Derrotas ");
        System.out.print(getEmpates() + " Empates ");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }


}
