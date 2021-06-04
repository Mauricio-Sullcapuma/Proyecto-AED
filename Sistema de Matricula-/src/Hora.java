package Tipo_Datos;
import java.time.*;

public class Hora {
	private LocalTime hora_ingresada;
	
	

	public Hora() {
		this.hora_ingresada = LocalTime.of(7, 0);
	}
	
	public void definirHora(int horIn,int minIn) {
		this.hora_ingresada=LocalTime.of(horIn,minIn);
		System.out.println( "La hora de  ingresada es: "+hora_ingresada);
		
	}
	public void mostrarhora() {
		System.out.println( "La hora actual es: " + LocalTime.now() );
	}
	@Override
	public String toString() {
		return  hora_ingresada.toString() ;
	}

}
