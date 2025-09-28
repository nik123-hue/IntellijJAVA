package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 6, 89, 45, 28, 27};


        int x = 89;
        boolean flag= false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag=true;
                break;


            }

        }
        if(flag==false)
            System.out.println(" not found");
            else System.out.println("found");
        }


    }


