package ec.edu.ups.poo.clases;

public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private String cedula;

    public Persona (){//Constructor
        //this.cedula=cedula;
    }

    public Persona(String nombre, String apellido, String direccion, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cedula = cedula;
    }

    public void setCedula (String cedula){
        this.cedula=cedula;
    }
    public String getCedula (){
        return cedula;
    }



    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre (){
        return nombre;
    }

    public void setApellido (String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    public void setDireccion (String direccion){
        this.direccion = direccion;
    }

    public String getDireccion (){
        return direccion;
    }

    @Override
    public String toString (){
        return "Cedula: "+ cedula + " Nombre: "+ nombre + " Aoellido: " +apellido + " Direccion: "+ direccion;
    }

    /*public int suma(int num1, int num2){
        int suma = num1+num2;\ 
        return suma;
    }*/

}
