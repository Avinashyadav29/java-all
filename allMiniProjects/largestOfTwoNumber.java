package allMiniProjects;
import java.util.Scanner;

public class largestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int A = sc.nextInt();
         System.out.println("Enter B Number:");
        int B = sc.nextInt();
        System.out.println("Enter C Number:");
        int C = sc.nextInt();
        if (A >= B && A >= C) {
            System.out.println("A is the largest");
        } else if (B >= A && B >= C) {
            System.out.println("B is the largest");
        } else {
            System.out.println("C is the largest");
        }
    }
}
