
public class OperadorTernario {

    public static void main(String[] args) {
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";

        /*
        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }
         */
        System.out.println("O número é: " + resultado);
    }
}
