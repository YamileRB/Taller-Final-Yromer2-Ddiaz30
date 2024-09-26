package Menu;

import java.util.Scanner;

public class MenuPrincipal {
    public static void menu() {
        System.out.println("===========================");
        System.out.println("NUESTRO MENU");
        System.out.println("===========================");
        System.out.println("1- Datos_Primitivos");
        System.out.println("2- String");
        System.out.println("3- Constantes");
        System.out.println("4- Tipo de Operadores");
        System.out.println("5. Condicional IF, ELSE, IF ELSE");
        System.out.println("6. Switch");
        System.out.println("7. Ternaria");
        System.out.println("8. Bucle DO WHILE");
        System.out.println("9. Bucle WHILE");
        System.out.println("10. Bucle FOR");
        System.out.println("11. FOR EACH");
        System.out.println("0.Selecciona una opcion digitando el numero: ");

    }
    public static void esperarEnter(Scanner scanner) { //metodo para hacer la espera y mostra el menu
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Espera a que el usuario presione Enter
    }

}
