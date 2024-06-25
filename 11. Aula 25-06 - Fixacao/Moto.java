package fixacao;

public class Moto extends Veiculo {

	public Moto(String modelo, double valorTabela, String cor, double combustivel) {
		super(modelo, valorTabela, cor, combustivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaIpva() {
		double newIpva = super.getValorTabela() * 2 / 100;
		super.setIpva(newIpva);
		return super.getIpva();
	}
}
