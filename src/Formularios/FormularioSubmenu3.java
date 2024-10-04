package Formularios;

import java.util.Scanner;

public class FormularioSubmenu3 {
    public static void subMenu3(Scanner scanner) {
        int subOpcion;
        do {
            System.out.println("Condicional IF, ELSE, IF ELSE ");
            System.out.println("1.Condicional IF 3.1");
            System.out.println("2.Condicional  ELSE 3.2");
            System.out.println("3.Condicional IF ELSE 3.3");
            System.out.println("4. Ejemplo 3.4");

            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.println("Seleccionaste Condicional IF 3.1");
                    System.out.println("Definicion:");
                    System.out.println("La sentencia if evalúa una condición. Si la condición es verdadera, se ejecuta el \nbloque de código dentro del if.");
                    FormularioSubmenu3.esperarEnter(scanner);
                    break;

                case 2:
                    System.out.println("Seleccionaste Condicional  ELSE 3.2");
                    System.out.println("Definicion:");
                    System.out.println("La sentencia else se ejecuta si todas las condiciones anteriores (if y else if) son \nfalsas.");
                    FormularioSubmenu3.esperarEnter(scanner);
                    break;

                case 3:
                    System.out.println("Seleccionaste Condicional IF ELSE 3.3");
                    System.out.println("Definicion:");
                    System.out.println("La sentencia else if se utiliza para evaluar múltiples condiciones. Si la primera \ncondición if es falsa, se evalúa la condición else if.");
                    FormularioSubmenu3.esperarEnter(scanner);
                    break;

                case 4:
                    System.out.println("Seleccionaste Ejemplo");
                    System.out.print("Por favor, ingresa tu edad: ");
                    int edad = scanner.nextInt();

                    if (edad < 0) {
                        System.out.println("Edad no válida.");
                    } else if (edad < 13) {
                        System.out.println("Eres un niño.");
                    } else if (edad < 18) {
                        System.out.println("Eres un adolescente.");
                    } else if (edad < 65) {
                        System.out.println("Eres un adulto.");
                    } else {
                        System.out.println("Eres un anciano.");
                    }

                    FormularioSubmenu3.esperarEnter(scanner);
                    break;

                default:break;


            }
        } while (subOpcion != 5);

    }

    public static void esperarEnter(Scanner scanner) { //metodo para hacer la espera y mostra el menu
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Espera a que el usuario presione Enter
    }

}



