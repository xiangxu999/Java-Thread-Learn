package me.xu.thread;

/**
 * Description 同时使用两种方式
 * Date 2022/6/7 16:57
 * Version 1.0.1
 *
 * @author Wen
 */
public class BothStyle {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        }) {
            @Override
            public void run() {
                System.out.println("Thread");
            }
        }.start();
    }
}
