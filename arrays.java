import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int[] demo = new int[5];

        for (int i = 0; i < demo.length; i++){
            demo[i] = in.nextInt();
        }
        for (int i = 0; i < demo.length; i++){
            System.out.println(demo[i]);
        }


    }
}
