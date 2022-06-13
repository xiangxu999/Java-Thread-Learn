package me.xu.thread;

/**
 * Description start和run方法启动线程
 * Date 2022/6/13 11:14
 * Version 1.0.1
 *
 * @author Wen
 */
public class StartAndRunMethod {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        runnable.run();

        new Thread(runnable).start();
    }
}
