/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, dem = 0;
        do {
            System.out.println("nhap vao so duong:");
            n = scanner.nextInt();
        } while(n <= 0);
        while(n > 0) {
            k = n % 10;
            if(k % Math.sqrt(k) == 0) {
                System.out.print(k + "  ");
                dem++;
            }
            n = n / 10;
        }
        if(dem == 0) {
            System.out.println("NO");
        }
    }
}
