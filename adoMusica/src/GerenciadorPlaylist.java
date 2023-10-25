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
        }
    }

    public void ordenar(int criterio){
            if(criterio ==1){
                ordenarPorNome();
            }
    }

    public void ordenarPorNome(){
        int tamanho = musicas.size();
        Musica msc = new Musica();
        for(int posicao = 1; posicao < tamanho; posicao ++){

            Musica musica = musicas.get(posicao);
            String musicanome = "";
            musicanome = musica.getNome();
            Musica anterior = musicas.get(posicao -1);
            String anteriornome = "";
            anteriornome = anterior.getNome();
            //anterior.equals(posicao -1);

            int x = 0;
            x = anteriornome.compareTo(musicanome);
            while (x < 0){
                String armazena = "";
                armazena = anteriornome;
                int armazenaindex = 0;
                armazenaindex = musicas.indexOf(anterior);

                int musicanomeindex = 0;
                musicanomeindex = musicas.indexOf(musica);
                musica.getNome();

                msc = musicas.get(armazenaindex);
                musicas.set(armazenaindex,msc);
                msc = musicas.get(musicanomeindex);
                musicas.set(musicanomeindex,msc);
                x = 1;
            }



        }
    }



}
