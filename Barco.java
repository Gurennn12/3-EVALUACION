package Primeras_clases;

public class Barco {
	
	
	//Atributos
	private String nombreBarco;
	private int tamano
	private int numeroPalos;
	//constructora
	public Barco(String nombreBarco, int tamano, int numeroPalos) {
		super();
		this.nombreBarco = nombreBarco;
		this.tamano = tamano;
		this.numeroPalos = numeroPalos;

}
	public String getNombreBarco() {
		return nombreBarco;
	}
	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public int getNumeroPalos() {
		return numeroPalos;
	}
	public void setNumeroPalos(int numeroPalos) {
		this.numeroPalos = numeroPalos;
	}
