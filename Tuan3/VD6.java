/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3;

/**
 *
 * @author Baobu
 */
public class VD6 {

    private final Object monitor = new Object();
    private boolean isDataReady = false;

    public void productData() throws InterruptedException {
        synchronized (monitor) {
            while (isDataReady) {
                monitor.wait();
            }

            System.out.println("San xuat data");
            Thread.sleep(2000);
            //set trang thais du lieu
            isDataReady = true;
            if (isDataReady) {
                monitor.notify();
            }
        }
    }

    public void useData() throws InterruptedException {
        synchronized (monitor) {
            while (!isDataReady) {
                monitor.wait();
            }

            System.out.println("Su dung du lieu....");
            Thread.sleep(3000);
            isDataReady = false;
            monitor.notify();
        }
    }

    public static void main(String[] args) {
        VD6 ex = new VD6();
        Thread thsanxuat = new Thread(() -> {
            try {
                while (true) {
                    ex.productData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread thsudung = new Thread(() -> {
            try {
                while (true) {
                    ex.useData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thsanxuat.start();
        thsudung.start();

    }
}
