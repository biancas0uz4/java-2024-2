public class ExemploOperadores {
    public static void main(String[] args) {
        //Operadores
         // + soma
         // - sub
         // / div
         // * multi
         // ** potencia, no java usamos o método de uma classe

        Double numero01 = 42.0;
        Double numero02 = 10.0;

        System.out.println("Soma " + (numero01 + numero02));
        System.out.println("Multiplicação " + (numero01 * numero02));
        System.out.println("Divisão " + (numero01 / numero02));
        System.out.println("Subtração " + (numero01 * numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado Potência: " + resultadoPotencia);
    }
}
