import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  float graus;

    Scanner fH;

    fH = new Scanner(System.in);

    System.out.print("Digite uma temperatura: ");
    graus = fH.nextFloat();

    System.out.println("A temperatura:" + (graus * 1.8 + 32));
    
   
  }
}