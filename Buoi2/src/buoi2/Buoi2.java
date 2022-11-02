/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi2;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Buoi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.out.println("xin chao"); //nhap va xuong dong
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("a = " + a);

        //nhap 2 so tu ban phim, in ra tong va hieu
        System.out.println("Nhap b, c: ");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("tong = " + (b + c));
        System.out.println("hieu = " + (b - c));

        //ep kieu du lieu
        float d = (float) b; //noi rong kieu du lieu cua b tu int thanh short
        System.out.println(d);
        System.out.println((float) c);
        
        
        //nhap vao 3 so va in ra min, max
        System.out.println("Nhap vao e, g, h:");
        float e = scanner.nextFloat();
        float g = scanner.nextFloat();
        float h = scanner.nextFloat();
        if (e > g && e > h) {
            System.out.println("max = " + e);
        } else if (g > e && g > h) {
            System.out.println("max = " + g);
        } else {
            System.out.println("max = " + h);
        }
        if (e < g && e < h) {
            System.out.println("min = " + e);
        } else if (g < e && g < h) {
            System.out.println("min = " + g);
        } else {
            System.out.println("min = " + h);
        }
        */
        
        System.out.println("nhap vao:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        for(int i=2; i<Math.sqrt(x); i++) {
            if(x % i == 0) {
                k = 1;
            System.out.println("yes");
                break;
            }
        }
        if(k == 0 && x != 1)
            System.out.println("no");
    }
}
