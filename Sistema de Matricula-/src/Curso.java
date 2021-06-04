package Tipo_Datos;

public class Curso {
	private Integer CodigoCurso;
	private String NombreCurso;
	private Hora hora;
	private Fecha fecha;
	
	public Curso(String nombreCurso, Hora hora, Fecha fecha) {
		super();
		CodigoCurso=setCodigoCurso();
		this.NombreCurso = nombreCurso;
		this.hora = hora;
		this.fecha = fecha;
	}
	public Integer getCodigoCurso() {
		return CodigoCurso;
	}
	public int setCodigoCurso() {
		int cont=1000;
		CodigoCurso = cont++;
		return CodigoCurso;
	}
	@Override
	public String toString() {
		return "Curso [CodigoCurso: " + CodigoCurso + ", NombreCurso: " + NombreCurso + ", hora: " + hora + ", fecha: "
				+ fecha + "]";
	}
}
