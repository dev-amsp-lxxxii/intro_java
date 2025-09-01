
public class FuncionarioII {

    String nome;
    String cargo;
    int idade;

    // Este é o contrutor
    FuncionarioII(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String[] args) {
        FuncionarioII funcionario1 = new FuncionarioII("Adelmo", "Desenvolvedor", 43);
        FuncionarioII funcionario2 = new FuncionarioII("Maria", "Gerente", 50);

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);

        System.out.println("------------------------------");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);

    }
}
