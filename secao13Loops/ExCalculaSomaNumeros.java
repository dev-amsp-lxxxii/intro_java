
public class ExCalculaSomaNumeros {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += i;
            System.out.println("Interações: " + i + " " + soma);
        }
    }
}
