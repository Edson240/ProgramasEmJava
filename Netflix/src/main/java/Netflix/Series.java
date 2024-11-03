package Netflix;


public class Series extends Streaming {
    private int episodios;
    private int temporadas;



    public Series (String nome, String genero, String descricao, int lancamento, int classificacao,
                   float duracao, int episodios, int temporadas) {
        super(nome, genero, descricao, lancamento, classificacao, duracao);
        this.episodios = episodios;
        this.temporadas = temporadas;

}

    public Series() {

    }

    public  int getEpisodios() {
        return episodios;
    }

    public  void setEpsisodios(int episodios){
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
//criar while para o usuario cadastrar 5 series

}


