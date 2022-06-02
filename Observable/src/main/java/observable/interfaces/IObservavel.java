package observable.interfaces;

import observable.impl.Observador;

public interface IObservavel {
    public void registraObservador(Observador obs);
    public void removeObservador(Observador obs);
    public void notificaObservadores();
}

