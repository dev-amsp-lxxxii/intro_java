
public class ExVerificacaoAvaliacaoSimplificada {

    public static void main(String[] args) {
        double nota01 = 7.25;
        double nota02 = 3.5;
        double mediaNota = (nota01 + nota02) / 2;

        if (mediaNota >= 6.0) {
            System.out.println("Aluno está aprovado -> " + mediaNota);
        } else {
            System.out.println("Aluno está reprovado -> " + mediaNota);
        }
    }
}
