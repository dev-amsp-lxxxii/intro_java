
public class FuncionarioIII {

    String nome;
    String cargo;
    int idade;

    // Construtor default explicito
    // Este contrutor é criando implícitamente.
    FuncionarioIII() {
    }

    FuncionarioIII(String nomeInit) {
        nome = nomeInit;
    }

    // Este é o contrutor
    FuncionarioIII(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    public static void main(String[] args) {

        FuncionarioIII funcionario01 = new FuncionarioIII();
        funcionario01.nome = "Adelmo";
        funcionario01.cargo = "Desenvolvimento";
        funcionario01.idade = 43;

        FuncionarioIII funcionario02 = new FuncionarioIII("Pedro");
        funcionario02.cargo = "Pesquisador";
        funcionario02.idade = 40;

        FuncionarioIII funcionario03 = new FuncionarioIII("Marta", "RH", 55);

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
