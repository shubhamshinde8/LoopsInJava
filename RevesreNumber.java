package Lecture03;

import java.util.Scanner;

public class RevesreNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int lastDigit=0;
        while (n!=0){
            lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }

    }
}
