import java.util.Scanner;

public class Exercicio3TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para calcular a tabuada:");
        int tab = leitor.nextInt();
        leitor.close();
        
        int i = 0;
        do{
            int resultado = tab * i;
            System.out.println(tab + "x" + i + "=" + resultado);
            i++;
        }while(i<=10);
    }
    }

