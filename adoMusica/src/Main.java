import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UI ui = new UI();
        Scanner ler = new Scanner(System.in);

        GerenciadorPlaylist gerencia = new GerenciadorPlaylist();

        int numero;

        gerencia.exibirPlaylist();
        do {
            System.out.println("Escolha uma funcao de 0 a 4: ");
            System.out.println("1. adicionar ");
            System.out.println("2. remover ");
            System.out.println("3. buscar ");
            System.out.println("4. exibir ");
            System.out.println("5. ordenar ");
            System.out.println("0. sair ");
            numero = ler.nextInt();


        switch(numero) {
            case 1:
                Musica m1 = new Musica();
                ler.nextLine();
                System.out.println("digite o nome da musica: ");
                m1.setNome(ler.nextLine());
                System.out.println("digite o nome do artista: ");
                m1.setArtista(ler.nextLine());
                gerencia.adicionar(m1);
                break;
            case 2:
                System.out.println("digite a posicao da música que deseja remover");
                int posicao = 0;
                posicao = ler.nextInt();
                gerencia.remover(posicao);
                break;
            case 3:
                ler.nextLine();
                System.out.println("digite o nome da musica que deseja buscar");
                String nomeMusica = ler.nextLine();
                System.out.println(gerencia.buscar(nomeMusica));
                break;
            case 4:
                gerencia.exibirPlaylist();
                break;
            case 5:
                gerencia.ordenarPorNome();
            case 0:
                //numero = 0;
                break;
        }
    } while (numero!=0);
    }
}
