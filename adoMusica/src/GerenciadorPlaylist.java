import java.util.ArrayList;

public class GerenciadorPlaylist {
    private ArrayList<Musica> musicas = new ArrayList();

    public void adicionar(Musica musica){
        if (!musicas.contains(musica)) {
            musicas.add(musica);
        } else {
            System.out.println("A música já está na playlist e não será adicionada novamente.");
        }
    }
    public void remover(int posicao){
        musicas.remove(posicao);
    }
    public int buscar(String nome) {
        for (Musica musica : musicas) {
            if (musica.getNome().equals(nome)) {
                  return musicas.indexOf(musica);
            }
        }
        return -1; // Retorna -1 se a música não for encontrada
    }
    public void exibirPlaylist(){
        for(Musica i : musicas){
            System.out.println("musica: " + i.getNome());
            System.out.println("artista: " + i.getArtista());
            System.out.println("avaliacao: " + i.getAvaliacao());
            System.out.println("duracao: " + i.getMinutos());
        }
    }

//    public void ordenar(int criterio){
//            if(criterio ==1){
//                ordenarPorNome();
//            } else if (criterio==2) {
//                ordenarPorTempo();
//            }
//    }

    public void ordenarPorNome(){
        int tamanho = musicas.size();

        for(int posicao = 1; posicao < tamanho; posicao ++){

            Musica musica = musicas.get(posicao);
            String musicanome = musica.getNome();
            int j = posicao - 1;

            // comparando a musica na posicao j com a proxima
            while (j >= 0 && musicanome.compareTo(musicas.get(j).getNome()) < 0){

                Musica armazena = musicas.get(j);
                Musica prox = musicas.get(j + 1); // compara a musica na posicao j(armazena) com a na posicao j  + 1(prox)
                musicas.set(j, prox);
                musicas.set(j + 1, armazena);
                j--; // ja que a musica trocou de posicao, precisamos decrementar o valor de j para continuar comparando com o proximo elemento

            }

        }
    }
    public void ordenarPorTempoMenor(){
        int tamanho = musicas.size();

        for(int posicao = 1; posicao < tamanho; posicao++){
            Musica musica = musicas.get(posicao);
            int duracao = musica.getMinutos();
            int j = posicao - 1;

            while(j>=0 && duracao < musicas.get(j).getMinutos()){
                Musica armazena = musicas.get(j);
                Musica prox = musicas.get(j + 1);
                musicas.set(j, prox);
                musicas.set(j + 1, armazena);
                j--;
            }

        }
    }
    public void ordenarPorTempoMaior(){
        int tamanho = musicas.size();

        for(int posicao = 1; posicao < tamanho; posicao++){
            Musica musica = musicas.get(posicao);
            int duracao = musica.getMinutos();
            int j = posicao - 1;

            while(j>=0 && duracao > musicas.get(j).getMinutos()){
                Musica armazena = musicas.get(j);
                Musica prox = musicas.get(j + 1);
                musicas.set(j, prox);
                musicas.set(j + 1, armazena);
                j--;
            }

        }
    }
    public void ordenarPorAvaliacaoMenor(){
        int tamanho = musicas.size();

        for(int posicao = 1; posicao < tamanho; posicao++){
            Musica musica = musicas.get(posicao);
            double avaliacao = musica.getAvaliacao();
            int j = posicao - 1;

            while(j>=0 && avaliacao < musicas.get(j).getAvaliacao()){
                Musica armazena = musicas.get(j);
                Musica prox = musicas.get(j + 1);
                musicas.set(j, prox);
                musicas.set(j + 1, armazena);
                j--;
            }
        }
    }    public void ordenarPorAvaliacaoMaior() {
        int tamanho = musicas.size();

        for (int posicao = 1; posicao < tamanho; posicao++) {
            Musica musica = musicas.get(posicao);
            double avaliacao = musica.getAvaliacao();
            int j = posicao - 1;

            while (j >= 0 && avaliacao > musicas.get(j).getAvaliacao()) {
                Musica armazena = musicas.get(j);
                Musica prox = musicas.get(j + 1);
                musicas.set(j, prox);
                musicas.set(j + 1, armazena);
                j--;
            }
        }
    }



}
