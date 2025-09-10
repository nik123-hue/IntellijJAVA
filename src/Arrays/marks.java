package Arrays;

public class marks {
    public static void main(String[] args) {
        int[]marks={100,95,85,21,17,71,36,35,7};
        for(int i=0;i<marks.length;i++){
            if(marks[i]<35)
                System.out.print(i+ " ");
        }
    }
}
