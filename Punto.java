package Primeras_clases;

public class Punto {
	//variables
	int coordX;
	int coordY;
	//constructor
	public Punto(int nuevacoordX,int nuevacoordY){
		coordX=nuevacoordX;
		coordY=nuevacoordY; 
		


	}
	//métodos
	float devuelveDistanciaOrigen(){
		double distancia;
		distancia=Math.sqrt(coordX*coordX+coordY*coordY);
		return();
		
		
	
	}
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
}