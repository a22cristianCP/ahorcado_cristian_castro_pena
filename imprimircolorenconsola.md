## Secuencias de escape ANSI para modificar el color.
El comportamiento natural a la hora de imprimir en pantalla de un términal “puro” es: impresión secuencial, color de fondo negro y color de texto blanco o verde fosforito(pensar en pelis de ciencia ficción del año de la pera). 

Se dice que al respecto de imprimir en pantalla el terminal trabaja “en modo texto” donde cada posición de la pantalla se corresponde con un carácter de texto, es decir, podemos ver la pantalla como una matriz de caracteres vs el “modo gráfico” donde podemos ver la pantalla como una matriz de pixeles o puntos de luz. 

Antes de la irrupción de los sistemas operativos con interfaces de usuario que trabajaban en modo gráfico, aparecieron aplicaciones que enriquecieron las posibilidades de aspecto de impresión en pantalla del modo texto trabajando con los caracteres de escape ANSI. Los primeros bits de estos caracteres especiales indican al sistema operativo que no es un carácter para imprimir si no un comando para que haga otro tipo de acción como por ejemplo cambiar el color de impresión de los siguientes caracteres a imprimir

Las secuencias de escape ANSI son un estándar para  controlar la ubicación del cursor, el color, el estilo de fuente y otras opciones en terminales de texto de video y emuladores de terminales 

Estas secuencias standard son muy anteriores a Unicode por lo que Unicode las incluyó en su propio código. Por tanto funciona igual en windows que linux y en los emuladores de términal de los IDEs aunque en la práctica siempre puede aparecer algún problema de visualización

Tanto en Java como en Kotlin, se trata de indicar la secuencia ANSI correspondiente a la acción deseada a la función println. 

Observa que las secuencias de escape se indican dentro de un String aunque realmente una secuencia de escape es un carácter.

## EN KOTLIN
```java
fun main() {
       // colores texto
       val GREEN = "\u001B[32m"
       val RESET = "\u001B[0m"
       val WHITE = "\u001B[37m"
       val RED = "\u001B[31m"
       val YELLOW = "\u001B[33m"
       val BLUE = "\u001B[34m"
       val PURPLE = "\u001B[35m"
       val CYAN = "\u001B[36m"
       //colores fondo
       val GREEN_BACKGROUND = "\u001B[42m"
       val RED_BACKGROUND = "\u001B[41m"
       val YELLOW_BACKGROUND = "\u001B[43m"
       val BLUE_BACKGROUND = "\u001B[44m"
       val PURPLE_BACKGROUND = "\u001B[45m"
       val CYAN_BACKGROUND = "\u001B[46m"
       val WHITE_BACKGROUND = "\u001B[47m"
  
  
       println(GREEN + "verde")
       println(RESET + "por defecto")
       println(RED + "rojo")
       println("se mantiene el color anterior si no se resetea o especifica nuevo")
       println(RESET + "por defecto")
       println("\u001b[42m" + "pasamos a fondo verde")
       println(RESET +"regresa a fondo y texto por defecto")
       println(YELLOW + "Amarillo")
       println(BLUE + "Azul")
}
``````

## EN JAVA
```java
public class App {
    public static void main(String[] args) {
        // colores texto
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";
        String WHITE = "\u001B[37m";
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        //colores fondo
        String GREEN_BACKGROUND = "\u001B[42m";
        String RED_BACKGROUND = "\u001B[41m";
        String YELLOW_BACKGROUND = "\u001B[43m";
        String BLUE_BACKGROUND = "\u001B[44m";
        String PURPLE_BACKGROUND = "\u001B[45m";
        String CYAN_BACKGROUND = "\u001B[46m";
        String WHITE_BACKGROUND = "\u001B[47m";

        System.out.println(GREEN + "verde");
        System.out.println(RESET + "por defecto");
        System.out.println(RED + "rojo");
        System.out.println("se mantiene el color anterior si no se resetea o especifica nuevo");
        System.out.println(RESET + "por defecto");
        System.out.println("\u001b[42m" + "pasamos a fondo verde");
        System.out.println(RESET +"regresa a fondo y texto por defecto");
        System.out.println(YELLOW + "Amarillo");
        System.out.println(BLUE + "Azul");
    }
}
```
