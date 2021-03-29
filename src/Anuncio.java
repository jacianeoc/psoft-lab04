public abstract class Anuncio {
    protected String descricao;
    protected int diasDeDuracao;
    public Anuncio(String descricao, int diasDeDuracao) {
        this.descricao = descricao;
        this.diasDeDuracao = diasDeDuracao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoDoAnuncio() {
        return diasDeDuracao;
    }

    public void setDuracaoDoAnuncio(int diasDeDuracao) {
        this.diasDeDuracao = diasDeDuracao;
    }

    public int somaDePontos() {
        return 1;
    }
    //cada classe filha será responsavel por implementar o preço do anuncio
    public abstract double calculaPrecoDoAnuncio();
}