
public class ExAvaliacaoNotaFequencia {

    public static void main(String[] args) {
        double nota01 = 10.00;
        double nota02 = 10.00;
        int freqnecia = 72;

        double mediaNota = (nota01 + nota02) / 2;

        if (mediaNota >= 7.00 && freqnecia >= 75) {
            System.out.println("Aluno aprovado com média: " + mediaNota + " e frequência de " + freqnecia + "%");
        } else {
            System.out.println("Aluno reprovado com média: " + mediaNota + " e frequência de " + freqnecia + "%");
        }
    }
}
