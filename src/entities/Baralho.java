package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public void adicionarCarta(String naipe, String valor, int peso) {
        Carta c;
        c = new Carta(naipe, valor, peso);
        this.cartas.add(c);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public Carta pescarCarta() {
        int ultimaCarta = cartas.size() - 1;
        Carta c = cartas.get(ultimaCarta);
        cartas.remove(ultimaCarta);
        return c;
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public void limparCartas() {
        cartas.clear();
    }

    public boolean isEmpty() {
        return cartas.isEmpty();
    }

}
