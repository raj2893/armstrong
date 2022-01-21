import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int[] demo = new int[5];
        String[] str = new String[5];

//        for (int i = 0; i < demo.length; i++){
//            System.out.println("Input the " + i + " the member of array");
//            demo[i] = in.nextInt();
//        }
//        for (int i = 0; i < demo.length; i++){
//            System.out.println(demo[i]);
//        }
        for (int j = 0; j < str.length; j++) {
            System.out.println("Input the " + j + "th member of array");
            str[j] = in.next();
        }

            System.out.println(Arrays.toString(str));


    }
}
