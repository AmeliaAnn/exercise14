package exercise14;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String S = in.nextLine();
        int x = Integer.parseInt(S);
        System.out.println("Int x: " + x);
        double y = x;
        System.out.println("Double y: "+y);
   
    }
}
