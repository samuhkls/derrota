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
                System.out.println("digite a avaliacao da musica: ");
                m1.setAvaliacao(Double.parseDouble(ler.nextLine()));
                System.out.println("digite a duracao da musica em minutos: ");
                m1.setMinutos(Integer.parseInt(ler.nextLine()));
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
                ler.nextLine();
                System.out.println("Por qual criterio voce vai ordenar? \n1. nome\n2. duracao\n3. avaliacao");
                String input = ler.nextLine();
                int criterio = Integer.parseInt(input);
                if(criterio == 1){
                    gerencia.ordenarPorNome();
                } else if (criterio == 2) {
                    System.out.println("Ordenar por maior(1) ou menor(2) duracao?");
                    input = ler.nextLine();
                    criterio = Integer.parseInt(input);

                    if(criterio == 1){
                        gerencia.ordenarPorTempoMaior();
                    }else{
                        gerencia.ordenarPorTempoMenor();
                    }

                } else if (criterio == 3) {
                    System.out.println("Ordenar por maior(1) ou menor(2) avaliacao?");
                    input = ler.nextLine();
                    criterio = Integer.parseInt(input);

                    if(criterio == 1){
                        gerencia.ordenarPorAvaliacaoMaior();
                    }else{
                        gerencia.ordenarPorAvaliacaoMenor();
                    }

                }
            case 0:
                //numero = 0;
                break;
        }
    } while (numero!=0);
    }
}
