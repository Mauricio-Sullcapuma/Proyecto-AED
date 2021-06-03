package estudiantes;

import java.util.Scanner;

public class Docente extends Usuario
{
    private int codigo_D;
    private Curso[] horario;
    private double sueldo;
    public Docente(String nombre, String sexo, int dni, 
            int edad, String direccion, String password) 
    {
        super(nombre, sexo, dni, edad, direccion, password);
    }
    public int getCodigo_D() 
    {
        return codigo_D;
    }
    public void setCodigo_D(int codigo_D) 
    {
        this.codigo_D = codigo_D;
    }
    public Curso[] getHorario() 
    {
        return horario;
    }
    public void setHorario(Curso[] horario) 
    {
        this.horario = horario;
    }
    public double getSueldo() 
    {
        return sueldo;
    }
    public void setSueldo(double sueldo) 
    {
        this.sueldo = sueldo;
    }
    public void registrar_notas()
    {
        
    }
    public void ver_estudiante()
    {
        
    }
    public void ver_horario()
    {
        
    }
    @Override
    public void iniciarSesion() 
    {
        System.out.println("Ingrese dni: ");
        Scanner sc = new Scanner(System.in);
        String dni = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Ingrese contraseña: ");
        String password = sc.nextLine();
        int entrada_dni = Integer.parseInt(dni);
        if (entrada_dni == this.getDni() && 
                password.compareTo(this.getPassword())== 0)
        {
            System.out.println("Acceso a la cuenta de docente: ");
            
        }
        else
        {
            System.out.println("Datos incorrectos");
        }
    }

    @Override
    public String toString() 
    {
        return "";
    }
    
}
