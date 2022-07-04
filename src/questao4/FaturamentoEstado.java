package questao4;

public class FaturamentoEstado {
	
	private String estado;
	private Double faturação;
	
	public FaturamentoEstado(String estado, Double faturação) {
		super();
		this.estado = estado;
		this.faturação = faturação;
	}
	
	protected String getEstado() {
		return estado;
	}
	protected Double getFaturação() {
		return faturação;
	}
	protected void setEstado(String estado) {
		this.estado = estado;
	}
	protected void setFaturação(Double faturação) {
		this.faturação = faturação;
	}
	
	

}
