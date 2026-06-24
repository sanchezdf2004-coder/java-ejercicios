public class Persona {
//atributos
    String nombre;
    int edad;

    //constructor
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse () {
        System.out.println("Hola soy " + nombre + " de edad " + edad);

    }

}
