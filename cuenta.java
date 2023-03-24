package Primeras_clases;

public class cuenta {
	private String titular;
	private double cantidad;
	//primer constructor
	publ

	public cuenta(String titular,double cantidad) {
		//titular=nuevotitular
		//cantidad=nuevacantidad
		this.titular=titular;
		this.cantidad=cantidad;
		// TODO Auto-generated method stub

	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

}
