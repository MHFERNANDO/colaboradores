package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

    public static void main (String [] args){
        /*Scanner leer = new Scanner(System.in);
        Persona persona = new Persona();
        Familiar familiar = new Familiar();
        //Atributos clase padre
        familiar.setCedula("0102030405");
        familiar.setNombre("Familiar 1");
        familiar.setApellido("Familiar 1");
        familiar.setDireccion("Familiar 1");
        //ATributos clase hija
        familiar.setParentesco("Mama");
        familiar.setTipoDeSangre("1");
        //Instanciar un objeto de tipo calender
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(2006,04,29);
        familiar.setFechaDeNacimiento(calendar);
        //Imprimir con el toString
        System.out.println(persona);*/

        /*Familiar  familiar = new Familiar();
        Scanner leer = new Scanner(System.in);
        int anioP=2006;
        int mesP=4;
        int diaP=29;

        GregorianCalendar fechaDeNacimiento = new GregorianCalendar();

        fechaDeNacimiento.set(anioP,mesP,diaP);
        familiar.setFechaDeNacimiento(fechaDeNacimiento);
        double edad=familiar.calcularEdad(fechaDeNacimiento);
        System.out.println(familiar);*/
        Scanner leer = new Scanner(System.in);
        int numPersona =0 ;
        int numFamiliar =0;
        System.out.println("Inserte el numero de personas a ingresar");
        numPersona= leer.nextInt();
        System.out.println("Inserte el numero de familiares a ingresar");
        numFamiliar= leer.nextInt();

        Persona []personas = new Persona[numPersona+numFamiliar];
        Familiar []familiares = new Familiar[numFamiliar];

        System.out.println("----------Personas-------------");
        for (int i=0 ; i < numPersona;i++){
            Persona persona = new Persona();
            System.out.println("Ingresa el numero de cedula de la persona:"+(i+1));
            String cedula = leer.next();
            persona.setCedula(cedula);
            System.out.println("Ingrese el nombre de la persona: "+(i+1) );
            String nombre = leer.next();
            persona.setNombre(nombre);
            System.out.println("Ingrese el apellido de la persona: "+(i+1));
            String apellido = leer.next();
            persona.setApellido(apellido);
            System.out.println("Ingrese la direccion de la persona: "+(i+1));
            String direccion = leer.next();
            persona.setDireccion(direccion);
            personas [i]= persona;
        }

        System.out.println("------Familiares----------");
        for (int i=0; i< numFamiliar;i++){

            Familiar familiar = new Familiar();
            System.out.println("Me encanta el huevito");
            System.out.println("Ingresa el numero de cedula del familiar:"+(i+1));
            String cedula = leer.next();
            familiar.setCedula(cedula);
            System.out.println("Ingrese el nombre del familiar: "+(i+1) );
            String nombre = leer.next();
            familiar.setNombre(nombre);
            System.out.println("Ingrese el apellido del familiar: "+(i+1));
            String apellido = leer.next();
            familiar.setApellido(apellido);
            System.out.println("Ingrese la direccion del familiar: "+(i+1));
            String direccion = leer.next();
            familiar.setDireccion(direccion);
            System.out.println("Inserte el parentesco del familiar: "+(i+1));
            String parentesco = leer.next();
            familiar.setParentesco(parentesco);
            System.out.println("Inserte el tipo de sangre del familiar: "+(i+1));
            String tipoDeSangre = leer.next();
            familiar.setTipoDeSangre(tipoDeSangre);
            System.out.println("Inserte el dia de nacimiento del familiar: "+(i+1));
            int diaP = leer.nextInt();
            System.out.println("Inserte el mes de nacimiento del familiar: "+(i+1));
            int mesP = leer.nextInt();
            System.out.println("Inserte el año de nacimiento del familiar: "+(i+1));
            int anioP = leer.nextInt();
            GregorianCalendar fechaDeNacimiento = new GregorianCalendar();
            fechaDeNacimiento.set(anioP,mesP,diaP);
            familiar.setFechaDeNacimiento(fechaDeNacimiento);
            familiar.calcularEdad(fechaDeNacimiento);
            familiares [i] = familiar;
        }

        for (int i =0 ; i<numPersona;i++){
            System.out.println(personas[i]);
        }
        for (int i=0;i<numFamiliar;i++){
            System.out.println(familiares[i]);
        }



        //Persona 1
        /*Persona persona1 = new Persona();
        System.out.println("***************Persona 1*******************");
        System.out.println("Ingrese el Nombre de la persona 1");
        String nombre1 = leer.next();
        persona1.setNombre(nombre1);
        System.out.println("Ingrese el apellido de la persona 1");
        String apellido1 = leer.next();
        persona1.setApellido(apellido1);
        System.out.println("Ingrese la direccion de la persona 1");
        String direccion1 = leer.next();
        persona1.setDireccion(direccion1);

        Persona persona2 = new Persona();
        System.out.println("***************Persona 2*******************");
        System.out.println("Ingrese el Nombre de la persona 2");
        String nombre2 = leer.next();
        persona2.setNombre(nombre2);
        System.out.println("Ingrese el apellido de la persona 2");
        String apellido2 = leer.next();
        persona2.setApellido(apellido2);
        System.out.println("Ingrese la direccion de la persona 2");
        String direccion2 = leer.next();
        persona2.setDireccion(direccion2);

        Persona persona3 = new Persona();
        System.out.println("***************Persona 3*******************");
        System.out.println("Ingrese el Nombre de la persona 3");
        String nombre3 = leer.next();
        persona3.setNombre(nombre3);
        System.out.println("Ingrese el apellido de la persona 3");
        String apellido3 = leer.next();
        persona3.setApellido(apellido3);
        System.out.println("Ingrese la direccion de la persona 3");
        String direccion3 = leer.next();
        persona3.setDireccion(direccion3);

        Persona persona4 =new Persona();
        System.out.println("***************Persona 4*******************");
        System.out.println("Ingrese el Nombre de la Persona 4");
        String nombre4 = leer.next();
        persona4.setNombre(nombre4);
        System.out.println("Ingrese el Apellido de la Persona 4");
        String apellido4 = leer.next();
        persona4.setApellido(apellido4);
        System.out.println("Ingrese la Direccion de la Persona 4");
        String direccion4 = leer.next();
        persona4.setDireccion(direccion4);

        Persona persona5 =new Persona();
        System.out.println("***************Persona 5*******************");
        System.out.println("Ingrese el Nombre de la Persona 5");
        String nombre5 = leer.next();
        persona5.setNombre(nombre5);
        System.out.println("Ingrese el Apellido de la Persona 5");
        String apellido5 = leer.next();
        persona5.setApellido(apellido5);
        System.out.println("Ingrese la Direccion de la Persona 5");
        String direccion5 = leer.next();
        persona5.setDireccion(direccion5);

        Persona persona6 =new Persona();
        System.out.println("***************Persona 6*******************");
        System.out.println("Ingrese el Nombre de la Persona 6");
        String nombre6 = leer.next();
        persona6.setNombre(nombre6);
        System.out.println("Ingrese el Apellido de la Persona 6");
        String apellido6 = leer.next();
        persona6.setApellido(apellido6);
        System.out.println("Ingrese la Direccion de la Persona 6");
        String direccion6 = leer.next();
        persona6.setDireccion(direccion6);

        Persona persona7 =new Persona();
        System.out.println("***************Persona 7*******************");
        System.out.println("Ingrese el Nombre de la Persona 7");
        String nombre7 = leer.next();
        persona7.setNombre(nombre7);
        System.out.println("Ingrese el Apellido de la Persona 7");
        String apellido7 = leer.next();
        persona7.setApellido(apellido7);
        System.out.println("Ingrese la Direccion de la Persona 7");
        String direccion7 = leer.next();
        persona7.setDireccion(direccion7);

        Persona persona8 =new Persona();
        System.out.println("***************Persona 8*******************");
        System.out.println("Ingrese el Nombre de la Persona 8");
        String nombre8 = leer.next();
        persona8.setNombre(nombre8);
        System.out.println("Ingrese el Apellido de la Persona 8");
        String apellido8 = leer.next();
        persona8.setApellido(apellido8);
        System.out.println("Ingrese la Direccion de la Persona 8");
        String direccion8 = leer.next();
        persona8.setDireccion(direccion8);

        Persona persona9 =new Persona();
        System.out.println("***************Persona 9*******************");
        System.out.println("Ingrese el Nombre de la Persona 9");
        String nombre9 = leer.next();
        persona9.setNombre(nombre9);
        System.out.println("Ingrese el Apellido de la Persona 9");
        String apellido9 = leer.next();
        persona9.setApellido(apellido9);
        System.out.println("Ingrese la Direccion de la Persona 9");
        String direccion9 = leer.next();
        persona9.setDireccion(direccion9);

        Persona persona10 =new Persona();
        System.out.println("***************Persona 10******************");
        System.out.println("Ingrese el Nombre de la Persona 10");
        String nombre10 = leer.next();
        persona10.setNombre(nombre10);
        System.out.println("Ingrese el Apellido de la Persona 10");
        String apellido10 = leer.next();
        persona10.setApellido(apellido10);
        System.out.println("Ingrese la Direccion de la Persona 10");
        String direccion10 = leer.next();
        persona10.setDireccion(direccion10);


        System.out.println("***************************************************");
        System.out.println("Persona 1= Nombre: "+persona1.getNombre()+" Apellido: "+persona1.getApellido()+" Direccion: "+persona1.getDireccion());
        System.out.println("Persona 2= Nombre: "+persona2.getNombre()+" Apellido: "+persona2.getApellido()+" Direccion: "+persona2.getDireccion());
        System.out.println("Persona 3= Nombre: "+persona3.getNombre()+" Apellido: "+persona3.getApellido()+" Direccion: "+persona3.getDireccion());
        System.out.println("Persona 4= Nombre: "+persona4.getNombre()+" Apellido: "+persona4.getApellido()+" Direccion: "+persona4.getDireccion());
        System.out.println("Persona 5= Nombre: "+persona5.getNombre()+" Apellido: "+persona5.getApellido()+" Direccion: "+persona5.getDireccion());
        System.out.println("Persona 6= Nombre: "+persona6.getNombre()+" Apellido: "+persona6.getApellido()+" Direccion: "+persona6.getDireccion());
        System.out.println("Persona 7= Nombre: "+persona7.getNombre()+" Apellido: "+persona7.getApellido()+" Direccion: "+persona7.getDireccion());
        System.out.println("Persona 8= Nombre: "+persona8.getNombre()+" Apellido: "+persona8.getApellido()+" Direccion: "+persona8.getDireccion());
        System.out.println("Persona 9= Nombre: "+persona9.getNombre()+" Apellido: "+persona9.getApellido()+" Direccion: "+persona9.getDireccion());
        System.out.println("Persona 10= Nombre: "+persona10.getNombre()+" Apellido: "+persona10.getApellido()+" Direccion: "+persona10.getDireccion());*/

        /*int num1=2;
        int num2=3;
        int suma=0;*/
        /*Persona persona= new Persona("01010101");

        System.out.println(persona.getCedula());*/


        /*int res = persona.suma(num1,num2);
        System.out.println(res);*/



       /* Persona [] personas =new Persona[numeroDePersona];
        for (int i=0 ; i < numeroDePersona;i++){
            Persona persona = new Persona();
            System.out.println("Ingrese el Numero de cedula de la persona "+(i+1));
            String cedula = leer.next();
            persona.setCedula(cedula);
            System.out.println("Ingrese el Nombre de la persona "+(i+1));
            String nombre = leer.next();
            persona.setNombre(nombre);
            System.out.println("Ingrese el apellido de la persona "+(i+1));
            String apellido = leer.next();
            persona.setApellido(apellido);
            System.out.println("Ingrese la direccion de la persona 1"+(i+1));
            String direccion = leer.next();
            persona.setDireccion(direccion);

            personas [i]=persona;


        }

        for (int i =0; i<numeroDePersona;i++){
            System.out.println(personas[i].getCedula());
            System.out.println(personas[i].getNombre());
            System.out.println(personas[i].getApellido());
            System.out.println(personas[i].getDireccion());
        }*/

    }
}
