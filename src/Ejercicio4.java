public class Ejercicio4 {

public static void main (String [] args){
    String saludo = saludar ("levia");

    int total = sumar (5,5);
    System.out.println("hola mundo, soy: " + saludo);
    System.out.println(total);
}

    public static String saludar (String nombre) {
    return nombre;
    }

    public static int sumar (int a, int b) {
    int resultadoSum = a + b;
    return resultadoSum;
    }

}
