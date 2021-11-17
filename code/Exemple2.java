import java.util.Scanner;

class Exemple2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Com et dius?");
    String nom;
    nom = entrada.nextLine();

    System.out.println("Encantat "+nom);
    System.out.println("Quina edat tens?");

    int edat;
    edat = entrada.nextInt();

    System.out.println("No sabia pas que tinguessis "+edat+" anys.");

  }
}
