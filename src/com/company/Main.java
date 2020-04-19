package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = scan.nextInt();
        for (int i = 1;i<n;i++){
            int x = scan.nextInt();
            sum += x;
        }
        System.out.printf("%.2f",(float)sum/n);
    }
}
