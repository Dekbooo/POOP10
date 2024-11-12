/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * La clase {@code POOP10} demuestra el manejo de excepciones en Java mediante 
 * ejemplos de aritmética, control de límites de arreglos, y excepciones personalizadas.
 * <p>Esta clase contiene métodos para realizar divisiones, manejar excepciones, 
 * y operar con objetos de la clase {@code Cuenta}.</p>
 * 
 * @author poo03alu09
 * @version 1.0
 */
public class POOP10 {
    
    /**
     * Método principal de ejecución.
     * @param args los argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.out.println("hola mundo");

        // Ejemplo de conversión y operación aritmética
        int a = 5;
        float c = (float) a / 2;
        System.out.println(c);

        // Inicialización y llenado de un arreglo
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = i * 10;
        }

        // Manejo de excepción por desbordamiento de índices
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion de desbordamiento de memoria");
        }

        System.out.println("Hola he sobrevivido");

        // Manejo de excepción aritmética
        try {
            float d = 4 / 0;
            System.out.println(d);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion de desbordamiento de memoria");
        } catch (ArithmeticException ex) {
            System.out.println("Excepcion aritmetica permeada Catch");
        }

        // Ejecución de un método que puede lanzar una excepción aritmética
        float n = miMetodoDivision(100, 2);
        System.out.println(n);

        // Manejo de excepción aritmética en el método miMetodoDivision
        try {
            float m = miMetodoDivision(100, 0);
            System.out.println(m);
        } catch (ArithmeticException ex) {
            System.out.println("Excepcion aritmetica segundo Catch");
            System.out.println(ex.getStackTrace());
            ex.printStackTrace();
        }

        System.out.println("a pesar de todo seguimos en el programa");

        float x = miMetodoDivision(20, 5);
        System.out.println(x);

        // Uso de excepción de operación no soportada
        try {
            int w = suma(4, 7);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Excepcion de operacion no soportada");
            System.out.println("Atributo Mensaje");
            System.out.println(ex.getMessage());
        }

        System.out.println("··················");

        // Operaciones con la clase Cuenta y manejo de excepciones personalizadas
        Cuenta cuenta = new Cuenta(100f);
        System.out.println(cuenta.consultarSaldo());
        cuenta.depositar(100);
        System.out.println(cuenta.consultarSaldo());
        try {
            cuenta.retirar(300);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(cuenta.consultarSaldo());
    }

    /**
     * Método que realiza la división entre dos enteros.
     * @param f el dividendo.
     * @param f0 el divisor.
     * @return el resultado de la división de {@code f} entre {@code f0}.
     * @throws ArithmeticException si {@code f0} es cero.
     */
    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f / f0;
    }

    /**
     * Método que simula una operación de suma que lanza una excepción de 
     * operación no soportada.
     * @param i primer operando.
     * @param i0 segundo operando.
     * @throws UnsupportedOperationException siempre lanza esta excepción.
     */
    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operacion no soportada");
    }
}
