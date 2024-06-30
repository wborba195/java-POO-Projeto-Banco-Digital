
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(venilton);
		//Calendar cal = Calendar.getInstance();
		//poupanca.dataRendimento = cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.YEAR);

		//System.out.println("Data Hoje: " +poupanca.dataHoje);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		System.out.println("Data Aplicação: " +poupanca.dataAplica);
		System.out.println("Data Rendimento: " +poupanca.dataRendimento);
		poupanca.rendimento();
		
		cc.imprimirExtrato();		
		poupanca.imprimirExtrato();
	}

}
