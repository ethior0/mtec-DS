
public class Carro extends Veiculo {

	public Carro(String modelo, double valorTabela, String Cor, String Combustivel, double Ipva) {
		super(modelo, valorTabela, Cor, Combustivel, Ipva);
	}

	@Override
	public void calculaIpva() {
		this.setIpva(this.getVT() * 4 / 100);
	}
}
