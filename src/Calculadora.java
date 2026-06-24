public class Calculadora {
int dato1;
int dato2;

//constructor

    public Calculadora (int dato1, int dato2){
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

//metodos

public int sumar () {
        int resuldadoSum = dato1 + dato2;
        return  resuldadoSum;
}

public int resta () {
        int resultadoRes = dato1 - dato2;
        return resultadoRes;
}

public int multiplicar () {
        int resultadoMul = dato1 * dato2;
        return resultadoMul;
}

public int dividir () {

    if (dato2 == 0){ System.out.println("Error no se puede divider entre 0");
    return 0;}

    int resultadoDiv = dato1 / dato2;

    return resultadoDiv;

    }

}
