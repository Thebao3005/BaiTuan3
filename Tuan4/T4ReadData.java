/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Doc du lieu tu 1 trang web
 *
 * @author Baobu
 */
public class T4ReadData {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
//mo ket noi den url
            URLConnection uconect = url.openConnection();
//doc du lieu tu ket noi
            BufferedReader reader = new BufferedReader(new InputStreamReader(uconect.getInputStream()));
//doc tung dong
            String line;
            while (((line = reader.readLine()) != null)) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
