package observable.impl;

import observable.interfaces.IObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements IObservavel {

    private String titulo, genero;
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
}
