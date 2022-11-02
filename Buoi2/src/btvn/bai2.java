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
public class bai2 {
	public static void main(String[] args) {
        System.out.println("Nhap vao a, b, c, d:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int max1 = 0, max2 = 0;
        if(a > b) {
            max1 = a;
            max2 = b;
        } else {
            max1 = b;
            max2 = a;
        }
        if(c > max1) {
        	max2 = max1;
            max1 = c;
        } else if(c < max1 && c > max2) {
            max2 = c;
        }
        if(d > max1) {
        	max2 = max1;
            max1 = d;
        } else if(d < max1 && d > max2) {
            max2 = d;
        }
        if(max1 == max2) {
            System.out.println("Khong ton tai so lon thu hai");
        } else {
            System.out.println(max2);
        }
    }
}
