package Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(String dono) {
        this.setDono(dono);
        this.setSaldo(0);
        this.setStatus(false);
    }

    //GETS
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    //SETS
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Metodos
    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);

        switch (tipo){
            case "cp":
                this.setSaldo(150);
                break;
            case "cc":
                this.setSaldo(50);
                break;
            default:
                System.out.println("Tipo de conta invalido!");
                break;
        }

    }

    public void fecharConta(){
        if(this.saldo != 0) System.out.println("A conta tem que ta sem saldo e sem dividas para poder fechar!");

        this.setStatus(false);
    }

    public void depositar(float saldo){
        if(!this.status) System.out.println("Abra uma conta primeiro antes de depositar!");

        this.setSaldo(getSaldo() + saldo);
    }

    public void sacar(float saque){
        if(!this.status) System.out.println("Abra uma conta primeiro antes de sacar!");
        if(saque > this.saldo) System.out.println("Você não pode sacar mais do que está depositadp");

        this.setSaldo(this.getSaldo() - saque);
    }

    public void pegarMensal(){
        if(!this.status) System.out.println("Essa conta está fechada!");

        switch (this.tipo){
            case "cp":
                if(this.saldo < 20) System.out.println("Imposivel pagar");
                this.setSaldo(getSaldo() - 20);
                break;
            case "cc":
                if(this.saldo < 12) System.out.println("Imposivel pagar");
                this.setSaldo(getSaldo() - 12);
                break;
            default:
                System.out.println("Tipo de conta invalido!");
                break;
        }
    }

    public void rendimento(int mes){
        if(!this.status) System.out.println("Abra uma conta primeiro!");
        float rendimento;

        switch (this.tipo){
            case "cp":
                rendimento = (float) (getSaldo() * Math.pow((0.08), mes));
                this.setSaldo(getSaldo() + rendimento);
                break;
            case "cc":
                rendimento = (float) (getSaldo() * Math.pow((0.005), mes));
                this.setSaldo(getSaldo() + rendimento);
                break;
            default:
                System.out.println("Tipo de conta invalido!");
                break;
        }
    }

}