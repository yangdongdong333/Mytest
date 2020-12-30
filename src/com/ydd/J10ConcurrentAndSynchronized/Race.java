package com.ydd.J10ConcurrentAndSynchronized;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/30 9:09
 * @Description:模拟龟兔赛跑
 */
public class Race implements Runnable{
private static String winner;
    @Override
    public void run()
    {
        for (int i = 0; i <= 100; i++)
        {
            if (gameOver(i)){
                break;
            }
            if (Thread.currentThread().getName().equals("兔子") &&i%30==0)
            {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

           System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"米");

        }
    }
    public boolean gameOver(int steps){
        if (winner != null) {//有胜利者，比赛结束
            return true;
        }
        else
        {
            if (steps >= 100) {
                winner=Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race=new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
