package questao4;

public class FaturamentoEstado {
	
	private String estado;
	private Double fatura��o;
	
	public FaturamentoEstado(String estado, Double fatura��o) {
		super();
		this.estado = estado;
		this.fatura��o = fatura��o;
	}
	
	protected String getEstado() {
		return estado;
	}
	protected Double getFatura��o() {
		return fatura��o;
	}
	protected void setEstado(String estado) {
		this.estado = estado;
	}
	protected void setFatura��o(Double fatura��o) {
		this.fatura��o = fatura��o;
	}
	
	

}
