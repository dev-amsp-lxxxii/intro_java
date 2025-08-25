
public class SwitchCaseExpression {

    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1 ->
                System.out.println("Domingo");
            case 2 ->
                System.out.println("Segunda-feira");
            case 3 ->
                System.out.println("Terça-feira");
            case 4 ->
                System.out.println("Quarta-feira");
            case 5 ->
                System.out.println("Quinta-feira");
            case 6 ->
                System.out.println("Sexta-feira");
            case 7 ->
                System.out.println("Sabádo");
            default ->
                System.out.println("Segunda-feira");
        }
    }
}
