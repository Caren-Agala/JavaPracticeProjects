/*pick 6 numbers between 1 and 49
* After drawing, check if it is repeated in drawn numbers
*If repeated, loop the draw until not repeated
* sort using Arrays.sort method */
package org.example;
import java.util.random.*;
import java.util.Arrays;
import java.util.Random;

public class LotteryNumGen {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1;
        int max = 49;
        int slots = 6;

        // all elements are initialised to be zero
        int[] lotteryArray = new int[slots];
        boolean isRepeated;
        int randomNumber = 0;

        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
            do {
                isRepeated = false;
                // 1 to 49
                randomNumber = rand.nextInt(max + 1 - min) + min;
                //check for any repeated numbers against the existing  drawn slots
                for (int k = 0; k <= indexDrawn; k++) {
                    if (lotteryArray[k] == randomNumber) {
                        isRepeated = true;
                        break;
                    }
                }
            } while (isRepeated);
            lotteryArray[indexDrawn] = randomNumber;
        }
        Arrays.sort(lotteryArray);
        System.out.println("The results of the draw are: ");
        for (int i = 0; i < slots; i++) {
            System.out.print(lotteryArray[i] + " ");
        }
    }
}
