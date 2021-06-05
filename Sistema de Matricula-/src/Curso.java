package Tipo_Datos;

public class Curso {
	private Integer CodigoCurso;
	private String NombreCurso;
	private Hora hora;
	private Fecha fecha;
	private Nota notas;
	private Docente docente;
	
	public Curso(String nombreCurso, Hora hora, Fecha fecha) {
		super();
		CodigoCurso=setCodigoCurso();
		this.NombreCurso = nombreCurso;
		this.hora = hora;
		this.fecha = fecha;
		
		this.notas = new Nota(0, 0, 0);
	}
	
	public Curso(String nombreCurso, Hora hora, Fecha fecha, Docente docente) {
		super();
		CodigoCurso=setCodigoCurso();
		this.NombreCurso = nombreCurso;
		this.hora = hora;
		this.fecha = fecha;
		this.docente = docente;
		
		this.notas = new Nota(0, 0, 0);
	}
	
	public Curso(Integer codigoCurso, String nombreCurso, Hora hora, Fecha fecha, Nota notas) {
		super();
		CodigoCurso = codigoCurso;
		NombreCurso = nombreCurso;
		this.hora = hora;
		this.fecha = fecha;
		this.notas = notas;
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
	public String getNombreCurso() {
		return NombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		NombreCurso = nombreCurso;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public void setCodigoCurso(Integer codigoCurso) {
		CodigoCurso = codigoCurso;
	}

	public Nota getNotas() {
		return notas;
	}
	
	public void setNotas(Nota notas) {
		this.notas = notas;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
	
}
