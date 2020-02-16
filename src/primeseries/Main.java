/*
 * Shankar Ghimire
 * StudentId:991585190
 * Course: ...............
 */
package primeseries;

import content.Prime;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        Prime one = new Prime();
        if(one.checkPrime(number)){
            System.out.println("Yes, " + number + " is a prime number.");
        }
        else{
            System.out.println("No, " + number + " is not a prime number");
        }
    }
    
}
