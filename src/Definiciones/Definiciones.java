package Definiciones;

public class Definiciones {

    public static void definicionString() {
        System.out.println("Seleccionaste String ");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("En Java, los String son un objeto el cual nos permite almacenar muchos caracteres.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("String s = '¿Qué' + 'tal' ?");
    }

    public static void definicionConstante() {
        System.out.println("Seleccionaste Constantes ");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("En Java, una constante es un valor que no cambia durante la ejecución del programa");
        System.out.println("Las constantes se utilizan para representar valores fijos y de lectura única,");
        System.out.println("lo que ayuda a que el código sea más legible y menos propenso a errores. ");
        System.out.println("Las constantes en Java se declaran usando la palabra clave final.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("public static final int TIEMPO_ESPERA_CONEXION=30");

    }

    public static void definicionSwitch() {
        System.out.println("Seleccionaste Switch ");
        System.out.println("===================================================================================");
        System.out.println("Definicion:");
        System.out.println("Los condicionales Switch, son una estructura de control condicional, que permite \ndefinir múltiples casos que puede llegar a cumplir una variable cualquiera, \ny qué acción tomar en cualquiera de estas situaciones, incluso es posible determinar \nqué acción llevar a cabo en caso de no cumplir ninguna de las condiciones dadas..");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("switch (expresion) {");
        System.out.println("case valor1:// Código a ejecutar si expresion es igual a valor1, break;");
        System.out.println("case valor2:// Código a ejecutar si expresion es igual a valor2, break;");
        System.out.println("default: // Código a ejecutar si expresion no coincide con ningún caso, break;");
        System.out.println("====================================================================================");

    }

    public static void definicionTernaria() {
        System.out.println("Seleccionaste Ternaria ");
        System.out.println("===================================================================================");
        System.out.println("Definicion:");
        System.out.println("Un operador ternario es un operador condicional en JavaScript que evalúa una \nexpresión condicional y devuelve un valor verdadero o falso.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("int edad = 20");
        System.out.println("string mensaje = (edad >= 18) ? \"Eres mayor de edad\" : \"Eres menor de edad\"");
        System.out.println("Console.WriteLine(mensaje);");

    }

    public static void definicionBucleDowhile() {
        System.out.println("Seleccionaste Bucle DO WHILE ");
        System.out.println("===================================================================================");
        System.out.println("Definicion:");
        System.out.println("El bucle do-while es una estructura de control en programación que permite ejecutar \nun bloque de código al menos una vez y luego repetir la ejecución mientras se cumpla \nuna condición específica");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("do { cout << i << endl; i++");
        System.out.println("} while (i <= 5)");
        System.out.println("return 0;");
        System.out.println("====================================================================================");
    }

    public static void definicionWhile() {
        System.out.println("Seleccionaste WHILE ");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("Un bucle while es una estructura de control en programación que permite repetir un \nbloque de código mientras una condición específica sea verdadera.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("contador = 0");
        System.out.println("while contador < 5:");
        System.out.println("print(\"El contador es:\", contador)");
        System.out.println("contador += 1");
        System.out.println("====================================================================================");

    }

    public static void definicionFor() {
        System.out.println("Seleccionaste FOR");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("Los bucles for son muy útiles para tareas repetitivas como recorrer listas, generar \nsecuencias de números, y realizar operaciones en cada elemento de una colección.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("for (let i = 0; i < 5; i++) {");
        System.out.println("console.log(i);}");

    }

    public static void definicionForEach() {
        System.out.println("Seleccionaste FOR EACH");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("El bucle for-each es una estructura de control en programación que se utiliza para \nrecorrer todos los elementos de una colección, como un array o una lista, \nde manera simplificada.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("$numeros = array(1, 2, 3, 4, 5);");
        System.out.println("foreach ($numeros as $numero){");
        System.out.println("echo $numero;}");

    }

}

