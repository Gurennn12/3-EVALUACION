package Primeras_clases;

public class ManejarBarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco miPrimerBarquito,miSegundoBarquito;
		BarcoVelasCuadradas miBarquitoBebe;
		miPrimerBarquito=new Barco("velero",12,2);
		miSegundoBarquito=new Barco("bergantin",67,5);
		System.out.println(miPrimerBarquito.getNombreBarco());
		System.out.println(miSegundoBarquito.getNombreBarco());
		miBarquitoBebe=new BarcoVelasCuadradas("Trirreme",10,1,trueº);
	}

}
