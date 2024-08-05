package mapa;

import entidades.Troll;
import itens.coletavel.Item;

public class Sala {
    private static final int MAX_OBJETOS_SALA = 10;
    private final Troll[] TROLLS;
    private final Porta[] PORTAS;
    private final Item[] ITENS_DISPONIVEIS;
    private boolean jogadorPresente;

    public Sala() {
        this.TROLLS = new Troll[MAX_OBJETOS_SALA];
        this.PORTAS = new Porta[MAX_OBJETOS_SALA];
        this.ITENS_DISPONIVEIS = new Item[MAX_OBJETOS_SALA];
        this.jogadorPresente = false;
    }

    public void retiraJogadorSala() {
        this.jogadorPresente = false;
    }

    public void colocaJogadorSala() {
        this.jogadorPresente = true;
    }

    public boolean isJogadorPresente() {
        return jogadorPresente;
    }

    public boolean adicionaTrollSala(){
        for (int troolAtual = 0; troolAtual < MAX_OBJETOS_SALA; troolAtual++) {
            if (this.TROLLS[troolAtual] == null) {
                this.TROLLS[troolAtual] = new Troll();
                return true;
            }
        }
        return false;
    }

    public boolean removeTrollSala(){
        for (int troolAtual = 0; troolAtual < MAX_OBJETOS_SALA; troolAtual++) {
            if (this.TROLLS[troolAtual] != null) {
                this.TROLLS[troolAtual] = null;
                return true;
            }
        }
        return false;
    }

    public boolean adicionaPortaSala(Porta porta){
        for (int portaAtual = 0; portaAtual < MAX_OBJETOS_SALA; portaAtual++) {
            if (this.PORTAS[portaAtual] == null) {
                this.PORTAS[portaAtual] = porta;
                return true;
            }
        }
        return false;
    }

    public boolean removePortaSala(Porta porta){
        for (int portaAtual = 0; portaAtual < MAX_OBJETOS_SALA; portaAtual++) {
            if (this.PORTAS[portaAtual] != null && this.PORTAS[portaAtual].getIdentificador() == porta.getIdentificador()) {
                this.PORTAS[portaAtual] = porta;
                return true;
            }
        }
        return false;
    }

    public boolean adicionaItemSala(Item item) {
        for (int itemAtual = 0; itemAtual < MAX_OBJETOS_SALA; itemAtual++) {
            if (this.ITENS_DISPONIVEIS[itemAtual] != null) {
                this.ITENS_DISPONIVEIS[itemAtual] = item;
                return true;
            }
        }
        return false;
    }

    public boolean removeItemSala(String nome) {
        for (int itemAtual = 0; itemAtual < MAX_OBJETOS_SALA; itemAtual++) {
            if (this.ITENS_DISPONIVEIS[itemAtual] != null && this.ITENS_DISPONIVEIS[itemAtual].getNome().equals(nome)) {
                this.ITENS_DISPONIVEIS[itemAtual] = null;
                return true;
            }
        }
        return false;
    }

    private void printaItensSala(){
        System.out.print("Itens disponiveis na sala : | ");
        for(Item itemAtual : this.ITENS_DISPONIVEIS){
            if(itemAtual == null){
                continue;
            }
            System.out.print(itemAtual.getNome() + " | ");
        }
        System.out.println(" | ");
    }

    private void printaTrollsSala(){
        System.out.print("Criaturas presentes na sala : ");
        for(Troll troll : TROLLS){
            if(troll == null){
                continue;
            }
            troll.exibePersonagem();
        }
        System.out.println();
    }

    private void printaPortasSala(){
        System.out.println("Portas presentes na sala :");
        for(Porta porta : PORTAS){
            if(porta == null){
                continue;
            }
            porta.printaPorta();
        }
        System.out.println();
    }

    public void printaInfoSala(int numeroSala){
        System.out.println("-----------------------------\n");
        System.out.println("Número da sala : " + numeroSala);
        this.printaItensSala();
        this.printaTrollsSala();
        this.printaPortasSala();
        System.out.println("-----------------------------\n");
    }
}
