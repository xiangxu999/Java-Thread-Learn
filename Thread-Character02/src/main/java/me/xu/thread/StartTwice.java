package me.xu.thread;

/**
 * Description 启动线程两次报错
 * Date 2022/6/13 11:26
 * Version 1.0.1
 *
 * @author Wen
 */
public class StartTwice {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }
}
