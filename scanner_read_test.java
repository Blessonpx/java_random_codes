import java.util.Scanner;

class scanner_read_test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a String:");
    String s = scanner.nextLine();
    System.out.println("You entered:" + s);
    System.out.println("Enter a Integer:");
    int x = scanner.nextInt();
    System.out.println("You entered:" + x);
    System.out.println("Enter a Float:");
    float f = scanner.nextFloat();
    System.out.println("You entered:" + f);
    scanner.close();
  }
}