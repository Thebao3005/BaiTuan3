/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3;

/**
 *
 * @author Baobu
 */
public class VD5 {

    private final Object monitor = new Object();

    public void Wait() throws InterruptedException {
        synchronized (monitor) {
            monitor.wait();
        }
    }

    public void notifySignal() {
        synchronized (monitor) {
            monitor.notify();
        }
    }
}
