package DesafioJavaPooCursoVideo;

public class Gafanhoto extends Pessoa{
    private boolean login;
    private Integer totAssistido;

    public Gafanhoto(String nome, Integer idade, String sexo, boolean login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public Integer getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(Integer totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        setTotAssistido(getTotAssistido() + 1);
    }

    public void dadosGafanhostos(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println(isLogin() ? "Está logado" : "Não está logado");
        System.out.println("Total de videos assistidos: " + getTotAssistido());
        System.out.println("Experiencia: " + getExpericencia());
    }

    @Override
    public void ganharExp() {
        setExpericencia(getExpericencia() + 5);
    }
}
