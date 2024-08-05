package mapa;

import entidades.Troll;
import itens.coletavel.Item;

public class Sala {
    private static final int MAX_OBJETOS_SALA = 10;
    private final Troll[] trolls;
    private final Porta[] portas;
    private final Item[] itensDisponiveis;
    private boolean jogadorPresente;

    public Sala() {
        this.trolls = new Troll[MAX_OBJETOS_SALA];
        this.portas = new Porta[MAX_OBJETOS_SALA];
        this.itensDisponiveis = new Item[MAX_OBJETOS_SALA];
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
            if (this.trolls[troolAtual] == null) {
                this.trolls[troolAtual] = new Troll();
                return true;
            }
        }
        return false;
    }

    public boolean removeTrollSala(){
        for (int troolAtual = 0; troolAtual < MAX_OBJETOS_SALA; troolAtual++) {
            if (this.trolls[troolAtual] != null) {
                this.trolls[troolAtual] = null;
                return true;
            }
        }
        return false;
    }

    public boolean adicionaPortaSala(Porta porta){
        for (int portaAtual = 0; portaAtual < MAX_OBJETOS_SALA; portaAtual++) {
            if (this.portas[portaAtual] == null) {
                this.portas[portaAtual] = porta;
                return true;
            }
        }
        return false;
    }

    public boolean removePortaSala(Porta porta){
        for (int portaAtual = 0; portaAtual < MAX_OBJETOS_SALA; portaAtual++) {
            if (this.portas[portaAtual] != null && this.portas[portaAtual].getIdentificador() == porta.getIdentificador()) {
                this.portas[portaAtual] = porta;
                return true;
            }
        }
        return false;
    }

    public boolean removeItemSala(String nome) {
        for (int itemAtual = 0; itemAtual < MAX_OBJETOS_SALA; itemAtual++) {
            if (this.itensDisponiveis[itemAtual] != null && this.itensDisponiveis[itemAtual].getNome().equals(nome)) {
                this.itensDisponiveis[itemAtual] = null;
                return true;
            }
        }
        return false;
    }

    private void printaItensSala(){
        System.out.print("Itens disponiveis na sala : | ");
        for(Item itemAtual : this.itensDisponiveis){
            if(itemAtual == null){
                continue;
            }
            System.out.print(itemAtual.getNome() + " | ");
        }
        System.out.println(" | ");
    }

    private void printaTrollsSala(){
        System.out.print("Criaturas presentes na sala : ");
        for(Troll troll : trolls){
            if(troll == null){
                continue;
            }
            troll.exibePersonagem();
        }
        System.out.println();
    }

    private void printaPortasSala(){
        System.out.println("Portas presentes na sala :");
        for(Porta porta : portas){
            if(porta == null){
                continue;
            }
            porta.printaPorta();
        }
        System.out.println();
    }

    public void printaInfoSala(){
        System.out.println("-----------------------------\n");
        this.printaItensSala();
        this.printaTrollsSala();
        this.printaPortasSala();
        System.out.println("-----------------------------\n");
    }
}
