import java.util.Scanner;

public class TryCatch {
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
        input.close();
    }


}
