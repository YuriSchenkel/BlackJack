package entities;

public class BlackJack {
    private BaralhoBlackJack baralho;
    private Jogador banca;
    private Jogador jogador1;

    public void start(){
        baralho = new BaralhoBlackJack();
        banca = new Jogador("Blaze");
        jogador1 = new Jogador("Yuri");

        for(int i=1; i<=4; i++){
            baralho.limparCartas();
            baralho.adicionarCarta();
            baralho.embaralhar();
        }

    }

    public void imprimirPlacar(){
        System.out.println("********************");
        System.out.println("*******PLACAR*******");
        System.out.println(banca.getNome() + ": " + banca.getVitorias());
        System.out.println(jogador1.getNome() + ": " + jogador1.getVitorias());
        System.out.println("********************");
        System.out.println("********************");
    }



}
