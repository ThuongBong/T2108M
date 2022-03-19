package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //Nhập 1 số từ bàn phím kiểm tra có phải số hoàn hảo hay không?
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        //dùng vòng lặp từ 1 đến a/2 vì ước của a luôn nhỏ hơn a/2
        for (int i=1; i<=a/2; i++){
            if(a%i==0)
                //tổng các ước số của a
                sum+=i;
        }
        if (sum==a){
            System.out.println(a + " " + "is perfect number");
        } else {
            System.out.println(a + " " + "Not a perfect number");
        }
    }
}
