package Formularios;

import java.util.Scanner;

public class FormularioSubmenu {
    public static void subMenu(Scanner scanner) {
        int subOpcion;
        do {
            System.out.println("Seleccionaste Datos Primitivos ");
            System.out.println("1.Byte 1.1");
            System.out.println("2.Short 1.2");
            System.out.println("3.Int 1.3");
            System.out.println("4.long 1.4");
            System.out.println("5.float 1.5");
            System.out.println("6.Double 1.6");
            System.out.println("7.Boolean 1.7");
            System.out.println("8.Char 1.8");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.println("Has seleccionado Byte 1.1");
                    System.out.println("Byte: Tipo de dato de 8 bits con signo. Rango: -128 a 127");
                    System.out.println("Ejemplo byte edad = 25");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                case 2:
                    System.out.println("Has seleccionado Short 1.2");
                    System.out.println("Short: Tipo de dato de 16 bits con signo. Rango: -32,768 a 32,767.");
                    System.out.println("Ejemplo short salario = 15000");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                case 3:
                    System.out.println("Has seleccionado Int 1.3");
                    System.out.println("Int: Tipo de dato de 32 bits con signo.Rango: -2^31 a 2^31-1");
                    System.out.println("Ejemplo int poblacion = 1000000");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                case 4:
                    System.out.println("Has seleccionado Long 1.4");
                    System.out.println("long: Tipo de dato de 64 bits con signo. Rango: -2^63 a 2^63-1.");
                    System.out.println("Ejemplo long distancia = 123456789L");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                case 5:
                    System.out.println("Has seleccionado Float 1.5");
                    System.out.println("float: Tipo de dato para números en coma flotante de precisión simple (32 bits).Rango: \nAproximadamente ±3.40282347E+38F (6-7 dígitos decimales).");
                    System.out.println("Ejemplo float precio = 19.99f");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                case 6:
                    System.out.println("Has seleccionado Double 1.6");
                    System.out.println("Double: Tipo de dato para números en coma flotante de doble precisión (64 bits).Rango: \nAproximadamente ±1.79769313486231570E+308 (15 dígitos decimales).");
                    System.out.println("Ejemplo double pi = 3.141592653589793;");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                case 7:
                    System.out.println("Has seleccionado Boolean 1.7");
                    System.out.println("Boolean: Tipo de dato de 8 bits con signo. Rango: -128 a 127");
                    System.out.println("Ejemplo boolean esJavaDivertido = true");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                case 8:
                    System.out.println("Has seleccionado Char 1.8");
                    System.out.println("Char: Tipo de dato para un solo carácter Unicode (16 bits).Rango: ‘\u0000’ a ‘\uffff’");
                    System.out.println("Ejemplo char inicial = 'A'");
                    FormularioSubmenu.esperarEnter(scanner);
                    break;

                default:break;

            }
        } while (subOpcion != 9);

    }

    public static void esperarEnter(Scanner scanner) { //metodo para hacer la espera y mostra el menu
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Espera a que el usuario presione Enter
    }

}