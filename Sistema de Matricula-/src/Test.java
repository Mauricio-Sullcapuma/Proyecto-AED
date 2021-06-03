package Tipo_Datos;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	private static Usuario usuarioLogeado;
	private static int tipo_usuario; // 1 estudiante, 2 maestro

	// Base de datos
	private ArrayList<Docente> docentes = new ArrayList<Docente>();
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	// siesque ubiera mas entidades se aumenta
	
	
	
	public static void main(String[] args) {
		// Iniciar a las entidades por defecto
		// ejm. ingresar a maestros existentes
		
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
						
						// Colocar demas acciones que pertenecen al estudiante
					} else {
						menuMaestro();
						
						// Colocar demas acciones que pertenecen al docente
					}
					
				} else {
					// mensaje de que no existe el usuario
				}
				
			} else {
				
				menuRegistrar();
				
				int optRegistrar = scan.nextInt();
				
				if (optRegistrar == 1) {
					// pediriamos datos del estudiante
					// Registrar
					
					// mensaje de registro mostrando sus datos
				} else {
					// pedimos datos del Maestro
					// Registrar
					
					// mensaje de registro mostrando sus datos
				}
				
			}
			
			
			menu();
			opt = scan.nextInt();
		}
		
		System.out.println("\nFin del programa...");
		
		/*
		Hora h1=new Hora();
		Fecha f1=new Fecha(31,5,2021);
		
		h1.mostrarhora();
		h1.definirHora(1,30);
		
		Curso cu=new Curso("Matematica",h1,f1);
		System.out.println(cu);
		h1.definirHora(1,33);
		Codigo co=new Codigo('a','b','c','d','e');
		System.out.println(co);
		*/
		
		
	}
	
	public static boolean validarLogin(String usuario, String clave) {
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
		
	}
	
	public static void menuMaestro() {
		
	}

}