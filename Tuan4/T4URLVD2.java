/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Baobu
 */
public class T4URLVD2 {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
//mo ket noi den url
            URLConnection uconect = url.openConnection();
//doc du lieu tu ket noi
            BufferedReader reader = new BufferedReader(new InputStreamReader(uconect.getInputStream()));
            FileWriter fw = new FileWriter("output.html");
//doc tung dong
            String line = "";
            while (((line = reader.readLine()) != null)) {
                //ghi vao file
                fw.write(line + "/n");
            }
            reader.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
