
package sistemadepagamentofuncionario;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor); //usada para se referir à classe pai em uma classe derivada.
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override //usada para indicar que um método está sobrescrevendo um método da classe pai
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    @Override //usada para indicar que um método está sobrescrevendo um método da classe pai
    public void aplicarAumento(double percentualAumento) {
        valorHora += valorHora * (percentualAumento / 100);
    }
}

