package entities;

import java.util.List;

public class Jogador {
    private String nome;
    private int vitorias;
    private List<Carta> cartas;

    public Jogador(String nome, int vitorias, List<Carta> cartas) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.cartas = cartas;
    }

    public Jogador(String blaze) {
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void limparCartas() {
        cartas.clear();
    }

    public void adicionarVitoria() {
        vitorias += 1;
    }

    public int getSomaMao() {
        int somatorio = 0;
        for (Carta c : cartas) {
            somatorio += c.getPeso();
        }
        if (somatorio <= 21) {
            return somatorio;
        } else {
            return 0;
        }
    }

}
