package fixacao;

public class Carro extends Veiculo {

	public Carro(String modelo, double valorTabela, String cor, double combustivel) {
		super(modelo, valorTabela, cor, combustivel);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculaIpva() {
		double newIpva = super.getValorTabela() * 4 / 100;
		super.setIpva(newIpva);
		return super.getIpva();
	}
}
