package empresa.dados;

public class Funcionario {

    // Quando está usando o modificador de acesso public, se pode utilizar a variável, função fora da classe
    // Quando está usando o modificador de acessor private, só pode usar a váriavel, função dentro da classe
    private String nome;
    String cargo;
    double salario;
    int idade;

    public Funcionario(String nome, String cargo, double salario, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Idade: " + idade);
    }
}
