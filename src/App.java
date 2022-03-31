import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de repetições:");
        int qtdRep = leitor.nextInt();

        for(int i = 1; i < qtdRep; i++){
            System.out.println(i);
        }
    }
}
