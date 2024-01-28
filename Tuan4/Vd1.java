/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan4;

import java.net.InetAddress;

/**
 *
 * @author Baobu
 */
public class Vd1 {

    public static void main(String[] args) {
        try {
            InetAddress addByname = InetAddress.getByName("www.google.com");
            InetAddress addByIp = InetAddress.getByName("192.168.200.60");
            System.out.println("Address By Name: "+addByname);
            System.out.println("Address By IP: "+ addByIp);
        } catch (Exception e) {
        }
    }

}
