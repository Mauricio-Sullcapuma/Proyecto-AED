import java.time.*;
public class Hora {
	private LocalTime horain;

	public void definirHora(int horIn,int minIn) {
		this.horain=LocalTime.of(horIn,minIn);
		System.out.println( "La hora de  ingresada  es : "+horain);
		
	}
	public void mostrarhora() {
		System.out.println( "La hora actual es: " + LocalTime.now() );
	}
	@Override
	public String toString() {
		return  horain.toString() ;
	}

}

