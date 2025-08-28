
public class ExDiasNoMes {

    public static void main(String[] args) {
        String mes = "FEVEREIRO";

        String diaNoMes = switch (mes) {
            case "JANEIRO", "MARÇO", "MAIO", "JULHO", "AGOSTO", "OUTUBRO", "DEXEMBRO" ->
                "Mês com 31 dias.";
            case "ABRIL", "JUNHO", "SETEMBRO", "NOVEMBRO" ->
                "Mês com 30 dias.";
            case "FEVEREIRO" ->
                "Mês com 28 dias ou 29 dias em caso de bissexto.";
            default ->
                "Mês Desconhecido.";
        };
        System.out.println(diaNoMes);
    }
}
