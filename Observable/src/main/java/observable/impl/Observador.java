package observable.impl;

import observable.interfaces.IObservador;

public class Observador implements IObservador {

    private String nomeSerie, genero;
    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel frase) {
        System.out.println("Cliente: "+this.id);
        System.out.println("Quantidade de palavras: "+ frase.getQtdPalavras());
        System.out.println("Quantidade palavras com nº par de letras: " + frase.getQtdPalavrasPar());
        System.out.println("Quantidade de plavras que começam com upper: " + frase.getQtdPalavrasUpper());
    }
}
