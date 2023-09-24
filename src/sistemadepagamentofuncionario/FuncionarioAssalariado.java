
package sistemadepagamentofuncionario;

public class FuncionarioAssalariado extends Funcionario {
    private double salario;

    public FuncionarioAssalariado(String nome, String cpf, String endereco, String telefone, String setor, double salario) {
        super(nome, cpf, endereco, telefone, setor); //usada para se referir à classe pai em uma classe derivada.
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override //usada para indicar que um método está sobrescrevendo um método da classe pai
    public double calcularPagamento() {
        return salario;
    }

    @Override //usada para indicar que um método está sobrescrevendo um método da classe pai
    public void aplicarAumento(double percentualAumento) {
        salario += salario * (percentualAumento / 100);
    }
}

