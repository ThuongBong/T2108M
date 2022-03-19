package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
       //Nhập 1 số từ bàn phím kiểm tra có phải số nguyên tố hay không?
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so tu ban phim: ");
        int n = sc.nextInt();
        if(checkPrime(n)){
            System.out.println(n+  "La so nguyen to");
        } else {
            System.out.println(n+  "Khong la so nguyen to");
        }
    }
    public static boolean checkPrime(int n){
        if(n < 2) return false;
        if(n < 4) return true;
        for(int i=2; i<= n/2; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
