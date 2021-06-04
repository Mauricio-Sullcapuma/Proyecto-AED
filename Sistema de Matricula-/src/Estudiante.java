package Tipo_Datos;
import java.util.Scanner;
public class Estudiante extends Usuario
{
    private String codigo_E;
    private boolean matriculado;
    private Curso[] horario;
    private String grado;
    
    public Estudiante(String nombre, String sexo, int dni, int edad, String direccion, String password, String codigo_E, boolean matriculado, Curso[] horario, String grado) 
    {
        super(nombre, sexo, dni, edad, direccion, password);
        this.codigo_E = codigo_E;
        this.matriculado = matriculado;
        this.horario = horario;
        this.grado = grado;
    }
    public String getCodigo_E() 
    {
        return codigo_E;
    }
    public void setCodigo_E(String codigo_E) 
    {
        this.codigo_E = codigo_E;
    }
    public boolean isMatriculado() 
    {
        return matriculado;
    }
    public void setMatriculado(boolean matriculado) 
    {
        this.matriculado = matriculado;
    }
    public Curso[] getHorario() 
    {
        return horario;
    }
    public void setHorario(Curso[] horario) 
    {
        this.horario = horario;
    }
    public String getGrado() 
    {
        return grado;
    }
    public void setGrado(String grado) 
    {
        this.grado = grado;
    }
    public void verMatricula()
    {
        
    }
    public void verNotas()
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
        System.out.println("Ingrese contrase�a: ");
        String password = sc.nextLine();
        int entrada_dni = Integer.parseInt(dni);
        if (entrada_dni == this.getDni() && 
                password.compareTo(this.getPassword())== 0)
        {
            System.out.println("Acceso a la cuenta de alumno: ");
            this.verMatricula();
        }
        else
        {
            System.out.println("Datos incorrectos");
        }
    }
    public String toString() 
    {
        return "";
    }
    
}
