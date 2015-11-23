import java.util.*;

class Stumper {
  private static Scanner input = new Scanner(System.in);

  public static List<String> getUserInfo() {
    List<String> userInfo = new ArrayList<String>();
    System.out.println("What is your name?");
    userInfo.add(input.nextLine());
    System.out.println("What is your favorite color?");
    userInfo.add(input.nextLine());
    return userInfo;
  }

  public static void main(String[] args) {
    List<String> messages = getUserInfo();
    System.out.println("\nI'll tell you what you told me.\n\n");
    for (int i = 0; i < messages.size(); i++) {
      System.out.println(messages.get(i));
    }
  }
}
