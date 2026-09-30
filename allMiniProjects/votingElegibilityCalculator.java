
package allMiniProjects;
import java.util.Scanner;

public class votingElegibilityCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age =sc.nextInt();

        if(age>=18){
        System.out.println("You Can Vote");
        }else{
        System.out.println("you can't vote");
         }
    }
    
}
