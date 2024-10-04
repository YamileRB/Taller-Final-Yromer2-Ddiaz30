package Formularios;

import Definiciones.Definiciones;
import MenuPrincipal.MenuPrincipal;

import java.util.Scanner;


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
                    FormularioSubmenu.subMenu(scanneroption);
                    MenuPrincipal.esperarEnter(scanneroption);
                    break;
                case 2:
                    Definiciones.definicionString();
                    MenuPrincipal.esperarEnter(scanneroption);
                    break;
                case 3:
                    Definiciones.definicionConstante();
                    MenuPrincipal.esperarEnter(scanneroption);
                    break;
                case 4:
                    FormularioSubmenu2.subMenu2(scanneroption);
                    MenuPrincipal.esperarEnter(scanneroption);
                    break;
                case 5:
                    FormularioSubmenu3.subMenu3(scanneroption);
                    MenuPrincipal.esperarEnter(scanneroption);
                    break;

                case 6:
                    Definiciones.definicionSwitch();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 7:
                    Definiciones.definicionTernaria();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 8:
                    Definiciones.definicionBucleDowhile();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 9:
                    Definiciones.definicionWhile();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 10:
                    Definiciones.definicionFor();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;
                case 11:
                    Definiciones.definicionForEach();
                    MenuPrincipal.esperarEnter(scanneroption);//espera que se de enter para continuar
                    break;

                default:break;

            }
        } while (eleccion != 0);

    }

}
