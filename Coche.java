package poo;
 
public class Coche {
 
	private int ruedas, largo, ancho, motor, peso_plataforma, peso_total;
	private String color;
	private boolean asientos_cuero, climatizador;
 
	
	public Coche(){ // Método Constructor
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500; 
	}
		
	
	public String getDimeDatosGenerales(){ // Se crea el método Getters
		
		return "La plataforma del vehículo tiene: "+ ruedas +" ruedas,"+ " Mide " + largo/1000+ " metros de largo, "
				+ ancho +"cm de ancho y un peso de plataforma de "+ peso_plataforma+"kg";
		
	}
	
	public void setEstableceColor(String colorCoche){ // Se crea el método Setters
				
		color = colorCoche;
	}
	
	public String getDimeColor(){ // Se crea el método Getters
		
		return "El color del coche es "+ color;
		
	}
	
	public void setConfiguraAsientos(String asientos_cuero){
				
		if (asientos_cuero.equalsIgnoreCase("si")){
			
			this.asientos_cuero = true;
		}
		else{
			this.asientos_cuero = false;
		}
	}
	
	public String getDimeAsientos(){
			
			if (asientos_cuero){
				
				return " El coche tiene asientos de cuero";
			}
		
			else {
				return " El coche tiene asientos de serie";
			}
}
}
