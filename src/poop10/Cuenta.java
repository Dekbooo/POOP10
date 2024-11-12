/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * La clase {@code Cuenta} representa una cuenta bancaria básica que permite 
 * consultar, depositar y retirar dinero del saldo disponible.
 * <p>Incluye validación para evitar retiros superiores al saldo mediante la 
 * excepción personalizada {@code SaldoInsuficienteException}.</p>
 * 
 * @version 1.0
 */
public class Cuenta {
    private double saldo;

    /**
     * Constructor sin parámetros que inicializa la cuenta con saldo cero.
     */
    public Cuenta() {
    }

    /**
     * Constructor que inicializa la cuenta con un saldo específico.
     * @param saldo el saldo inicial de la cuenta.
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return el saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo en la cuenta.
     * @param saldo el saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Aumenta el saldo de la cuenta con el monto especificado.
     * @param monto el monto a depositar en la cuenta.
     */
    public void depositar(double monto) {
        saldo += monto;
    }

    /**
     * Disminuye el saldo de la cuenta según el monto especificado si hay suficiente saldo.
     * @param monto el monto a retirar de la cuenta.
     * @throws SaldoInsuficienteException si el monto a retirar excede el saldo disponible.
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No tienes ese dinero");
        } else {
            saldo -= monto;
        }
    }

    /**
     * Consulta el saldo actual de la cuenta.
     * @return el saldo disponible en la cuenta.
     */
    public double consultarSaldo() {
        return getSaldo();
    }

    /**
     * Representación en texto de la cuenta mostrando el saldo actual.
     * @return una cadena de texto con el saldo de la cuenta.
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
