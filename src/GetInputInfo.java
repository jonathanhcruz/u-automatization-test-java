import java.util.Scanner;

public class GetInputInfo {

  public static String getInputInfo(String StringToPrint) {
    final Scanner scanner = new Scanner(System.in);

    System.out.println(StringToPrint);

    return scanner.nextLine();
  }
}
