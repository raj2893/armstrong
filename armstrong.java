import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // a= 153 --> 1 cube + 5 cube + 3 cube = same number
        System.out.println(isArmstrong(n));
        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
        // I am going to make changes here to make test of git
        // This is line 2 of making changes
    }
}
