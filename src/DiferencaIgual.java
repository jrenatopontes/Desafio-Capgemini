import java.util.Scanner;
public class DiferencaIgual {
    public static void main (String[] args){

        int i,o, soma, soma2,diferenca, n1;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite quantos espaços existe no vetor: ");
        n1 = read.nextInt();
        int[] n = new int[n1];
        diferenca = 0;

        for (i = 0; i < n1 ;i++){
            System.out.println("Digite um valor: ");
           n[i] = read.nextInt();
        }

        for (i = 0; i < n1 ;i++){
            for (o = 0; o < n1 ;o++){
                soma = n[i] - n[o];
                if (soma == 2){
                    diferenca = diferenca + 1;
                }
            }

        }
        System.out.println(diferenca);
    }
}
