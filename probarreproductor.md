```java
//ReproductorMidi.java
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

class ReproductorMidi {

   Sequencer sequencer;

   public ReproductorMidi(String ficheroMidi) throws Exception {
       //simplificamos el throws con Exception para hacer código limpio (aunque de peor calidad)
       // lo más fácil pillar el secuenciador por defecto.
       sequencer = MidiSystem.getSequencer();
       //antes de usar el secuenciaador hay que abrirlo.
       sequencer.open();
       // la secuencia midi es un InputStream. Puede ser un fichero, un stream de internet, ...en este caso es un fichero
       InputStream is = new BufferedInputStream(new FileInputStream(new File(ficheroMidi)));
       sequencer.setSequence(is);
       //cuando nos interesa arrancamos la reproducción.
       sequencer.start();
       //repetimos indefinidadmente la cancion indicando que se repita LOPP_CONTINUOSLY
       sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
   }

   void cerrar() {
       sequencer.close();
   }
}
```
## Código Kotlin para probar la clase
No olvides colocar el fichero midi que contiene la música justo debajo de la carpeta del proyecto para evitar teclear rutas en el código.
```java
fun main() {
   val rm = ReproductorMidi("pugnodollari.mid")
   println("Cargando juego...")
   Thread.sleep(20000) //la música tarda un ratito y por eso hacemos este sleep....

   DibujoAhorcado.dibujar(1)
   Thread.sleep(2000)
   DibujoAhorcado.dibujar(2)
   Thread.sleep(2000)
   DibujoAhorcado.dibujar(3)
   Thread.sleep(2000)
   rm.cerrar() //si no cerramos el reproductor no acaba el main
}
```
Ojo con la coloación del fichero midi en el proyecto
![Alt text](images/image-2.png)