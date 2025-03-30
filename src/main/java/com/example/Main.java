package com.example;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setTitular("Juan Pérez");
        cuenta1.depositar(100.0);

        CuentaBancaria cuenta2 = new CuentaBancaria("12345", 500.0, "María López");
        cuenta2.depositar(200.0);

    
        System.out.println("Cuenta 1: " + cuenta1.getNumeroCuenta() + ", " + 
                          cuenta1.getTitular() + ", Saldo: " + cuenta1.getSaldo());
        System.out.println("Cuenta 2: " + cuenta2.getNumeroCuenta() + ", " + 
                          cuenta2.getTitular() + ", Saldo: " + cuenta2.getSaldo());
    }
}