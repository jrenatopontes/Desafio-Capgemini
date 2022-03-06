import java.util.Scanner;

public class Crip {
    public static void main (String[] args) {
        String s = "tenha um bom dia";
        String saida = "";
        s = s.replace(" ", "");
        double raiz = Math.sqrt(s.length());
        int n = (int) Math.ceil(raiz);

        System.out.println("raiz: " + raiz);
        System.out.println("n: " + n);

        char[] sChars = s.toCharArray();
        int countChar = 0;

        Character[][] grid = new Character[n][n];

        for (int j = 0; j < grid.length; j++) {
            for (int i = 0; i < grid[0].length && countChar < sChars.length; i++, countChar++) {
                grid[j][i] = sChars[countChar];
            }
        }

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                saida += grid[j][i] == null ? "" : grid[j][i];
            }
            saida += " ";
        }

        System.out.println("saída = " + saida);
    }
    //Alterando a string s:
    //String s = "ola mundo";
    //Saída:
    //raiz: 2.8284271247461903
    //n: 3
    //saída = omd luo an

}