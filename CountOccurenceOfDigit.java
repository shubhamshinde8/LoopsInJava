package Lecture03;

import java.util.Scanner;

public class CountOccurenceOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println("Enter Occurrence Number : ");
        int occurencedigit=sc.nextInt();
        int cnt=0;
        while (n>0){
            int lastDigit=n%10;
            if(lastDigit==occurencedigit){
                cnt++;
            }
            n=n/10;
        }
        System.out.println("Occurrence Of "+occurencedigit+" : "+cnt);
    }
}
