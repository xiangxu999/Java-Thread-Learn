package me.xu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description 线程池创建线程的方式 （本质还是）
 * Date 2022/6/8 13:41
 * Version 1.0.1
 *
 * @author Wen
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new Task() {});
        }
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
