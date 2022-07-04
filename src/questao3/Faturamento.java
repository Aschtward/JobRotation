package questao3;

public class Faturamento {
	
	private String dia;
	private Double valor;
	
	public Faturamento(String dia,Double valor) {
		setDia(dia);
		setValor(valor);
	}

	protected String getDia() {
		return dia;
	}

	protected Double getValor() {
		return valor;
	}

	protected void setDia(String dia) {
		this.dia = dia;
	}

	protected void setValor(Double valor) {
		this.valor = valor;
	}
	
}
