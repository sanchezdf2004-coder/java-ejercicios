public class Ejercicio6 {
public static void main (String []args) {

    Calculadora calculadora = new Calculadora(5,0);
    calculadora.sumar();
    calculadora.resta();
    calculadora.multiplicar();
    calculadora.dividir();
    System.out.println(calculadora.sumar());
    System.out.println(calculadora.resta());
    System.out.println(calculadora.multiplicar());
    System.out.println(calculadora.dividir());
}

}
