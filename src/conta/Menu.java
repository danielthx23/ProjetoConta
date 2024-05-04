package conta;

import java.awt.print.Printable;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		        
				ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Daniel Saburo Akiyama", 10000.0f, 5000.0f);
				cc1.visualizar();
				cc1.sacar(12000.0f);
				cc1.visualizar();
				cc1.depositar(5000.0f);
				cc1.visualizar();
				
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Zé Sicrano", 10000.0f, 15);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {

			System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_GREEN_BOLD + "                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_YELLOW_BOLD + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.print(Cores.TEXT_BLUE_BOLD + "Entre com a opção desejada: ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.err.println(Cores.TEXT_RESET + "\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			System.out.println(Cores.TEXT_RESET);

			switch (opcao) {
			case 1:
				System.out.println("\nCriar Conta");

				keyPress();
				break;
			case 2:
				System.out.println("\nListar todas as Contas");

				keyPress();
				break;
			case 3:
				System.out.println("\nBuscar Conta por número");

				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar dados da Conta");

				keyPress();
				break;
			case 5:
				System.out.println("\nApagar Conta");

				keyPress();
				break;
			case 6:
				System.out.println("\nSacar");

				keyPress();
				break;
			case 7:
				System.out.println("\nDepositar");

				keyPress();
				break;
			case 8:
				System.out.println("\nTransferir");
				
				keyPress();
				break;
			case 9:
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);

				break;
			default:
				System.err.println("\nOpção Inválida!\n" + Cores.TEXT_RESET);
				
				keyPress();
				break;
			}
		} while (opcao != 9);

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Daniel Saburo Akiyama - danielakiyama8@gmail.com");
		System.out.println("https://github.com/danielthx23");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.err.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
