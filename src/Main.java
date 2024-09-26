
import Datalle.Detalles;
import Menu.MenuPrincipal;

import java.util.Scanner;
import java.lang.*;


class Formulario {
    public static void main(String[] args) {
        Scanner scanneroption = new Scanner(System.in);
        int eleccion;
        do {
            MenuPrincipal.menu(); //se hace llamado al menu
            eleccion = scanneroption.nextInt();
            scanneroption.nextLine(); // Captura el salto de línea restante
            switch (eleccion) {
                case 1:
                    Detalles.detalleCasoUno();
                    MenuPrincipal.esperarEnter(scanneroption);
                    break;
                case 2:
                    Detalles.detalleCasoDos();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 3:
                    Detalles.detalleCasoTres();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 4:
                    Detalles.detalleCasoCuatro();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 5:
                    Detalles.detalleCasoCinco();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 6:
                    Detalles.detalleCasoSeis();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 7:
                    Detalles.detalleCasoSiete();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 8:
                    Detalles.detalleCasoocho();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 9:
                    Detalles.detalleCasoNueve();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 10:
                    Detalles.detalleCasoDiez();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 11:
                    Detalles.detalleCasoOnce();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
            }
        } while (eleccion != 0);

    }

}
