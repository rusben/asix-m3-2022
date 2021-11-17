# Programació bàsica

## El lenguaje Java
### Conceptos bàsicos
#### Comentarios en Java
Los comentarios se pueden utilizar para explicar el código Java y hacerlo más legible. También se puede utilizar para evitar la ejecución al probar código alternativo.

##### Comentarios de una sola línea
Los comentarios de una sola línea comienzan con dos barras diagonales `//`. Java ignora cualquier texto entre `//` y el final de la línea (no se ejecutará).

Este ejemplo usa un comentario de una sola línea antes de una línea de código:

```java
// Esto es un comentario
System.out.println ("Hola mundo");
```

Este ejemplo utiliza un comentario de una sola línea al final de una línea de código:
```java
System.out.println ("Hola mundo"); // Esto es un comentario
```

##### Comentarios de varias líneas de Java

Los comentarios de varias líneas comienzan con `/*` y terminan con `*/`.

Java ignorará cualquier texto entre `/*` y `*/`.

Este ejemplo utiliza un comentario de varias líneas (un bloque de comentarios) para explicar el código:

```java
/* El siguiente código imprimirá las
palabras Hello World por pantalla */
System.out.println ("Hola mundo");
```

#### Tipos de datos (variables)
Los tipos de datos se dividen en dos grupos:

* ***Tipos de datos primitivos***: byte, short, int, long, float, double, boolean y char.
* ***Tipos de datos no primitivos***: cadenas de texto (Strings), matrices (Arrays) y clases.


| Tipo de dato   |      Tamaño      |  Descripción |
|----------------|------------------|--------------|
|    `byte`        |	    1 byte 	    | Números entre -128 to 127 |
|    `short`	     |      2 bytes 	  | Números desde -32768 to 32767 |
|    `int`         |    	4 bytes     | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
|    `long`        |   	  8 bytes     |	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
|    `float`       |    	4 bytes 	  | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
|    `double` 	   |      8 bytes     |	Stores fractional numbers. Sufficient for storing 15 decimal digits |
|    `boolean` 	   |      1 bit       |	Stores true or false values
|    `char` 	     |      2 bytes 	  | Stores a single character/letter or ASCII values

Al definir una variable se reservará en el espacio de memória del programa un número de bytes equivalente al tamaño de la variable.

La definición genérica de una variable es la siguiente:
```java
tipo nombre;
```
Primero indicamos el `tipo` de la variable que queremos crear, después el `nombre` de la variable y finalmente `;` para finalizar la sentencia de creación.

A continuación se muestran ejemplos de creación de variables de diferentes tipos, esta vez las sentencia además de crear la variables también le asignan un valor, por tanto, estamos ante una sentencia de creación y asignación.

```java
// Ejemplos
int entero = 2;
String cadenaTexto = "Hola";
char caracter = 'a'; 
float decimal = 2.4;
double otroDecimal = 11.4;
boolean verdaderoFalso = true;

// Ejemplos graciosos:
int encion = 1;
boolean dovoy = false;
float ador = 3.3;
double cheese = 5.5;
char cuteria = 'c';
String ulado = "Hola";
```
#### Datos primitivos
#### Literales
#### Expresiones
#### Sentencias
##### Decisión `if | switch`
##### Iteración `while | for`
##### Ramificación `break | continue`
#### Cadenas de texto (Strings)
#### Matrices (Arrays)
#### Recursividad

### Ejercicios resueltos
#### Ejercicios operadores aritméticos y expresiones
1. Un programa que calcula la suma de dos números enteros.

```java=
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
      // Definición del objeto de tipo Scanner teclado, permite leer lo que escribe el usuario del programa
      Scanner teclado = new Scanner(System.in);

      // Definición de las variables del programa
      int a;
      int b;
      int suma;

      // Escritura de mensaje por pantalla
      System.out.println("Escribe un número entero:");
      // Lectura del primer número de la entrada de teclado
      a = teclado.nextInt();

      // Escritura de mensaje por pantalla
      System.out.println("Escribe otro número entero:");
      // Lectura del segundo número de la entrada de teclado
      b = teclado.nextInt();

      // Sentencia de asignación a la variable suma del resultado de evaluar la expresión a + b
      suma = a + b;

      // Escritura de mensaje por pantalla
      System.out.println("El resultado de sumar "+a+" y "+b+" es: "+suma);
    }
}

```
#### Ejercicios `if | switch`
#### Ejercicios `while | for`
#### Ejercicios `Strings`
#### Ejercicios `Arrays`
#### Ejercicios `Recursividad`
