package map;

public class ContaPoupanca implements Agencia{
	private double taxa;
	@Override
	public Conta criaConta() {
		if (taxa > .03) {
			return new Simples();
		}
		else {
			return new Plus();
		}
		
	}

}