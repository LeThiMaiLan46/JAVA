/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String phone;
    private static Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Person() {}
    
    public void input() {
        System.out.println("Nhap ten:");
        setName(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhap tuoi:");
        setAge(sc.nextInt());
        System.out.println("Nhap gioi tinh:");
        setGender(sc.nextLine());
        System.out.println("Nhap so dien thoai:");
        setPhone(sc.nextLine());
    }
    
    public void output() {
        System.out.printf("%-15s %-15s %-15s %-15s", "Ho Ten", "Tuoi" , "Gioi tinh" , "SDT");
        System.out.printf("%-15s %-15d %-15s %-15s", getName(), getAge(), getGender(), getPhone());
    }
}
