import java.util.ArrayList;

import java.util.List;

class Cliente {
    private String nome;
    private int pontosAcumulados;
    private List<Anuncio> anuncios;

    public Cliente(String nome) {
        this.nome = nome;
        this.pontosAcumulados = 0;
        this.anuncios = new ArrayList<>();
    }

    public void addAnuncio (Anuncio anuncio) {
        anuncios.add(anuncio);
    }

    public String getNome() {
        return nome;
    }

    public double valorTotal() {
        double valorTotal = 0;
        for (Anuncio anuncio: anuncios) {
            valorTotal += anuncio.calculaPrecoDoAnuncio();
            pontosAcumulados += anuncio.somaDePontos();
        }
        return valorTotal;
    }

    public String descricaoCliente(double precoTotal) {
        String descricaoDoCliente = "Histórico de compras de anúncios por " + getNome() + "\n" +
                "Total devido é " + String.valueOf(precoTotal) + "\n" +
                "Voce ganhou " + String.valueOf(pontosAcumulados) + "pontos";

        return descricaoDoCliente;
    }
    public String historico() {
        return descricaoCliente(valorTotal());
    }

}