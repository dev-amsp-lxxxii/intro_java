
public class ExSomaNumerosPositivos {

    public static void main(String[] args) {
        int numPositivoInteiro = 10;
        int j = 0;
        int resultado = 0;

        do {
            if (numPositivoInteiro % 2 == 0) {
                resultado += numPositivoInteiro;
                // System.out.println(resultado);
            }

            numPositivoInteiro--;
            j++;
        } while (j <= 10);
        System.out.println(resultado);
    }
}
