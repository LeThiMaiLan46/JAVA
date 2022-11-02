package buoi2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
public class switchcase {
    public static void main(String[] args) {
        //nhap vao 1 thang, in ra so ngay trong thang
        System.out.println("nhap thang: ");
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        int nam = scanner.nextInt();
        switch(thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                System.out.println("co 31 ngay");
                break;
            }
            case 2: {
                if(nam % 4 == 0) {
                    System.out.println("co 29 ngay");
                } else {
                    System.out.println("co 28 ngay");
                }
                break;
            }
            case 4: case 6: case 9: case 11: {
                System.out.println("co 30 ngay");
                break;
            }
            default: {
                System.out.println("hong co bieccccc");
            }
        }
    }
}
