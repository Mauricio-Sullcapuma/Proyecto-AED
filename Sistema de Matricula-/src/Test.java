package Tipo_Datos;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	private static Usuario usuarioLogeado;
	private static int tipo_usuario; // 1 estudiante, 2 maestro

	// Base de datos
	private static ArrayList<Docente> docentes = new ArrayList<Docente>();
	private static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	private static ArrayList<Curso> cursos = new ArrayList<Curso>();
	// siesque ubiera mas entidades se aumenta
	
	
	
	public static void main(String[] args) {
		// Iniciar a las entidades por defecto
		// ejm. ingresar a maestros existentes
		docentes.add(new Docente("Juan", "M", 74859632, 25, "Av AQP 123", "12345", "D01", 125));
		docentes.add(new Docente("Pedro", "M", 74859632, 17, "Av AQP 456", "12345", "D02", 125));
		docentes.add(new Docente("Fiorella", "F", 85632147, 31, "Av AQP 789", "12345", "D03", 125));
		docentes.add(new Docente("German", "M", 74859632, 17, "Av AQP 101", "12345", "D04", 125));
		docentes.add(new Docente("Gloria", "F", 74859632, 22, "Av AQP 123", "12345", "D05", 125));
		
		cursos.add(new Curso("Fp1", new Hora(), new Fecha(10, 10, 1991), docentes.get(0)));
		cursos.add(new Curso("Fp2", new Hora(), new Fecha(12, 5, 1996), docentes.get(1)));
		cursos.add(new Curso("Fp3", new Hora(), new Fecha(10, 10, 1991), docentes.get(2)));
		cursos.add(new Curso("Fp4", new Hora(), new Fecha(12, 5, 1996), docentes.get(3)));
		cursos.add(new Curso("Fp5", new Hora(), new Fecha(10, 10, 1991), docentes.get(4)));
		cursos.add(new Curso("Fp6", new Hora(), new Fecha(12, 5, 1996), docentes.get(3)));
		cursos.add(new Curso("Fp7", new Hora(), new Fecha(10, 10, 1991), docentes.get(2)));
		cursos.add(new Curso("Fp8", new Hora(), new Fecha(12, 5, 1996), docentes.get(1)));
		
		estudiantes.add(new Estudiante("Robert", "M", 52639874, 15, "Av 123", "12345", "E123", false, new Curso [] {
				cursos.get(0),
				cursos.get(1)
		}, "1er grado"));
		
		estudiantes.add(new Estudiante("Romina", "F", 52639874, 15, "Av 123", "12345", "E456", false, new Curso [] {
				cursos.get(2),
				cursos.get(3)
		}, "2do grado"));
		
		estudiantes.add(new Estudiante("Abelardo", "M", 52639874, 15, "Av 123", "12345", "E789", false, new Curso [] {
				cursos.get(4),
				cursos.get(5)
		}, "3er grado"));
		
		estudiantes.add(new Estudiante("Cintia", "F", 52639874, 15, "Av 123", "12345", "E856", false, new Curso [] {
				cursos.get(6),
				cursos.get(7)
		}, "4to grado"));
		
		
		Scanner scan = new Scanner(System.in);
		
		menu();
		
		int opt = scan.nextInt();
		
		while (opt == 1 || opt == 2) {

			if (opt == 1) {
				
				System.out.print("Ingrese Codigo: ");
				String codigo = scan.next();
				
				System.out.print("Ingrese Clave: ");
				String clave = scan.next();
				
				boolean esValido = validarLogin(codigo, clave);
				
				if (esValido) {
					// imprimir menus segun el rol
					
					if (tipo_usuario == 1) {
						menuEstudiante();
						
						int optEst = scan.nextInt();
						
						Estudiante e = (Estudiante) usuarioLogeado;
						
						if (optEst == 1) {
							
							System.out.println("\nBienvenido a Consulta de Notas");
							System.out.println("Estudiante " + e.getNombre() + ", sus notas son: ");
							
							for (Curso c: e.getHorario()) {
								System.out.println(c.getNombreCurso() + ": " + c.getNotas());
							}
							
						} else if (optEst == 2) {
							
							System.out.println("\nBienvenido a Ver Horario");
							System.out.println("Estudiante " + e.getNombre() + ", su Horario es: ");
							
							for (Curso c: e.getHorario()) {
								System.out.println(c.getNombreCurso() + ": " + c.getHora());
							}
							
						} else if (optEst == 3) {
							System.out.println("\nBienvenido a Su Consolidado de Matricula");
							System.out.println("Estudiante " + e.getNombre() + ", sus matriculas son: ");
							
							for (Curso c: e.getHorario()) {
								System.out.println(c.getNombreCurso() + ": Doc. " + c.getDocente().getNombre());
							}
						}
						
					} else {
						menuMaestro();
						
						int optDoc = scan.nextInt();
						
						Docente e = (Docente) usuarioLogeado;
						
						if (optDoc == 1) {
							
							System.out.println("\nBienvenido a Registrar Notas");
							
							System.out.print("  Ingrese codigo del estudiante: ");
							String cod_est = scan.next();
							
							System.out.print("  Ingrese codigo del curso: ");
							int cod_cur = scan.nextInt();
							
							boolean encontrado = false;
							for (Estudiante est: estudiantes) {
								if (est.getCodigo_E().equals(cod_est)) {
									for (Curso curs: est.getHorario()) {
										if (curs.getCodigoCurso() == cod_cur) {
											System.out.print("Ingrese Nota 1: ");
											double nota1 = scan.nextDouble();
											System.out.print("Ingrese Nota 2: ");
											double nota2 = scan.nextDouble();
											System.out.print("Ingrese Nota 3: ");
											double nota3 = scan.nextDouble();
											
											curs.setNotas(new Nota(nota1, nota2, nota3));
											
											System.out.println("Notas ingresadas exitosamente");
											
											encontrado = true;
										}
									}
								}
								
								if (!encontrado) {
									System.out.println("Estudiante y/o Curso no encontrado");
								}
							}
							
						} else if (optDoc == 2) {
							
							System.out.println("\nBienvenido a Ver Horario");
							System.out.println("Docente " + e.getNombre() + ", su Horario es: ");
							
							for (Curso c: cursos) {
								if (c.getDocente().getCodigo_D().equals(e.getCodigo_D())) {
									System.out.println(c.getNombreCurso() + ": " + c.getHora());
								}
								
							}
							
						} else if (optDoc == 3) {
							
							System.out.println("\nBienvenido a Sus Cursos Dictados");
							System.out.println("Docente " + e.getNombre() + ", sus cursos son: ");
							
							for (Curso c: cursos) {
								if (c.getDocente().getCodigo_D().equals(e.getCodigo_D())) {
									System.out.println(c.getNombreCurso());
								}
							}
						}
						
					}
					
				} else {
					System.out.println("Usuario no encontrado");
				}
				
			} else {
				
				menuRegistrar();
				
				int optRegistrar = scan.nextInt();
				
				if (optRegistrar == 1) {
					System.out.println("Ingrese nombre: ");
					String nombre = scan.next();
					
					System.out.println("Ingrese sexo: ");
					String sexo = scan.next();
					
					System.out.println("Ingrese dni: ");
					int dni = scan.nextInt();
					
					System.out.println("Ingrese edad: ");
					int edad = scan.nextInt();
					
					System.out.println("Ingrese codigo: ");
					String codigo = scan.next();
					
					System.out.println("Ingrese contrasena: ");
					String pass = scan.next();
					
					estudiantes.add(
							new Estudiante(nombre, sexo, dni, edad, "", pass, codigo, false, null, "")
							);
					
					System.out.println("Estudiante agregado exitosamente");
					
				} else {
					
					System.out.println("Ingrese nombre: ");
					String nombre = scan.next();
					
					System.out.println("Ingrese sexo: ");
					String sexo = scan.next();
					
					System.out.println("Ingrese dni: ");
					int dni = scan.nextInt();
					
					System.out.println("Ingrese edad: ");
					int edad = scan.nextInt();
					
					System.out.println("Ingrese codigo: ");
					String codigo = scan.next();
					
					System.out.println("Ingrese contrasena: ");
					String pass = scan.next();
					
					docentes.add(
							new Docente(nombre, sexo, dni, edad, "", pass, codigo, 1500)
							);
					
					System.out.println("Docente registrado exitosamente");
				}
				
			}
			
			
			menu();
			opt = scan.nextInt();
		}
		
		System.out.println("\nFin del programa...");
		
	}
	
	public static boolean validarLogin(String codigo, String clave) {
		if (codigo.charAt(0) == 'E') {
			// siesque el codigo es de estudiante
			for (int i = 0; i < estudiantes.size(); i++) {
				if (estudiantes.get(i).getCodigo_E().equals(codigo) && 
						estudiantes.get(i).getPassword().equals(clave)) {
					usuarioLogeado = estudiantes.get(i);
					tipo_usuario = 1;
					return true;
				}
			}
		} else {
			// si el codigo es de docente
			for (int i = 0; i < docentes.size(); i++) {
				if (docentes.get(i).getCodigo_D().equals(codigo) &&
						docentes.get(i).getPassword().equals(clave)) {
					usuarioLogeado = docentes.get(i);
					tipo_usuario = 2;
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void menu() {
		System.out.println("\n\t\tMENU");
		System.out.println("\t1. Ingresar");
		System.out.println("\t2. Registrar");
		System.out.println("\tOtro. Salir");
		System.out.print("\n\tIngrese opcion: ");
	}
	
	public static void menuRegistrar() {
		System.out.println("\n\t\tMENU REGISTRAR");
		System.out.println("\t1. Registrarse como Estudiante");
		System.out.println("\t2. Registrarse como Maestro");
		System.out.println("\tOtro. Salir");
		System.out.print("\n\tIngrese opcion: ");
	}
	
	public static void menuEstudiante() {
		System.out.println("\n\t\tMENU ESTUDIANTE");
		System.out.println("\t1. Consultar Notas");
		System.out.println("\t2. Ver Horario");
		System.out.println("\t2. Ver Matricula");
		System.out.println("\tOtro. Salir");
		System.out.print("\n\tIngrese opcion: ");
	}
	
	public static void menuMaestro() {
		System.out.println("\n\t\tMENU DOCENTE");
		System.out.println("\t1. Registrar Notas");
		System.out.println("\t2. Ver Horario");
		System.out.println("\t2. Ver Cursos");
		System.out.println("\tOtro. Salir");
		System.out.print("\n\tIngrese opcion: ");
	}

}