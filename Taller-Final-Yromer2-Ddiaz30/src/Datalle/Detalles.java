package Datalle;

public class Detalles {
    public static void detalleCasoUno(){
        System.out.println("Seleccionaste Datos Primitivos ");
        System.out.println("====================================================================================");
        System.out.println("Byte: Tipo de dato de 8 bits con signo. Rango: -128 a 127");
        System.out.println("Ejemplo byte edad = 25");
        System.out.println("====================================================================================");
        System.out.println("Short: Tipo de dato de 16 bits con signo. Rango: -32,768 a 32,767.");
        System.out.println("Ejemplo short salario = 15000");
        System.out.println("====================================================================================");
        System.out.println("Int: Tipo de dato de 32 bits con signo.Rango: -2^31 a 2^31-1");
        System.out.println("Ejemplo int poblacion = 1000000");
        System.out.println("====================================================================================");
        System.out.println("long: Tipo de dato de 64 bits con signo. Rango: -2^63 a 2^63-1.");
        System.out.println("Ejemplo long distancia = 123456789L");
        System.out.println("====================================================================================");
        System.out.println("float: Tipo de dato para números en coma flotante de precisión simple (32 bits).Rango: \nAproximadamente ±3.40282347E+38F (6-7 dígitos decimales).");
        System.out.println("Ejemplo float precio = 19.99f");
        System.out.println("====================================================================================");
        System.out.println("Double: Tipo de dato para números en coma flotante de doble precisión (64 bits).Rango: \nAproximadamente ±1.79769313486231570E+308 (15 dígitos decimales).");
        System.out.println("Ejemplo double pi = 3.141592653589793;");
        System.out.println("====================================================================================");
        System.out.println("Boolean: Tipo de dato de 8 bits con signo. Rango: -128 a 127");
        System.out.println("Ejemplo boolean esJavaDivertido = true");
        System.out.println("====================================================================================");
        System.out.println("Char: Tipo de dato para un solo carácter Unicode (16 bits).Rango: ‘\u0000’ a ‘\uffff’");
        System.out.println("Ejemplo char inicial = 'A'");
        System.out.println("====================================================================================");
    }

    public static void detalleCasoDos(){
        System.out.println("Seleccionaste String ");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("En Java, los String son un objeto el cual nos permite almacenar muchos caracteres.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("String s = '¿Qué' + 'tal' ?");
    }

    public static void detalleCasoTres(){
        System.out.println("Seleccionaste Constantes ");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("En Java, una constante es un valor que no cambia durante la ejecución del programa");
        System.out.println("Las constantes se utilizan para representar valores fijos y de lectura única,");
        System.out.println ("lo que ayuda a que el código sea más legible y menos propenso a errores. ");
        System.out.println ("Las constantes en Java se declaran usando la palabra clave final.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("public static final int TIEMPO_ESPERA_CONEXION=30");
    }

    public static void detalleCasoCuatro(){
        System.out.println("Seleccionaste Tipo de Operadores ");
        System.out.println("====================================================================================");
        System.out.println("Aritmeticos");
        System.out.println("====================================================================================");
        System.out.println("Definicion:");
        System.out.println("Estos operadores se utilizan para realizar operaciones matemáticas básicas");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("Suma (+):a+b");
        System.out.println("Resta (-):a-b");
        System.out.println("Multiplicacion (*):a*b");
        System.out.println("Division (/):a/4b");
        System.out.println("====================================================================================");
        System.out.println("Relacionales");
        System.out.println("====================================================================================");
        System.out.println("Definicion:");
        System.out.println("Los operadores relacionales se utilizan en programación para comparar dos valores \ny devolver un resultado booleano (verdadero o falso).");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("Igual a (==):resultado = (a == b)  # resultado es True");
        System.out.println("Diferente de (!=):resultado = (a != b)  # resultado es True");
        System.out.println("Mayor que (>):resultado = (a > b)  # resultado es True");
        System.out.println("Menor que (<):resultado = (a < b)  # resultado es False");
        System.out.println("Mayor o igual que (>=):resultado = (a >= b)  # resultado es True");
        System.out.println("Menor o igual que (<=):resultado = (a <= b)  # resultado es True");
        System.out.println("====================================================================================");
        System.out.println("Logicos");
        System.out.println("====================================================================================");
        System.out.println("Definicion:");
        System.out.println("Estos operadores se utilizan para combinar expresiones booleanas:");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("AND (&&): $$a && b");
        System.out.println("====================================================================================");
        System.out.println("Asignacion");
        System.out.println("====================================================================================");
        System.out.println("Definicion:");
        System.out.println("Estos operadores se utilizan para asignar valores a variables");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("Asignación simple (=): x = 5");
        System.out.println("Asignación con suma (+=): x += 3  # Equivalente a x = x + 3");
        System.out.println("Asignación con resta (-=): x -= 2  # Equivalente a x = x - 2");
        System.out.println("Asignación con multiplicación (*=): x *= 4  # Equivalente a x = x * 4");
        System.out.println("Asignación con división (/=): x /= 2  # Equivalente a x = x / 2");
        System.out.println("Asignación con módulo (%=): x %= 3  # Equivalente a x = x % 3");
        System.out.println("====================================================================================");
        System.out.println("Incremento/Decremento");
        System.out.println("Definicion:");
        System.out.println("Estos operadores se utilizan para aumentar o disminuir el valor de una variable en uno:");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("incremento (++variable):b = ++a");
        System.out.println("decremento (–variable): b = --a");
        System.out.println("====================================================================================");
    }

    public static void detalleCasoCinco(){
        System.out.println("Seleccionaste Condicional IF, ELSE, IF ELSE ");
        System.out.println("====================================================================================");
        System.out.println("Seleccionaste Condicional IF");
        System.out.println("Definicion:");
        System.out.println("La sentencia if evalúa una condición. Si la condición es verdadera, se ejecuta el \nbloque de código dentro del if.");
        System.out.println("Ejemplos:");
        System.out.println("if (edad < 18) { console.log(\"Eres menor de edad.\"");
        System.out.println("====================================================================================");
        System.out.println("Seleccionaste Condicional ELSE");
        System.out.println("Definicion:");
        System.out.println("La sentencia else se ejecuta si todas las condiciones anteriores (if y else if) son \nfalsas.");
        System.out.println("Ejemplos:");
        System.out.println("else { console.log(\"Eres un adulto mayor.\")");
        System.out.println("====================================================================================");
        System.out.println("Seleccionaste Condicional IF ELSE");
        System.out.println("Definicion:");
        System.out.println("La sentencia else if se utiliza para evaluar múltiples condiciones. Si la primera \ncondición if es falsa, se evalúa la condición else if.");
        System.out.println("Ejemplos:");
        System.out.println("else if (edad >= 18 && edad < 65) { console.log(\"Eres un adulto.\");");
        System.out.println("====================================================================================");
    }
    public static void detalleCasoSeis(){
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
    public static void detalleCasoSiete(){
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
    public static void detalleCasoocho(){
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
    public static void detalleCasoNueve(){
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
    public static void detalleCasoDiez(){
        System.out.println("Seleccionaste FOR");
        System.out.println("\n===================================================================================");
        System.out.println("Definicion:");
        System.out.println("Los bucles for son muy útiles para tareas repetitivas como recorrer listas, generar \nsecuencias de números, y realizar operaciones en cada elemento de una colección.");
        System.out.println("====================================================================================");
        System.out.println("Ejemplos:");
        System.out.println("for (let i = 0; i < 5; i++) {");
        System.out.println("console.log(i);}");
    }
    public static void detalleCasoOnce(){
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
