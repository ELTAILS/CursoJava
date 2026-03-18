package aula11e12;

public class Bolsista extends Aluno{
    private Integer bolsa;

    public Integer getBolsa() {
        return bolsa;
    }

    public void setBolsa(Integer bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno(a) " + getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade do bolsista " + getNome() + " paga com sucesso.");
    }

}
