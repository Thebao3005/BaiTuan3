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
public class VD2 {

    public static void main(String[] args) {
        try {
            InetAddress addByname = InetAddress.getByName("www.google.com");
            InetAddress addByIp = InetAddress.getByName("192.168.200.60");
            System.out.println("Address By Name: " + addByname);
            System.out.println("Address By IP: " + addByIp);
            //lay ten may chu
            InetAddress addByname1 = InetAddress.getByName("www.vnexpress.net");
            String hostname = addByname1.getHostName();
            System.out.println("Host name: " + hostname);
            //Lay dia chi IP
            String ip = addByname1.getHostAddress();
            System.out.println("Dia chi IP: " + ip);
            InetAddress addByname2 = InetAddress.getByName("www.vnexpress.net");
            //kiem tra dia chi IP cos phai la IP4
            boolean IsIP4 = addByname2 instanceof java.net.Inet4Address;
            System.out.println("Co phai IP4 khong? "+IsIP4);
            boolean IsIP6 = addByname2 instanceof java.net.Inet6Address;
            System.out.println("Co phai IP6 khong? "+IsIP6);
        } catch (Exception e) {
        }
    }
}
