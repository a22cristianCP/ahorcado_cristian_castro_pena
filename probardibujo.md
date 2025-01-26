La clase DibujarAhorcado contiene un método dibujar que admite valores de 1 a 7 que representan el número del intento, La idea es permitir hasta 6 intentos fallidos como mucho y el séptimo  ya se corresponde con el dibujo final de ahorcamiento total. En el ejemplo se prueba con valor 2.
![Alt text](images/image-1.png)
```java
class DibujoAhorcado{
   static void dibujar(int i) {

       switch (i) {
           case 1:
               System.out.println(" ---------------------");
               for (int j = 0; j< 15; j++) {
                   System.out.println(" |");

               }
               System.out.println("__________");
               break;

           case 2:
               System.out.println(" ---------------------");
               System.out.println(" |                     |");
               System.out.println(" |                     |");
               System.out.println(" |                  -------");
               System.out.println(" |                 | -  -  |");
               System.out.println(" |                 |   o   |");
               System.out.println(" |                  -------");
               for (int j = 0; j< 10; j++) {
                   System.out.println(" |");

               }
               System.out.println("__________");
               break;

           case 3:
               System.out.println(" ---------------------");
               System.out.println(" |                     |");
               System.out.println(" |                     |");
               System.out.println(" |                  -------");
               System.out.println(" |                 | -  -  |");
               System.out.println(" |                 |   o   |");
               System.out.println(" |                  -------");
               System.out.println(" |                     |   ");
               System.out.println(" |                     |   ");
               System.out.println(" |                     |   ");
               System.out.println(" |                     |   ");
               System.out.println(" |                     |   ");
               for (int j = 0; j< 5; j++) {
                   System.out.println(" |");

               }
               System.out.println("__________");
               break;

           case 4:
               System.out.println(" ---------------------");
               System.out.println(" |                     |");
               System.out.println(" |                     |");
               System.out.println(" |                  -------");
               System.out.println(" |                 | -  -  |");
               System.out.println(" |                 |   o   |");
               System.out.println(" |                  -------");
               System.out.println(" |                     |   ");
               System.out.println(" |                   / |   ");
               System.out.println(" |                 /   |   ");
               System.out.println(" |                /    |   ");
               System.out.println(" |                     |   ");
               for (int j = 0; j< 5; j++) {
                   System.out.println(" |");

               }
               System.out.println("__________");
               break;

           case 5:
               System.out.println(" ---------------------");
               System.out.println(" |                     |");
               System.out.println(" |                     |");
               System.out.println(" |                  -------");
               System.out.println(" |                 | -  -  |");
               System.out.println(" |                 |   o   |");
               System.out.println(" |                  -------");
               System.out.println(" |                     |   ");
               System.out.println(" |                   / | \\ ");
               System.out.println(" |                  /  |   \\ ");
               System.out.println(" |                 /   |     \\ ");
               System.out.println(" |                     |   ");
               for (int j = 0; j< 5; j++) {
                   System.out.println(" |");

               }
               System.out.println("__________");
               break;

           case 6:
               System.out.println(" ---------------------");
               System.out.println(" |                     |");
               System.out.println(" |                     |");
               System.out.println(" |                  -------");
               System.out.println(" |                 | -  -  |");
               System.out.println(" |                 |   o   |");
               System.out.println(" |                  -------");
               System.out.println(" |                     |   ");
               System.out.println(" |                   / | \\ ");
               System.out.println(" |                  /  |   \\ ");
               System.out.println(" |                 /   |     \\ ");
               System.out.println(" |                     |   ");
               System.out.println(" |                    /  ");
               System.out.println(" |                   /      ");
               System.out.println(" |                  /       ");
               for (int j = 0; j< 2; j++) {
                   System.out.println(" |");

               }
               System.out.println("__________");
               break;

           case 7:
               System.out.println(" ---------------------");
               System.out.println(" |                     |");
               System.out.println(" |                     |");
               System.out.println(" |                  -------");
               System.out.println(" |                 | X  X  |");
               System.out.println(" |                 |   o   |");
               System.out.println(" |                  -------");
               System.out.println(" |                     |   ");
               System.out.println(" |                   / | \\ ");
               System.out.println(" |                  /  |   \\ ");
               System.out.println(" |                 /   |     \\ ");
               System.out.println(" |                     |   ");
               System.out.println(" |                    / \\");
               System.out.println(" |                   /   \\  ");
               System.out.println(" |                  /     \\ ");
               for (int j = 0; j< 2; j++) {
                   System.out.println(" |");

               }
               System.out.println("__________");
               break;
       }
   }
}

```
