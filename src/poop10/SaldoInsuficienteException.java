/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package poop10;

/**
 * La excepción {@code SaldoInsuficienteException} se lanza cuando se intenta realizar
 * un retiro en una cuenta bancaria y el monto solicitado excede el saldo disponible.
 * <p>Esta es una excepción personalizada que extiende la clase {@code Exception}.</p>
 * 
 * @version 1.0
 */
public class SaldoInsuficienteException extends Exception {
    
    /**
     * Constructor sin parámetros que crea una excepción {@code SaldoInsuficienteException} 
     * sin mensaje de detalle.
     */
    public SaldoInsuficienteException() {
        super();
    }

    /**
     * Constructor que permite especificar un mensaje de detalle para la excepción.
     * @param msg el mensaje de detalle que describe la causa de la excepción.
     */
    public SaldoInsuficienteException(String msg) {  
        super(msg); 
    }
}
