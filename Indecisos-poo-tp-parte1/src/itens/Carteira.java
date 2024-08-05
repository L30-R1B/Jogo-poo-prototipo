package itens;

import itens.coletavel.Item;
import itens.coletavel.Ouro;

public class Carteira {
    private static final int QTD_MAXIMA_OURO = 999;
    private final Item[] PATRIMONIO;
    private int quantidadeOuro;

    public Carteira(){
        this.PATRIMONIO = new Item[QTD_MAXIMA_OURO];
        this.quantidadeOuro = 0;
    }

    public boolean depositarOuro(){
        for (int i = 0; i < QTD_MAXIMA_OURO; i++) {
            if (PATRIMONIO[i] == null) {
                this.PATRIMONIO[i] = new Ouro();
                this.quantidadeOuro ++;
                return true;
            }
        }
        return false;
    }

    public boolean debitarOuro(){
        for (int i = 0; i < QTD_MAXIMA_OURO; i++) {
            if (PATRIMONIO[i] != null) {
                this.PATRIMONIO[i] = null;
                this.quantidadeOuro --;
                return true;
            }
        }
        return false;
    }

    public int getQuantidadeOuro(){
        return this.quantidadeOuro;
    }

    public void printaPatrimonio(){
        System.out.print("Patrimonio do jogador: | ");
        for(Item moedaAtual : this.PATRIMONIO){
            if (moedaAtual != null) {
                System.out.print(moedaAtual.getNome() + " | ");
            }
        }
        System.out.println(" | ");
    }
}
