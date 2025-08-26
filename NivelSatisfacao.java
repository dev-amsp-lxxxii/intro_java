
public class NivelSatisfacao {

    public static void main(String[] args) {
        int nivelDeSatisfacao = 1;

        switch (nivelDeSatisfacao) {
            case 1 ->
                System.out.println("Muito insastifeito.");
            case 2 ->
                System.out.println("Insatisfeito");
            case 3 ->
                System.out.println("Netro");
            case 4 ->
                System.out.println("Satisfeito");
            case 5 ->
                System.out.println("Muito Satisfeito");
            default ->
                System.out.println("(Opeção inválida - (Deve está entre 1 e 5)");
        }
    }
}
