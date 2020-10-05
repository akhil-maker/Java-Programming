import java.util.Scanner;

public class InputProgram {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String name = scan.nextLine(); //scanning a string in line

        System.out.println("Enter a int");
        int numberInt = scan.nextInt(); //scanning a integer

        System.out.println("Enter a double");
        double numberDouble = scan.nextDouble(); //scanning a double

        System.out.println("Printing the results");
        System.out.println("String: " + name);
        System.out.println("int: " + numberInt);
        System.out.println("double: " + numberDouble);
    }
}
