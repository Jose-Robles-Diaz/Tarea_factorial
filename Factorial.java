public class Factorial{

public static long factorial(int numero) {
    if (numero < 0) {
        throw new IllegalArgumentException(
            "El número debe ser positivo."
        );
    }

    long resultado = 1;

    for (int i = 1; i <= numero; i++) {
        resultado *= i;
    }

    return resultado;
}
}