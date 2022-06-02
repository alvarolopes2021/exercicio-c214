package observable;

import observable.impl.Observador;
import observable.impl.Observavel;

public class Frase {
    public static void main(String[] args) {

        Observavel frase = new Observavel();

        //Criando 3 observadores e fazendo a inscrição .
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        frase.registraObservador(obs1);
        frase.registraObservador(obs2);
        frase.registraObservador(obs3);

        frase.realizaOperacao("A frase escolhida Foi pare");

        frase.removeObservador(obs3);

        System.out.println("\n\nMandando notificação para todos os clientes: ");
        frase.notificaObservadores();

    }
}
