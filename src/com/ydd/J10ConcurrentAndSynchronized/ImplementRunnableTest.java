package com.ydd.J10ConcurrentAndSynchronized;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/29 15:14
 * @Description:通过实现runnable接口，重写run方法，
 * 将实现了接口的实现类的对象作为参数传递进thread构造函数来创建线程
 */
public class ImplementRunnableTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+ "在看代码->"+i);
        }
    }




    public static void main(String[] args) {
        //创建实现类对象
        ImplementRunnableTest object=new ImplementRunnableTest();
//        Thread thread=new Thread(object);
//        thread.start();
//        创建线程对象，通过线程对象来开启我们的线程，代理
        //方便将一份实现了runnable接口的对象传入多个Thread构造器内
        new Thread(object,"小明").start();
        new Thread(object,"嗡嗡嗡").start();
        new Thread(object,"哈哈哈").start();
        for (int i = 0; i < 100; i++) {
            System.out.println("我在学习多线程->"+i);

        }
    }


}
