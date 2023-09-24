
package sistemadepagamentofuncionario;

public abstract class Funcionario { // usada para declarar uma classe abstrata
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    public abstract double calcularPagamento();

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
    }

    public void aplicarAumento(double percentualAumento) {
        // Implemente o aumento salarial específico em cada classe derivada
    }
}
