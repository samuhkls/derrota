import java.util.Scanner;

public class UI {
    Scanner ler = new Scanner(System.in);
    public void escrever(String msg){
        msg = ler.nextLine();
        System.out.println(msg);
    }
    public void pulaLinha(){
        System.out.println("");
    }
}
