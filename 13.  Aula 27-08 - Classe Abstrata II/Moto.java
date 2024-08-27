
public class Moto extends Veiculo {
	public Moto(String modelo, double valorTabela, String Cor, String Combustivel, double Ipva) {
		super(modelo, valorTabela, Cor, Combustivel, Ipva);
	}

	@Override
	public void calculaIpva() {
		this.setIpva(this.getVT() * 2 / 100);
	}
}
