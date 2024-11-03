package Netflix;

public class Streaming {
    private String genero;
    private String nome;
    private String descricao;
    private int ano_de_lancamento;
    private int classificacao;
    private float duracao;

    public Streaming(String nome, String genero, String descricao, int lancamento,
                     int classificacao, float duracao) {

        this.nome = nome;

        this.genero = genero;

        this.descricao = descricao;

        this.ano_de_lancamento = lancamento;

        this.classificacao = classificacao;

        this.duracao = duracao;

    }
    public Streaming(){
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero = genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return this.descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno_de_lancamento() {
        return this.ano_de_lancamento;
    }


    public void setAno_de_lancamento(int lancamento) {
        this.ano_de_lancamento = lancamento;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public float getDuracao() {
        return duracao;
    }


    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    //public void Netflix() {
        //System.out.println("O nome do flime é: " + getNome() + " Sinopse: " + getDescricao() + " o gênero é: " + getGenero()
                //+ " lançamento em : " + getAno_de_lancamento() + " classificação indicativa " + getClassificacao()
                //+ " a duração e de: " + getDuracao() + "hrs");
    //}
}
