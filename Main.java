import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        geometry.accessingPi();

        Scanner input = new Scanner(System.in);
        try{
            double mass = input.nextDouble();
            double height = input.nextDouble();

            System.out.println(geometry.potentialEnergy(mass, height));
        }catch (InputMismatchException ime){
            System.out.println("Enter a valid number");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}



