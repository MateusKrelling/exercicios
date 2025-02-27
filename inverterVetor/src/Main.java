public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 8, 30, 16};
        int tam = vetor.length;
        
        for (int i = tam - 1; i >= 0; i--) {
            System.out.printf("%d\t", vetor[i]);
        }
    }
}
