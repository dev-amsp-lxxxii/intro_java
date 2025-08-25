
public class SwitchCaseInicializacao {

    public static void main(String[] args) {
        String dia = "DOMINGO";

        String tipoDeDia = switch (dia) {
            case "SEGUNDA", "TERCA", "QUARTA", "QUINTA", "SEXTA" ->
                "DIA UTIL";
            case "SABADO", "DOMINGO" ->
                "FIM DE SEMANA";
            default ->
                "DESCONHECIDO";
        };
        System.out.println(tipoDeDia);
    }
}
