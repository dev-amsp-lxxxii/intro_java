package empresa.dados;

public class Funcionario {

    public String nome; // Por está public posso acessar de qualquer parte do programa.
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
