/*Crie um projeto Java NetBeans com as classes/interfaces e implemente um código principal que
permita que o usuário informe dados para até 10 funcionários, questionando o tipo (assalariado/horista) e lendo os dados necessários. Mantenha-os em uma única lista independentemente se são assalariados ou horistas.
Mostre na tela os dados e o pagamento de cada um dos funcionários.
Aplique um aumento geral (informado pelo usuário) para todos os funcionários e mostre novamente os pagamentos de cada um deles.
Use encapsulamento nas classes.*/

package sistemadepagamentofuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDePagamentoFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>(); //usada para representar uma sequência ordenada de elementos

        System.out.println("Informe os dados para até 10 funcionários:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Funcionário " + i);
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Setor de Trabalho: ");
            String setor = scanner.nextLine();
            System.out.print("Tipo (A - Assalariado, H - Horista): ");
            String tipo = scanner.nextLine();

            if (tipo.equalsIgnoreCase("A")) {
                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine(); 

                funcionarios.add(new FuncionarioAssalariado(nome, cpf, endereco, telefone, setor, salario));
            } else if (tipo.equalsIgnoreCase("H")) {
                System.out.print("Horas trabalhadas: ");
                double horasTrabalhadas = scanner.nextDouble();
                System.out.print("Valor da hora: ");
                double valorHora = scanner.nextDouble();
                scanner.nextLine(); 

                funcionarios.add(new FuncionarioHorista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora));
            } else {
                System.out.println("Tipo de funcionário inválido.");
                i--; // Repetir o loop para o mesmo número de funcionário
            }

            System.out.println();
        }

        System.out.println("Dados dos funcionários e pagamentos:");

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Pagamento: R$" + funcionario.calcularPagamento());
            System.out.println();
        }

        System.out.print("Informe o percentual de aumento para todos os funcionários: ");
        double percentualAumento = scanner.nextDouble();

        for (Funcionario funcionario : funcionarios) {
            funcionario.aplicarAumento(percentualAumento);
        }

        System.out.println("Dados dos funcionários após o aumento e pagamentos:");

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Pagamento: R$" + funcionario.calcularPagamento());
            System.out.println();
        }
    }
}

