import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends Conta {

	public Date dataAplica;
	public String dataRendimento;
	public String dataHoje;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		dataAplica = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataAplica);
		cal.add(Calendar.DATE, 30);
		dataRendimento = cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.YEAR);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	public void rendimento() {
		Calendar hj = Calendar.getInstance();
		//dataHoje = hj.getTime();//
		dataHoje = hj.get(Calendar.DAY_OF_MONTH)+"/"+hj.get(Calendar.MONTH)+"/"+hj.get(Calendar.YEAR);
		if (dataRendimento.equalsIgnoreCase(dataHoje)){
			Double saldoNew = saldo * 1.05;
			hj.add(Calendar.DATE, 30);
			dataAplica = hj.getTime();
			System.out.println("Novo Saldo: " + saldoNew);
			System.out.println("Rendimento: " + (saldoNew-saldo));
		}else{
			System.out.println("Sem rendimento!");
		}
	}

}
