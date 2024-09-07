package Lecture03;

import java.util.Scanner;

public class CheckNumberIsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int original_number=n;
        int rev=0;
        while (n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println(rev);
        if(rev==original_number){
            System.out.println("Number is Palindrome ");
        }else{
            System.out.println("Number is Not Palindrome ");
        }
    }
}
