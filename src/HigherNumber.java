
/**
 * Forward declaration of guess API.
 * @param num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class HigherNumber {

    public static int guessNumber(int n) {
        int left = 0;
        int right = n;
         while (left <= right){
             int mid = left + (right - left)/2;
             int guessResult = guess(mid);

             if (guessResult == 0) return mid;

             if (guessResult < 0){
                 right = mid - 1;
             }else {
                 left = mid + 1;
             }

         }
         return 0;

    }

}

