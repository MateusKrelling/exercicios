public class Main {
    public static void main(String[] args) {
         int[] vetor ={
            1, 4, 8, 30, 16
        };

         int soma = 0;

         for (int i: vetor){
             soma += i;
         }
        System.out.println("A soma dos valores do vetor são: " + soma);
    }
}