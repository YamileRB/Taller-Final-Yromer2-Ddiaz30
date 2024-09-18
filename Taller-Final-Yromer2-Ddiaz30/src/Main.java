
import Datalle.Detalles;

import java.util.Scanner;
import java.lang.*;


class Formulario {
    public static void main(String[] args) {
        Scanner scanneroption = new Scanner(System.in);
        int eleccion;
        do {
            menu(); //se hace llamado al menu
            eleccion = scanneroption.nextInt();
            scanneroption.nextLine(); // Captura el salto de línea restante
            switch (eleccion) {
                case 1:
                    Detalles.detalleCasoUno();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 2:
                    Detalles.detalleCasoDos();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 3:
                    Detalles.detalleCasoTres();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 4:
                    Detalles.detalleCasoCuatro();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 5:
                    Detalles.detalleCasoCinco();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 6:
                    Detalles.detalleCasoSeis();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 7:
                    Detalles.detalleCasoSiete();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 8:
                    Detalles.detalleCasoocho();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 9:
                    Detalles.detalleCasoNueve();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 10:
                    Detalles.detalleCasoDiez();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 11:
                    Detalles.detalleCasoOnce();
                    esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
            }
        } while (eleccion != 0);

    }

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
