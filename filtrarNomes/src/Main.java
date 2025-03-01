import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Anna");
        arrayList.add("Mateus");
        arrayList.add("Roberto");
        arrayList.add("André");
        arrayList.add("Ademir");

        ArrayList<String> resultado = verifyInitial(arrayList);
        System.out.print("Os nomes do array que começam com 'A' são: ");
        System.out.println(resultado);
    }

    public static ArrayList<String> verifyInitial(ArrayList<String> array) {
        ArrayList<String> arrayListVI = new ArrayList<>();
        for (String palavra : array) {
            if (palavra.startsWith("A")) {
                arrayListVI.add(palavra);
            }
        }
        return arrayListVI;
    }
}
