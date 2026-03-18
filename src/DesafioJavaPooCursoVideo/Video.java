package DesafioJavaPooCursoVideo;

public class Video implements AcoesVideo {
    private String titulo;
    private Integer avaliacao;
    private Integer views;
    private Integer curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    public void sobreVideo(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Visualizações: " + getViews());
        System.out.println(isReproduzindo() ? "O video está em play" : "O video está pausado");
    }

}
