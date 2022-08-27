package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Dev;
import entities.DevSenior;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Dev> list = new ArrayList<>();

		System.out.print("Entre com a quantidade de Desenvolvedores: ");

		int n = sc.nextInt();
		// tenho que fazer um for para ler repetidamente a qtd de Devs

		for (int i = 1; i <= n; i++) {
			System.out.println("Desenvolvedor # " + i + "dados: ");
			System.out.println("O desenvolvedor é Senior? (y/n)? ");
			// crio uma variável para receber a leitura acima
			char ch = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Horas: ");
			int horas = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();

			if (ch == 'y') {
				System.out.println("Acrescimo: ");
				double acrescimo = sc.nextDouble();

				Dev dev = new DevSenior(nome, horas, acrescimo, acrescimo);

				list.add(dev);
			} else {
				Dev dev = new Dev(nome, horas, valorPorHora);

				list.add(dev);
			}
		}
		System.out.println();
		System.out.println("Pagamentos: ");

		for (Dev dev : list) {
			System.out.println(dev.getNome() + "- R$" + String.format("%.2f", dev.pagamento()));
		}

		sc.close();

	}

}
