import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas R");
		
		Conta contaCorrente1 = new ContaCorrente(lucas);
		Conta contaPoupanca1 = new ContaPoupanca(lucas);
		
		contaCorrente1.depositar(100);
		contaCorrente1.depositar(200);
		contaCorrente1.transferir(100, contaPoupanca1);

		
		contaCorrente1.imprimirExtrato();
		contaPoupanca1.imprimirExtrato();
		
		Banco banco = new Banco("Santander", List.of(contaCorrente1, contaPoupanca1));
        banco.listarClientes();

	}

}
