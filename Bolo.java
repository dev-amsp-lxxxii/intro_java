
public class Bolo {

    // variável de instância ou variável menbro
    // inicicialização padrão -> zero
    int quantidadeAcucar = 288;

    public static void main(String[] args) {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeAcucar = 150;

        Bolo boloDeMacaxeira = new Bolo();

        System.out.println("Quantidade de açucar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);
        System.out.println("Quantidade de açucar no bolo de baunilha: " + boloDeBaunilha.quantidadeAcucar);
        System.out.println("Quantidade de açucar no bolo de macaxeira: " + boloDeMacaxeira.quantidadeAcucar);
    }
}
