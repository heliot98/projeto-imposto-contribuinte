package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();
		System.out.print("Informe o numero de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #" + i + ":");
			System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else {
				System.out.print("Numero de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
        System.out.println();
		System.out.println("IMPOSTO PAGOS: ");
		for(Contribuinte contri : list) {
			System.out.println(contri.getNome()+ " R$ "+ String.format("%.2f", contri.imposto()));
		}
		double soma = 0.0;
		for (Contribuinte contri : list) {
			soma += contri.imposto();
		}
        System.out.println();
		System.out.printf("IMPOSTOS TOTAIS: %.2f%n", soma);

		sc.close();
	}

}
