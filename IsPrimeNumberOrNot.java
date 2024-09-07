package Lecture03;

import java.util.Scanner;

public class IsPrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int a=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                a=1;
                break;
            }
        }
        if(a==0){
            System.out.println("Number is Prime ");
        }else{
            System.out.println("Number is Not Prime ");
        }
    }
}
