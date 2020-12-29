package com.ydd.J10ConcurrentAndSynchronized;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/29 19:05
 * @Description:多个线程同时操作同一个对象：买火车票的例子
 */
//问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class MutipliThreadVisitA_object implements Runnable{
    //票数
   private int ticketNums=10;
    @Override
    public void run() {
        while (true){
            if (ticketNums<=0) break;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第 "+ticketNums+" 张票");
            ticketNums--;
        }

    }
    public static void main(String[] args) {
        MutipliThreadVisitA_object resource=new MutipliThreadVisitA_object();
        new Thread(resource,"小明").start();
        new Thread(resource,"老师").start();
        new Thread(resource,"黄牛").start();
    }
}
