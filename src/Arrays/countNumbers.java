package Arrays;

public class countNumbers {
    public static void main(String[] args) {
        int[]arr={2,34,56,34,57,68,56,27,988,900,897,68,47};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>5)
                count++;
        }
        System.out.println(count);
    }
}
