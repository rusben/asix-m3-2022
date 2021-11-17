import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int n = teclado.nextInt();
    int factorial = 1;

    while(n > 1) {
      factorial *= n;
      n--;
    }

    System.out.println(factorial);

  }

}
