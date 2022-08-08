package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many many miles have you driven? ");
        Integer miles = input.nextInt();
        System.out.println("How many gallons of gas has the care used?");
        Double gallons = input.nextDouble();
        System.out.println("The car has used " + miles / gallons + " mpg");
    }
}
