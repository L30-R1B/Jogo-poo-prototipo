package mapa;

public class Porta {
    private final char identificador;
    private final int salaDestino;
    private boolean aberta;

    public Porta(char identificador, int salaDestino){
        this.identificador = identificador;
        this.salaDestino = salaDestino;
        this.aberta = true;
    }

    public void abrePorta(){
        this.aberta = true;
    }

    public void fechaPorta(){
        this.aberta = false;
    }

    public boolean isAberta(){
        return this.aberta;
    }

    public int getSalaDestino(){
        return salaDestino;
    }

    public char getIdentificador(){
        return this.identificador;
    }

    public void printaPorta(){
        System.out.print(" < " + this.identificador + " : " + (this.aberta?"aberta":"fechada") + " > ");
    }

}
