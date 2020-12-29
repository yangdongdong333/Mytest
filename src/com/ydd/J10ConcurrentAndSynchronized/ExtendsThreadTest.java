package com.ydd.J10ConcurrentAndSynchronized;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/28 18:41
 * @Description:继承Thread类，重写run方法，调用start开启线程
 * 总结：线程开启后不一定立即执行，由CPU调度执行
 */
public class ExtendsThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码->"+i);
        }
    }

    public static void main(String[] args) {
        ExtendsThreadTest thread=new ExtendsThreadTest();
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程->"+i);
        }

    }
}
