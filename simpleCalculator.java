import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        double a =sc.nextDouble();
        System.out.println("Enter B number : ");
        double b = sc.nextDouble();
        System.out.println("enter operator(+,-,/,*)");
        char operator=sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("result:"+(a+b));
                
                break;
            case '-':
                System.out.println("result:"+(a-b));  
                break;
            case'/':
                System.out.println("result:"+(a/b));
                break;
            case'*':
                System.out.println("result"+(a*b));
                break;
        
            default:
                break;
        }

    }

    
}
