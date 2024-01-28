/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan4;

import java.net.URL;

/**
 *
 * @author Baobu
 */
public class T4URL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://fpll.poly.rdu.vn/goto.php?target=root_1&client_id=fpolyhn");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("Truy van: "+url.getQuery());
            System.out.println("Tham chieu: "+url.getRef());
        } catch (Exception e) {
        }
    }
}
