
public class Funcionario {

    String nome;
    String cargo;
    int idade;

    // Construtor default explicito
    // Este contrutor é criando implícitamente.
    Funcionario() {
    }

    Funcionario(String nomeInit) {
        nome = nomeInit;
    }

    // Este é o contrutor
    Funcionario(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "Adelmo";
        funcionario01.cargo = "Desenvolvimento";
        funcionario01.idade = 43;

        Funcionario funcionario02 = new Funcionario("Pedro");
        funcionario02.cargo = "Pesquisador";
        funcionario02.idade = 40;

        Funcionario funcionario03 = new Funcionario("Marta", "RH", 55);

        System.out.println("Nome: " + funcionario01.nome);
        System.out.println("Cargo: " + funcionario01.cargo);
        System.out.println("Idade: " + funcionario01.idade);

        System.out.println("Nome: " + funcionario02.nome);
        System.out.println("Cargo: " + funcionario02.cargo);
        System.out.println("Idade: " + funcionario02.idade);

        System.out.println("Nome: " + funcionario03.nome);
        System.out.println("Cargo: " + funcionario03.cargo);
        System.out.println("Idade: " + funcionario03.idade);
    }
}
