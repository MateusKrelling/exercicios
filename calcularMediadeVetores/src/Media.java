public class Media {
    public static int media(int[] a) {
        int soma = 0;
        for (int i : a) {
            soma += i;
        }
        return soma / a.length;
    }
}
