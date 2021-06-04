package Tipo_Datos;

import java.time.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Locale;

public class Fecha implements Comparable<Fecha> {
	private GregorianCalendar calendar;
	public Fecha(Integer d,Integer m,Integer a) {
		if (!esValida(d,m,a)) {
			throw new IllegalArgumentException("Fecha Invalida dia : "+d+" mes :"+m+" anio :"+a);
		}
		this.calendar=new GregorianCalendar(a,m-1,d);
	}
	public Integer getDiaSemana() {
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
	public Integer getDiaMes() {
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	public Integer getMes() {
		return calendar.get(Calendar.MONTH);
	}
	public Integer getAño() {
		return calendar.get(Calendar.YEAR);
	}
	public String getDiaSemanaCadena() {
		return calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,new Locale("ES"));
	}
	public String getMesCadena() {
		return calendar.getDisplayName(Calendar.MONTH,Calendar.LONG,new Locale("ES"));
	}
	public void suma(Integer a) {
		calendar.add(Calendar.DAY_OF_MONTH, a);
		
	}
	public void resta(Integer a) {
		calendar.add(Calendar.DAY_OF_MONTH, -a);
		
	}
	public boolean esBisiesto() {
		return this.calendar.isLeapYear(getAño());
	}
	public int compareTo(Fecha f) {
		return this.calendar.compareTo(f.calendar);
	}
	public boolean equals(Object o) {
		boolean res=false;
		if(o instanceof Fecha) {
			Fecha f=(Fecha)o;
			res=this.calendar.equals(f.calendar);
		}
		return res;
	}
	private boolean esValida(Integer d,Integer m,Integer a) {
		boolean r = true;
		try {
			Calendar c = new GregorianCalendar(a,m-1,d);
			c.setLenient(false);
			c.getTime();
		}
		catch(IllegalArgumentException e) {
			r=false;
		}
		return r;
	}
	public String toString() {
		return getDiaSemanaCadena()+" "+getDiaMes()+"/"+getMesCadena()+"/"+getAño();
	}
	public void mostrarfecha() {
		System.out.println( "La fecha actual es: " + LocalDate.now() );
	}
}