package Netflix;
import java.util.Scanner;
public class Filmes extends Streaming {

    private boolean trilogia;
    private int qtn_trilogia;

    public Filmes(String nome, String genero, String descricao, int lancamento, int classificacao,
                  float duracao, boolean trilogia, int qtn_trilogia) {
        super(nome, genero, descricao, lancamento, classificacao, duracao);
        this.trilogia = trilogia;
        this.qtn_trilogia = qtn_trilogia;
    }
    public Filmes(){
        super();
    }


    public boolean isTrilogia() {
        return trilogia;
    }

    public void setTrilogia(boolean trilogia) {
        this.trilogia = trilogia;
    }

    public int getQtn_trilogia() {
        return qtn_trilogia;
    }

    public void setQtn_trilogia(int trilogia) {
        this.qtn_trilogia = qtn_trilogia;

    }


    //@Override
    //public void Netflix() {
        //System.out.println("O nome do flime é: " + getNome() + " Sinopse: " + getDescricao() + " o gênero é: " + getGenero()
                //+ " lançamento em : " + getAno_de_lancamento() + " classificação indicativa " + getClassificacao()
                //+ " a duração e de: " + getDuracao() + "hrs" + " tem trilogia " + isTrilogia() + " quantas ?" + getQtn_trilogia());

    //}
}


