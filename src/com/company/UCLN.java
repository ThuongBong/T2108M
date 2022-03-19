package com.company;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args){
        //4. Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó.
        Scanner sc = new Scanner(System.in);
        int a,b,x,y;
        do {
            System.out.println("Enter a,b");
             a = sc.nextInt();
             b = sc.nextInt();
        }
        while (a<=0 || b<=0);
            x = a;
            y = b;
            while (a!=b)
            {
                if (a>b) {
                    a-=b;
                } else {
                    b-=a;
                }
            }
            System.out.println("UCLN is " +a);
            System.out.println("BCNN is "+(x*y)/a );
    }
}
