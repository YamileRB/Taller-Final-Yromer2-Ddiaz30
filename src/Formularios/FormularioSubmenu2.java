package Formularios;

import java.util.Scanner;

public class FormularioSubmenu2 {
    public static void subMenu2(Scanner scanner) {
        int subOpcion;
        do {
            System.out.println("Seleccionaste Tipo de Operadores ");
            System.out.println("1.Aritmeticos 2.1");
            System.out.println("2.Relacionales 2.2");
            System.out.println("3.Logicos 2.3");
            System.out.println("4.Asignacion 2.4");
            System.out.println("5.Incremento/Decremento 2.5");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.println("Seleccionaste Aritmeticos");
                    System.out.println("Definicion:");
                    System.out.println("Estos operadores se utilizan para realizar operaciones matemáticas básicas");
                    System.out.println("Ejemplos:");
                    System.out.println("Suma (+):a+b");
                    System.out.println("Resta (-):a-b");
                    System.out.println("Multiplicacion (*):a*b");
                    System.out.println("Division (/):a/4b");
                    FormularioSubmenu2.esperarEnter(scanner);
                    break;

                case 2:
                    System.out.println("Seleccionaste Relacionales");
                    System.out.println("Definicion:");
                    System.out.println("Los operadores relacionales se utilizan en programación para comparar dos valores \ny devolver un resultado booleano (verdadero o falso).");
                    System.out.println("Ejemplos:");
                    System.out.println("Igual a (==):resultado = (a == b)  # resultado es True");
                    System.out.println("Diferente de (!=):resultado = (a != b)  # resultado es True");
                    System.out.println("Mayor que (>):resultado = (a > b)  # resultado es True");
                    System.out.println("Menor que (<):resultado = (a < b)  # resultado es False");
                    System.out.println("Mayor o igual que (>=):resultado = (a >= b)  # resultado es True");
                    System.out.println("Menor o igual que (<=):resultado = (a <= b)  # resultado es True");
                    FormularioSubmenu2.esperarEnter(scanner);
                    break;

                case 3:
                    System.out.println("Seleccionaste Logicos");
                    System.out.println("Definicion:");
                    System.out.println("Estos operadores se utilizan para combinar expresiones booleanas:");
                    System.out.println("Ejemplos:");
                    System.out.println("AND (&&): $$a && b");
                    FormularioSubmenu2.esperarEnter(scanner);
                    break;

                case 4:
                    System.out.println("Seleccionaste Asignacion");
                    System.out.println("Definicion:");
                    System.out.println("Estos operadores se utilizan para asignar valores a variables");
                    System.out.println("Ejemplos:");
                    System.out.println("Asignación simple (=): x = 5");
                    System.out.println("Asignación con suma (+=): x += 3  # Equivalente a x = x + 3");
                    System.out.println("Asignación con resta (-=): x -= 2  # Equivalente a x = x - 2");
                    System.out.println("Asignación con multiplicación (*=): x *= 4  # Equivalente a x = x * 4");
                    System.out.println("Asignación con división (/=): x /= 2  # Equivalente a x = x / 2");
                    System.out.println("Asignación con módulo (%=): x %= 3  # Equivalente a x = x % 3");
                    FormularioSubmenu2.esperarEnter(scanner);
                    break;

                case 5:
                    System.out.println("Seleccionaste Incremento/Decremento");
                    System.out.println("Definicion:");
                    System.out.println("Estos operadores se utilizan para aumentar o disminuir el valor de una variable en uno:");
                    System.out.println("Ejemplos:");
                    System.out.println("incremento (++variable):b = ++a");
                    System.out.println("decremento (–variable): b = --a");
                    FormularioSubmenu2.esperarEnter(scanner);
                    break;

                default:break;

            }
        } while (subOpcion != 6);

    }

    public static void esperarEnter(Scanner scanner) { //metodo para hacer la espera y mostra el menu
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Espera a que el usuario presione Enter
    }

}

