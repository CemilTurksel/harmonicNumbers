import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        double result = 0.0;

        System.out.println("Enter the number to calculate in harmonic formula: ");
        number = scanner.nextInt();

        for(int i = 1; i <= number; i++){
            result += (1.0 / i);
        }
        System.out.println("Harmonic sum: " + result);
    }
}
