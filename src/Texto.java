public class Texto extends Anuncio {

    public Texto(String descricao, int diasDeDuracao) {
        super(descricao, diasDeDuracao);
    }

    @Override
    public double calculaPrecoDoAnuncio() {
        double precoTotal = 1.5;
        if(diasDeDuracao > 3) precoTotal += (this.diasDeDuracao - 3) * 1.5;
        return precoTotal;
    }

}