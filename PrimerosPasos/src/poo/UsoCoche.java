package poo;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche=new Coche();
		
		micoche.establece_color("marron");
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos("no");
		
		System.out.println(micoche.dime_asientos());

	}

}
