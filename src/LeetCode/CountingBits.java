package LeetCode;

import java.util.Arrays;

/*
 * CountingBits
 */
public class CountingBits {
    public static int[] countBits(int n) {
        int[] output = new int[n+1];
        int i = 0;
        while(i <= n){
            int k = i;
            int count = 0;
            while(k > 0){
                if ((k&1) == 1){
                    count++;
                }
                k = k >> 1;
            }
            output[i] = count;
            i++;
        }

        return output;
    }

    public static void main(String[] args) {
        int [] arr = countBits(5);
        System.out.println(Arrays.toString(arr));
    }
}