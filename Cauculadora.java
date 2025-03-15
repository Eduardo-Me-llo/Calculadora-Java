/**
 * Pacote que contém as classes responsáveis pela exibição e interação.
 */
package view;

/**
 * Classe Calculadora que fornece operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois valores.
     * @param valor1 Primeiro valor
     * @param valor2 Segundo valor
     * @return Resultado da soma
     */
    public double somar(final double valor1, final double valor2) {
        return valor1 + valor2;
    }
    /**
     * Subtrai o segundo valor do primeiro.
     * @param valor1 Primeiro valor
     * @param valor2 Segundo valor
     * @return Resultado da subtração
     */
    public double subtrair(final double valor1, final double valor2) {
        return valor1 - valor2;
    }
    /**
     * Multiplica dois valores.
     * @param valor1 Primeiro valor
     * @param valor2 Segundo valor
     * @return Resultado da multiplicação
     */
    public double multiplicar(final double valor1, final double valor2) {
        return valor1 * valor2;
    }

    /**
     * Divide o primeiro valor pelo segundo.
     * @param valor1 Primeiro valor
     * @param valor2 Segundo valor
     * @return Resultado da divisão
     * @throws ArithmeticException se valor2 for zero
     */
    public double dividir(final double valor1, final double valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return valor1 / valor2;
    }
}
