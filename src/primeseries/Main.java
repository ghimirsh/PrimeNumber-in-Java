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
//        System.out.println("Enter a number : ");
         Prime one = new Prime();
        int number;
//        number = scanner.nextInt();
//       
//        if(one.checkPrime(number)){
//            System.out.println("Yes, " + number + " is a prime number.");
//        }
//        else{
//            System.out.println("No, " + number + " is not a prime number");
//        }
        System.out.println("Enter the upper limit for the prime series : ");
        number = scanner.nextInt();
        System.out.println("The prime series up to ");
        one.generatePrimeSeries(number);
    }
    
}
