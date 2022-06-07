package me.xu.thread;

/**
 * Description 继承Thread类
 * Date 2022/6/7 16:31
 * Version 1.0.1
 *
 * @author Wen
 */
public class ThreadStyle extends Thread {

    @Override
    public void run() {
        System.out.println("继承Thread类实现线程");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
