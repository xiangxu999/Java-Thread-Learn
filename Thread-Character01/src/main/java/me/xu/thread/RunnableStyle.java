package me.xu.thread;

/**
 * Description 使用Runnable方式创建线程
 * Date 2022/6/7 16:27
 * Version 1.0.1
 *
 * @author Wen
 */
public class RunnableStyle implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("使用Runnable方式创建线程");
    }
}
