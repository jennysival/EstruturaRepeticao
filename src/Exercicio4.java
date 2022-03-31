import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite um número:");
    int numero = leitor.nextInt();

    int i = 0;
        while(i<=numero){
            i++;
            System.out.println(i);
        }
    }
}
