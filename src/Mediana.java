import java.util.Scanner;
public class Mediana {
    public static void main (String[] args){

        int mediana,i, soma, n1;

        Scanner read = new Scanner(System.in);
        System.out.println("Digite quantos espaços existe no vetor: ");
        n1 = read.nextInt();

        int[] arr = new int[n1];
        soma = 0;

        for (i = 0; i < n1 ;i++){
            System.out.println("Digite um valor: ");
            arr[i] = read.nextInt();
        }

        for (i = 0; i < n1 ;i++){
            soma = soma + arr[i];
        }
        mediana = soma / n1;

        System.out.println(mediana);
    }
}
