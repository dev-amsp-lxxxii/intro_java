
public class SwitchCaseLegacy {

    public static void main(String[] args) {
        int diaDaSemana = 5;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domigo.");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Dia Desconhecido");
                break;
        }
    }
}
