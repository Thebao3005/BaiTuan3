/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3;

/**
 * TIen trinh treo
 *
 * @author Baobu
 */
public class VD4 {

    private final Object lc = new Object();

    public synchronized void phuongThuc1() {
        //phuong thuc nay dang bi trreo
    }

    public synchronized void phuongThuc2() {
        synchronized (lc) {

        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
        });
        thread.start();//bat dau tien trinh
        try {
            thread.join();//cho tien trinh khac hoan thanh thi thuc hien
        } catch (Exception e) {
        }
    }
}
