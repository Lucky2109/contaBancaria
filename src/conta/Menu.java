package conta;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import java.util.Scanner;
import conta.util.Cores;
import java.io.IOException;
import java.util.InputMismatchException;

public class Menu {
	public static void main(String[] args) {
		
		//Teste da Classe Conta
		//Conta c1 = new Conta(1, 123,1, "Adriana", 10000.0f);
		//c1.visualizar();
		//c1.sacar(12000.0f);
		//c1.visualizar();
		//c1.depositar(5000.0f);
		//c1.visualizar();
		
		//Teste de Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2,"Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println(Cores.ANSI_CYAN_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("****************BANCO DO TIGRINHO********************");
			System.out.println("                TA PAGANDO FELLAS!!!                 ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("============1 - Criar Conta - =======================");
			System.out.println("============2 - Listar todas as Contas - ============");
			System.out.println("============3 - Buscar Conta por Numero - ===========");
			System.out.println("============4 - Atualizar Dados da Conta - ==========");
			System.out.println("============5 - Apagar Conta - ======================");
			System.out.println("============6 - Sacar - =============================");
			System.out.println("============7 - Depositar - =========================");
			System.out.println("============8 - Transferir valores entre Contas - ===");
			System.out.println("============9 - Sair - ==============================");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 9) {
				System.out.println(Cores.ANSI_RED_BACKGROUND_BRIGHT + "\nBANCO DO TIGRINHO - TA PAGANDO FELLAS!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");

					keyPress();
					break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");
					keyPress();

					break;
				case 3:
					System.out.println("Consultar dados da Conta - por número\n\n");
					keyPress();

					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");
					keyPress();

					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");
					keyPress();

					break;
				case 6:
					System.out.println("Saque\n\n");
					keyPress();

					break;
				case 7:
					System.out.println("Depósito\n\n");
					keyPress();

					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");
					keyPress();

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
	}
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:Lucas Moura da Costa ");
		System.out.println("linkedin.com/in/lucas-moura-da-costa-2a5a98237");
		System.out.println("https://github.com/Lucky2109");
		System.out.println("*********************************************************");
	   }
    
	
}
