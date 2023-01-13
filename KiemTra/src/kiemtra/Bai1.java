/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ngoacDon;
        int demNgoacMo = 0;
        int demNgoacDong = 0;
        Scanner sc = new Scanner(System.in);
        ngoacDon = sc.nextLine();
        for (int i = 0; i < ngoacDon.length(); i++) {
            if (ngoacDon.charAt(i) == ')') {
                demNgoacMo++;
            }
            if (ngoacDon.charAt(i) == '(') {
                demNgoacDong++;
            }
        }
        System.out.println(Math.abs(demNgoacMo - demNgoacDong));
    }
    
    
}
