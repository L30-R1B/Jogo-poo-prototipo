package itens;

import itens.coletavel.Item;

public class Mochila {
    private static final int QTD_MAXIMA_ITENS = 5;
    private final Item[] ARMAZENAMENTO;

    public Mochila() {
        this.ARMAZENAMENTO = new Item[QTD_MAXIMA_ITENS];
    }

    public boolean adicionarItem(Item item) {
        for (int i = 0; i < QTD_MAXIMA_ITENS; i++) {
            if (this.ARMAZENAMENTO[i] == null) {
                this.ARMAZENAMENTO[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean removerItem(String nome) {
        for (int index = 0; index < QTD_MAXIMA_ITENS; index++) {
            if (this.ARMAZENAMENTO[index] != null && ARMAZENAMENTO[index].getNome().equals(nome)) {
                this.ARMAZENAMENTO[index] = null;
                return true;
            }
        }
        return false;
    }

    public void printaConteudoMochila() {
        System.out.print("Conteúdo da mochila: | ");
        for(Item itemAtual : this.ARMAZENAMENTO){
            if (itemAtual != null) {
                System.out.print(itemAtual.getNome() + " | ");
            }
        }
        System.out.println(" | ");
    }
}
