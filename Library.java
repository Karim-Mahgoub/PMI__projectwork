import java.util.Scanner;

public class Library {
    public static void main(String args[]) {
        LibarayImp l1 = new LibarayImp();
        int ch = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Add books");
            System.out.println("2. Add student");
            System.out.println("3. issue books");
            System.out.println("4. return books");
            System.out.println("5. search book");
            System.out.println("6. Add books");
            System.out.println("Enter your choice please: ");

            Scanner s = new Scanner(System.in);
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    l1.addbooks();
                    break;
                case 2:
                    l1.addstudent();
                    break;
                case 3:
                    l1.isuedbooks();
                    break;
                case 4:
                    l1.returnbooks();
                    break;
                case 5:
                    l1.searchbooks();
                    break;
                default:
                    System.out.println("wrong choice,try again pls");
            }
        } while ((ch > 0) && (ch < 6));
    }
}
