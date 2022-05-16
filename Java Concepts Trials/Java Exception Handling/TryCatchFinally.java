import java.util.Scanner;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        try {
            System.out.println(numberOne/numberTwo);
        } catch (NullPointerException ne) {
            System.out.println("Please fill the values");
        }
        catch (ArithmeticException ae){
            System.out.println("Enter the values properly");
        }
        finally {
            System.out.println("Thank you for entering the values");
        }
        input.close();
    }


}
