package J01_basicIO;

import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer a: ");
        int a = input.nextInt();
        System.out.println("Enter a string b: ");
        String b = input.next();
        System.out.println("a: "+a+", b: "+b); 
    }
}
