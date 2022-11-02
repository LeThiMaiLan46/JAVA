/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class BaiToanKeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("nhap n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soVo = 0, soKeo = 0;
        while(n > 0) {
            soVo++;
            soKeo++;
            n = n - 1;
            System.out.println("n1 =" + n);
            if(soVo % 2 == 0){
                n++;
                System.out.println("n2 = " + n);
                soVo = 0;
            }
        }
        System.out.println("so keo an duoc la: " + soKeo);
    }
    
}
