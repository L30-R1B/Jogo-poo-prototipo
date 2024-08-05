package entidades;

import itens.Carteira;
import itens.Mochila;

public class Jogador extends Personagem{
    private static final String ASSINATURA_JOGADOR = "jogador";
    private final Mochila MOCHILA;
    private final Carteira CARTEIRA;
    private int sala;

    public Jogador(){
        super(ASSINATURA_JOGADOR);
        this.MOCHILA = new Mochila();
        this.CARTEIRA = new Carteira();
        this.sala = 0;
    }

    public void setSala(int sala){
        this.sala = sala;
    }

    public int getSala(){
        return this.sala;
    }

    public void printaInfoJogador(){
        System.out.println("-----------------------------------------------");
        System.out.println("Sala atual : " + this.sala);
        this.exibePersonagem();
        System.out.println();
        this.MOCHILA.printaConteudoMochila();
        this.CARTEIRA.printaPatrimonio();
        System.out.println("-----------------------------------------------");
    }
}
