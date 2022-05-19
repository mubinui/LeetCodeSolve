package GoodToKnowConcepts;

import java.util.Scanner;

public class ShortForms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        int a = sc.nextInt();
        System.out.println("Enter value of B");
        int b = sc.nextInt();
        int c = 0;
        String s = "Mubin";
        int x = (a>b)? c:100;
        int y = (a<b)? c:400;
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);




    }
}
