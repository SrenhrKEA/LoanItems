import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Test {
  Scanner in = new Scanner(System.in);
  List<LoanItem> loanItems = new ArrayList<>();
  String inputTitle;

  void runProgram() {
    System.out.print("How many items do you want to register?: \n");
    int numItems = Integer.parseInt(in.nextLine());

    for (int i = 0; i < numItems; i++) {
      System.out.println("ITEM no. " + (i + 1));
      System.out.println("Type (B or V):");
      char inputType = in.nextLine().toLowerCase(Locale.ROOT).charAt(0);

      if (inputType=='b' ||inputType=='v') {
      System.out.println("Title:");
      inputTitle = in.nextLine();}
      else
      inputTitle = "";

      switch (inputType) {
        case 'b' -> loanItems.add(new Book(inputTitle));
        case 'v' -> loanItems.add(new Video(inputTitle));
        default -> i = i-1;
      }
    }

    System.out.println("LIST OF LOAN ITEMS:");
    System.out.println("-------------------");
    System.out.println("ID\tTYPE\tTITLE");
    for (int i = 0; i < loanItems.size(); i++) {
      System.out.printf("%d\t%s\t%s\n",(i+1),loanItems.get(i).getClass().getSimpleName(),loanItems.get(i).getTitle());
    }
  }

  public static void main(String[] args) {
    new Test().runProgram();
  }
}
