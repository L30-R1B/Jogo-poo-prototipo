package entidades;

import itens.Carteira;
import itens.Mochila;

public class Jogador extends Personagem{
    private static final String ASSINATURA_JOGADOR = "jogador";
    Mochila mochila;
    Carteira carteira;
    private int sala;

    public Jogador(){
        super(ASSINATURA_JOGADOR);
        this.mochila = new Mochila();
        this.carteira = new Carteira();
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
        this.mochila.printaConteudoMochila();
        this.carteira.printaPatrimonio();
        System.out.println("-----------------------------------------------");
    }
}
