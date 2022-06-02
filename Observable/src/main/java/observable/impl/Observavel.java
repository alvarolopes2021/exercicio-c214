package observable.impl;

import observable.interfaces.IObservavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Observavel implements IObservavel {

    private int qtdPalavras, qtdPalavrasPar, qtdPalavrasUpper;
    private List<Observador> observadores;

    public Observavel() {
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(observadores.contains(obs))
            observadores.remove(obs);

    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : observadores) {
            observador.update(this);
        }
    }

    private void novasMedidas() {
        notificaObservadores();
    }

    public void realizaOperacao(String frase){
        System.out.println("\n\n####### Mostrando dados #######\n\n");
        this.qtdPalavras = frase.split(" ").length;
        this.qtdPalavrasUpper = Arrays.stream(frase.split(" ")).filter(word -> word.startsWith(word.substring(0,1).toUpperCase())).collect(Collectors.toList()).size();
        this.qtdPalavrasPar = Arrays.stream(frase.split(" ")).filter(word -> word.length() % 2 == 0).collect(Collectors.toList()).size();
        novasMedidas();
    }

    public int getQtdPalavras() {
        return this.qtdPalavras;
    }


    public int getQtdPalavrasPar() {
        return this.qtdPalavrasPar;
    }

    public int getQtdPalavrasUpper() {
        return this.qtdPalavrasUpper;
    }

    public List<Observador> getClientes() {
        return observadores;
    }
}
