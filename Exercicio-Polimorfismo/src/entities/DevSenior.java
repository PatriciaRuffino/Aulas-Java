package entities;

public class DevSenior extends Dev {
	private double acrescimo;

	public DevSenior(String nome, Integer horas, Double valorPorHora, double acrescimo) {
		super(nome, horas, valorPorHora);
		this.acrescimo = acrescimo;
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	@Override
	public double pagamento() {
		return super.pagamento()+acrescimo * 2;
	}

}
