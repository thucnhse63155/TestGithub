/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuc.util;

import java.util.Scanner;

/**
 *
 * @author MY_PC
 */
public class MyToys {

    public static int getAnInteger(String msg) {
        int n; // tạm thời chứa giá trị nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Your choice is invalid !! Choice in [1...8]");
            }
        } while (true); // điều gì còn đúng thì cứ lặp lại đê
    }

    public static int getAnIntegerInRange(int a, int b) {
        int n; // tạm thời chứa giá trị nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Select a function ");
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Input a number in range [ " + a + "..." + b + " ]");
            }
        } while (true); // điều gì còn đúng thì cứ lặp lại đê
    }

    public static String getID(String msg) {
        String s;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                //kiểm tra xem ID có đúng định dạng không? ID chỉ chứa các ký tự từ a -> z, A -> Z và 0 -> 9 độ dài = 10 
                System.out.println(msg);
                s = sc.nextLine().trim().toUpperCase();
                return s;
            } catch (Exception ex) {
                System.out.println("ID invalid");
            }
        } while (true);

    }

    public static String getName(String msg) {
        String s;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                s = sc.nextLine().trim().toUpperCase();
                if (s.matches("[a-z A-Z]{1,40}")) { 
                    return s;
                }
            } catch (Exception ex) {
                System.out.println("Name invalid");
            }
        } while (true);

    }

    public static double getWeight(String msg) {
        double weight;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                weight = Double.parseDouble(sc.nextLine());
                if (weight > 0) {
                    return weight;
                }
            } catch (Exception ex) {
                System.out.println("Weight invalid");
            }
        } while (true);

    }

    public static int getYOB(String msg) {
        int yob;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                yob = Integer.parseInt(sc.nextLine());
                if (yob > 0) {
                    return yob;
                }
            } catch (Exception ex) {
                System.out.println("YOB invalid");
            }
        } while (true);

    }
}
