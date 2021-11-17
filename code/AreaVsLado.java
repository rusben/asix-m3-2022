import java.util.Scanner;

public class AreaVsLado {
    public static void main(String[] args) {

      // Dado un lado de cuadrado y Radio de circulo.
      // Siempre que cabe mirando el lado cabe mirando el area?

      for (float c = 0; c < 10; c+=0.001) {
        for (float r = 0; r < 10; r+=0.001) {

          if (!((c >= r*2) == (c*c >= r*r*3.141593))) {
            System.out.println("false");
            System.out.println("c: "+c);
            System.out.println("r: "+r);
          }
        }
      }
    }
}
