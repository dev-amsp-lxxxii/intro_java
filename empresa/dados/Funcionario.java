package empresa.dados;

public class Funcionario {

    /*
    Quando está usando o modificador de acesso public:
            se pode utilizar a variável, função fora da classe
    Quando está usando o modificador de acessor private:
            só pode usar a váriavel, função dentro da classe
    Quando está usando o modificador de acessor protectd: 
            pode usar a váriavel, função dentro da classe, mesmo pacotes e subclasses
     */
    String nome;
    String cargo;
    double salario;
    int idade;

    private Funcionario(String nome, String cargo, double salario, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Idade: " + idade);
    }

    protected Funcionario() {
        Funcionario func = new Funcionario("Adelmo", "Desenvolvedor", 10000, 43);
    }
}
