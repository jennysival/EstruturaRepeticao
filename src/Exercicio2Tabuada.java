import java.util.Scanner;

public class Exercicio2Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Tabuada");

        System.out.println("Digite um número para calcular a tabuada:");
        int tab = leitor.nextInt();
        leitor.close();
        
        for(int i = 0; i <= 10; i++){
            int resultado = tab * i;

            System.out.println(tab + "x" + i + "=" + resultado);
        }
    }
}
