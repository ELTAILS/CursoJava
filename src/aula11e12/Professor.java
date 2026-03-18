package aula11e12;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    //GETS e SETS
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumento(double aumento){
        if(aumento <= 0){
            System.out.println("è para aumentar o salario e não diminuir!");
            return;
        }

        setSalario(getSalario() + aumento);
    }

    @Override
    public void toInformacoes(){
        super.toInformacoes();
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Salario: " + getSalario());
    }

}
