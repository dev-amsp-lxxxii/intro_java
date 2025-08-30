
public class FuncionarioI {

    String nome;
    String cargo;
    int idade;

    public static void main(String[] args) {
        FuncionarioI funcionario1 = new FuncionarioI();
        funcionario1.nome = "Adelmo";
        funcionario1.cargo = "Desenvolvedor";
        funcionario1.idade = 43;

        FuncionarioI funcionario2 = new FuncionarioI();
        funcionario2.nome = "Maria";
        funcionario2.cargo = "Gerente";
        funcionario2.idade = 50;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);

        System.out.println("------------------------------");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);

    }
}
