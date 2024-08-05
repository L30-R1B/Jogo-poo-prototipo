package mapa;

import entidades.Jogador;

public class Mapa {
    private static final int NUMERO_SALAS = 20;
    public final Sala[] SALAS;
    public final Jogador JOGADOR;
    
    public Mapa(){
        this.SALAS = new Sala[NUMERO_SALAS];
        this.JOGADOR = new Jogador();
    }

    public boolean atravessaPorta(Porta porta){

        this.JOGADOR.setSala(porta.getSalaDestino());

        return true;
    }

    public void printaMapa(){
        int numSala = 0;
        for(Sala salaAtual : this.SALAS){
            if(salaAtual != null)
                salaAtual.printaInfoSala(numSala);
            numSala ++;
        }
        this.JOGADOR.printaInfoJogador();
    }
    
}
