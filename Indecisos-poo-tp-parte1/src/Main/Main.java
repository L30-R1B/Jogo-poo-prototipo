package Main;

import itens.coletavel.Chave;
import itens.coletavel.Machado;
import itens.coletavel.Ouro;
import itens.coletavel.Pocao;
import mapa.Mapa;
import mapa.Sala;

public class Main {    
    public static void main(String[] args) {
        Ouro ouro = new Ouro();
        Machado machado = new Machado();
        Pocao pocao = new Pocao();
        Chave chave = new Chave();
        
        Mapa mapa = new Mapa();

        mapa.SALAS[0] = new Sala();

        mapa.SALAS[0].adicionaItemSala(ouro);
        mapa.SALAS[0].adicionaItemSala(machado);
        mapa.SALAS[0].adicionaItemSala(machado);
        mapa.SALAS[0].adicionaItemSala(chave);
        mapa.SALAS[0].adicionaItemSala(pocao);


        mapa.printaMapa();
    }
}
