import java.util.Scanner;

public class Ejemplo {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("Menú de Definiciones:");
                System.out.println("1. Definición de Clase");
                System.out.println("2. Definición de Objeto");
                System.out.println("3. Definición de Herencia");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Clase: Una clase es un plano o plantilla que define las variables y métodos comunes a todos los objetos de cierto tipo.");
                        break;
                    case 2:
                        System.out.println("Objeto: Un objeto es una instancia de una clase. Es una entidad que tiene estado y comportamiento.");
                        break;
                    case 3:
                        System.out.println("Herencia: La herencia es un mecanismo en el que una clase adquiere las propiedades y comportamientos de otra clase.");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
                System.out.println();
            } while (opcion != 4);

            scanner.close();
        }
    }

