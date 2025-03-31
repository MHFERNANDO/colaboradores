package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona{
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;
    private double edad;

    public Familiar (){

    }
    public Familiar(String nombre, String apellido, String direccion, String cedula, String parentesco, GregorianCalendar fechaDeNacimiento, String tipoDeSangre) {
        super(nombre, apellido, direccion, cedula);
        this.parentesco = parentesco;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tipoDeSangre = tipoDeSangre;
    }

    public void setParentesco(String parentesco){
        this.parentesco=parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }
    public double calcularEdad (GregorianCalendar fechaDeNacimiento){
        double edad=0;
        GregorianCalendar hoy = new GregorianCalendar();
        int anio = hoy.get(Calendar.YEAR);
        int mes = hoy.get(Calendar.MONTH)+1;
        int dia = hoy.get(Calendar.DAY_OF_MONTH);

        int anioP = fechaDeNacimiento.get(Calendar.YEAR);
        int mesP = fechaDeNacimiento.get(Calendar.MONTH);
        int diaP = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);

        edad = anio-anioP;

        if (mes < mesP || (mes == mesP && dia < diaP)){
            edad --;
        }

        System.out.println(anio + " "+ mes +" "+dia);

        this.edad=edad;
        return edad;


    }

    @Override
    public String toString() {
        Familiar familiar = new Familiar();

        return super.toString() +" Parentesco:"+parentesco+" Tipo de Sangre: "+tipoDeSangre+ " Edad: "+edad;
    }
}
