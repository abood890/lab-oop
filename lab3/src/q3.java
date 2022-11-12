import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the num");
        int x = in.nextInt();
        if (x>0) System.out.println(" negative");
        else if (x<0)System.out.println(" positive");
        else System.out.println(" this zero");
    }

}
