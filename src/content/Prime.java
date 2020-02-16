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
    public void generatePrimeSeries(int number){
        for(int num = 2; num <= number; num++){
            int i;
            boolean result = true;
            for(i = 2; i < num; i++){
                if(num % i == 0){
                    result = false;
                    break;
                }
            }
            if(i == num){
                result = true;
            }
            if(result){
                System.out.println(num + " ");
            }
        }
    }
}
