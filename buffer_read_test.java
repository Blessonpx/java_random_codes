import java.io.*;

class buffer_read_test {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a String:");
    String s = br.readLine();
    System.out.println("You entered:" + s);
    System.out.println("Enter a Integer:");
    int x = Integer.parseInt(br.readLine());
    System.out.println("You entered:" + x);
    //br1.close();
  }
}