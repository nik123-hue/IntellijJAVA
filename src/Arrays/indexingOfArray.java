package Arrays;
import java.util.Scanner;
public class indexingOfArray {
    public static void main(String[] args) {

        int[] arr = { 23, 32, 34, 45, 56, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)
                arr[i] *= 2;
            else
                arr[i] += 10;

        }
        for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + " ");

        }

        }
    }


