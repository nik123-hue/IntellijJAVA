package Arrays;

public class maxInArray {
    public static void main(String[] args) {
        int[]arr={5,-3,-8,0,3,8,4,90,12,6,78,34,23,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
