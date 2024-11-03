package Netflix;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //Streaming f = new Filmes("missão", "terror",
        //"filme tenebroso com estrelas de Hollywood",
        //2012, 20, 2.35F, "trilogia".isEmpty(), 5);


        List<Filmes> filmelst = new ArrayList<>();
        List<Series> serielst = new ArrayList<>();
        int i = 1;
        int qtd_filmes = 0;
        int qtd_series = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de filmes que deseja registrar :");
        qtd_filmes = ler.nextInt();


        while (i <= qtd_filmes) {

            Filmes filme = new Netflix.Filmes();

            System.out.print("O nome é: ");
            filme.setNome(ler.next());
            System.out.println("O gênero é: ");
            filme.setGenero(ler.next());
            System.out.println("Descrição: ");
            filme.setDescricao(ler.next());
            System.out.print("O lançamento foi em: ");
            filme.setAno_de_lancamento(ler.nextInt());
            System.out.print("Classificação indicativa: ");
            filme.setClassificacao(ler.nextInt());
            System.out.print("Duração e de: ");
            filme.setDuracao(ler.nextFloat());
            System.out.print("Tem trilogia: ");
            filme.setTrilogia(ler.nextBoolean());
            if (filme.isTrilogia()) {
                System.out.print("Quantidade: ");
                filme.setQtn_trilogia(ler.nextInt());
            }




            System.out.println("Nome do filme : " + filme.getNome());
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Descrição: " + filme.getDescricao());
            System.out.println("Lançamento: " + filme.getAno_de_lancamento());
            System.out.println("Classificação indicativa: " + filme.getClassificacao());
            System.out.println("Duração do filme:  " + filme.getDuracao());
            System.out.println("Tem trilogia ? " + filme.isTrilogia());
            System.out.println("Quantas ?" + filme.getQtn_trilogia());

            filmelst.add(filme);
            i++;
        }
        for (i = 0; i < filmelst.size(); i++) {
            System.out.println("Os gêneros são: " + filmelst.get(i).getGenero());
        }

        System.out.println("Informe a quantidade de series que deseja registrar :");
        qtd_series = ler.nextInt();

        for (int c = 1; c <= qtd_series; c++) {

            Series serie = new Series();

            System.out.print("O nome é: ");
            serie.setNome(ler.next());
            System.out.print("O gênero é: ");
            serie.setGenero(ler.next());
            System.out.print("Descrição: ");
            serie.setDescricao(ler.next());
            System.out.print("O lançamento foi em: ");
            serie.setAno_de_lancamento(ler.nextInt());
            System.out.print("Classificação indicativa: ");
            serie.setClassificacao(ler.nextInt());
            System.out.print("Duração e de: ");
            serie.setDuracao(ler.nextFloat());
            System.out.println("Episodios: ");
            serie.setEpsisodios(ler.nextInt());
            System.out.println("Temporadas: ");
            serie.setTemporadas(ler.nextInt());


            System.out.println("Nome do filme : " + serie.getNome());
            System.out.println("Gênero: " + serie.getGenero());
            System.out.println("Descrição: " + serie.getDescricao());
            System.out.println("Lançamento: " + serie.getAno_de_lancamento());
            System.out.println("Classificação indicativa: " + serie.getClassificacao());
            System.out.println("Duração do filme:  " + serie.getDuracao());

            serielst.add(serie);
            i++;
        }
        for (int c = 0; c <= serielst.size(); c++){
            System.out.println("Os gênero são: " + serielst.get(c).getGenero());
        }

    }

}