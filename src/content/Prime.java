/*
 * Shankar Ghimire
 * StudentId:991585190
 * Course: ...............
 */
package content;

/**
 *
 * @author Dell
 */
public class Prime {
    public boolean checkPrime(int number){
        boolean result = false;
        int i;
        for(i = 2; i < number; i++){
            if(number % i == 0){
               result = false;
               break;
            }
        }
        if(i == number){
            result = true;
        }
        return result;

    }
}
