
public class Usuario {
	{
	    private String nombre;
	    private String sexo;
	    private int dni;
	    private int edad;
	    private String direccion;
	    private String password;
	    public Usuario(String nombre, String sexo, 
	            int dni, int edad, 
	            String direccion, String password)
	    {
	        this.nombre = nombre;
	        this.sexo = sexo;
	        this.dni = dni;
	        this.edad = edad;
	        this.direccion = direccion;
	        this.password = password;
	    }
	    public String getNombre() 
	    {
	        return nombre;
	    }
	    public void setNombre(String nombre) 
	    {
	        this.nombre = nombre;
	    }
	    public String getSexo() 
	    {
	        return sexo;
	    }
	    public void setSexo(String sexo) 
	    {
	        this.sexo = sexo;
	    }
	    public int getDni() 
	    {
	        return dni;
	    }
	    public void setDni(int dni) 
	    {
	        this.dni = dni;
	    }
	    public int getEdad() 
	    {
	        return edad;
	    }
	    public void setEdad(int edad) 
	    {
	        this.edad = edad;
	    }
	    public String getDireccion() 
	    {
	        return direccion;
	    }
	    public void setDireccion(String direccion) 
	    {
	        this.direccion = direccion;
	    }
	    public String getPassword() 
	    {
	        return password;
	    }
	    public void setPassword(String password) 
	    {
	        this.password = password;
	    }
	    public abstract void iniciarSesion();
	    public abstract String toString(); 
	}
}
