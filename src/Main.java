import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first number");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("enter the second number");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("what oprations do you want to operate");
        String opration = scanner.nextLine();
        if(opration.equals("subtraction"))
        {
            System.out.printf("%f - %f = %f" ,number1,number2,number1 - number2);
        }
        else if(opration.equals("multiplication")){
            System.out.printf("%f * %f = %f" ,number1,number2,number1 * number2);
        }
        else if(opration.equals("divi")){
            if(number2 == 0){
                System.out.println("cannot divide by zero");
            }
            else{ System.out.printf("%f /  %f = %f" ,number1,number2,number1 / number2);
            }
        }
        else{
            System.out.println("this is not supported opration");

            scanner.close();
        }
    }
}