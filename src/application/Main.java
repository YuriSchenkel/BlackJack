package application;

import entities.BlackJack;

public class Main {
    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        game.start();
        game.imprimirPlacar();
    }
}
