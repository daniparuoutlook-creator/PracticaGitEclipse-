package edd;

public class Practica {

    public static void main(String[] args) {
        System.out.println("Práctica de integración de Eclipse con GitHub");

        Calculadora calc = new Calculadora();
        int a = 12;
        int b = 4;

        System.out.println(a + " + " + b + " = " + calc.sumar(a, b));
        System.out.println(a + " - " + b + " = " + calc.restar(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiplicar(a, b));
        System.out.println(a + " / " + b + " = " + calc.dividir(a, b));
    }
}