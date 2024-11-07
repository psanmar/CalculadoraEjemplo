package calculadoraejemplo;

/**
 * Clase CalculadoraEjemplo que implementa operaciones básicas como suma,
 * resta, multiplicación y división.
 * 
 * @author SANCHEZ_MILSIM
 * @version 1.0
 * @since 1.0
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 
 //////
 
 
 
 */
public class CalculadoraEjemplo {
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor de la clase CalculadoraEjemplo.
     * 
     * @param operando1 Primer operando para las operaciones.
     * @param operando2 Segundo operando para las operaciones.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Método para realizar la suma de los operandos.
     * 
     * @return El resultado de la suma.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Método para realizar la resta de los operandos.
     * 
     * @return El resultado de la resta.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Método para realizar la multiplicación de los operandos.
     * 
     * @return El resultado de la multiplicación.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Método para realizar la división de los operandos.
     * 
     * @return El resultado de la división, o 0 si el segundo operando es cero.
     */
    public double dividir() {
        if (operando2 != 0) {
            resultado = operando1 / operando2;
        } else {
            System.out.println("Error: División por cero.");
            resultado = 0;
        }
        return resultado;
    }

    /**
     * Obtiene el primer operando.
     * 
     * @return El valor de operando1.
     */
    public double getOperando1() {
        return operando1;
    }

    /**
     * Obtiene el segundo operando.
     * 
     * @return El valor de operando2.
     */
    public double getOperando2() {
        return operando2;
    }

    /**
     * Establece el primer operando.
     * 
     * @param operando1 El valor a asignar a operando1.
     */
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    /**
     * Establece el segundo operando.
     * 
     * @param operando2 El valor a asignar a operando2.
     */
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
}