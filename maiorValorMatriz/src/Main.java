import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] valores = new int[3][3];
        int maior = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                valores[i][j] = random.nextInt(20);
            }
        }
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                System.out.printf("%d\t", valores[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                if (valores[i][j] > maior) {
                    maior = valores[i][j];
                }
            }
        }
        System.out.println("O maior valor da matriz é: " + maior);

    }
}