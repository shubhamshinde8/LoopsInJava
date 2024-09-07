package Lecture03;

import java.util.Scanner;

public class CountWovel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s=sc.nextLine();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cnt++;
                System.out.println(ch);
            }

        }
        System.out.println("Vovels In "+s+" : "+cnt);
    }
}
