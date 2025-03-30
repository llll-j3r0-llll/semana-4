package com.example;

class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria() {
        numeroCuenta = "0000";
        saldo = 0.0;
        titular = "Sin titular";
    }

    public CuentaBancaria(String num, double sal, String tit) {
        numeroCuenta = num;
        if (sal >= 0) {
            saldo = sal;
        } else {
            saldo = 0.0;
        }
        if (tit != null && !tit.isEmpty()) {
            titular = tit;
        } else {
            titular = "Sin titular";
        }
    }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }


    public void setNumeroCuenta(String num) {
        numeroCuenta = num;
    }

    public void setSaldo(double sal) {
        if (sal >= 0) {
            saldo = sal;
        }
    }

    public void setTitular(String tit) {
        if (tit != null && !tit.isEmpty()) {
            titular = tit;
        }
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }
}