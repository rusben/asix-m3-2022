import java.util.Scanner;

class DivisiblesPor3 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    // Suponemos que vienen ordenados inicio es mayor
    // o igual que final
    int primero= teclado.nextInt();
    int ultimo= teclado.nextInt();

    for (int i= primero; i <= ultimo; i++) {
      // Es divisible por 3
      if (i % 3 == 0) {
        System.out.println(i);
      }
    }
  }

}
