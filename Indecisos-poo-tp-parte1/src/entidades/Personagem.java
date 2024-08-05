package entidades;

public class Personagem {
    private final String TIPO_PERSONAGEM;
    boolean vivo;

    public Personagem(String tipoPersonagem){
        this.TIPO_PERSONAGEM = tipoPersonagem;
        vivo = true;
    }

    public void mataPersonagem(){
        this.vivo = false;
    }

    public void exibePersonagem(){
        System.out.print("<<< " + this.TIPO_PERSONAGEM + " >>>");
    }

    public boolean isVivo(){
        return this.vivo;
    }
}
