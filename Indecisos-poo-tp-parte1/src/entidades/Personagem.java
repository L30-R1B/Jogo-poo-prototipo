package entidades;

public class Personagem {
    String tipoPersonagem;
    boolean vivo;

    public Personagem(String tipoPersonagem){
        this.tipoPersonagem = tipoPersonagem;
        vivo = true;
    }

    public void mataPersonagem(){
        this.vivo = false;
    }

    public void exibePersonagem(){
        System.out.print("<<< " + this.tipoPersonagem + " >>>");
    }

    public boolean isVivo(){
        return this.vivo;
    }
}
