public class Imagem extends Anuncio {

    public Imagem(String descricao, int diasDeDuracao) {
        super(descricao, diasDeDuracao);
    }

    @Override
    public double calculaPrecoDoAnuncio() {
        double preco = 2.0;
        if (diasDeDuracao > 2) preco += (this.diasDeDuracao - 2) * 1.5;
        return preco;
    }

}