package methods;

public class ReturnKeywords {
    public static void greet(int x){
        if(x<0) return;
        System.out.println("Good morning");
    }

    public static void main(String[] args) {
        greet(-5);
    }
}
