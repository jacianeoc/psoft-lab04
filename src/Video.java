public class Video extends Anuncio {

    public Video(String descricao, int diasDeDuracao) {
        super(descricao, diasDeDuracao);
    }

    public int somaDePontos () {
        int pontos = 1;
        if (diasDeDuracao > 1) pontos++;
        return pontos;
    }
    @Override
    public double calculaPrecoDoAnuncio() {
        return 3.0;
    }

}