/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn;

/**
 *
 * @author Windows 10
 */
public class bai3 {
    public static void main(String[] args) {
        int trauDung, trauNam, trauGia;
        for(trauDung=1; trauDung<=20; trauDung++) {
            for(trauNam=1; trauNam<35; trauNam++) {
                for(trauGia=1; trauGia<100; trauGia++) {
                    if(trauDung + trauNam + trauGia == 100 && 15*trauDung + 9*trauNam + trauGia == 300) {
                        System.out.println("Trau dung: " + trauDung);
                        System.out.println("Trau nam: " + trauNam);
                        System.out.println("Tran gia: " + trauGia);
                    }
                }
            }
        }
    }
}
