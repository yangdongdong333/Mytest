package com.ydd.J10ConcurrentAndSynchronized;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/10 17:25
 * @Description:
 */
public class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;
    public Bank(int n,double initiaBalance){
        accounts=new double[n];
        Arrays.fill(accounts,initiaBalance);//使用第二个参数，填充数组
        bankLock=new ReentrantLock();
        sufficientFunds= bankLock.newCondition();//创建一个条件对象
    }


    public void transfer(int from,int to,int amount) throws InterruptedException{
        bankLock.lock();
        try{
            while (accounts[from]<amount){
                sufficientFunds.await();   //如果账面金额<转账金额，则让此线程陷入等待
            }
            System.out.println(Thread.currentThread());
            accounts[from]-=accounts[from];
            System.out.printf("%10.2f from %d to %d",amount,from,to);
            accounts[to]+=accounts[to];
            System.out.printf("total Balance:%10.2f%n",getTotalBalance());
            sufficientFunds.signalAll();//解除等待线程的阻塞，让它们去竞争访问对象。
        }
        finally {
            bankLock.unlock();
        }
    }
    public double getTotalBalance(){
        bankLock.lock();
        try{
        double sum=0;
        for (double a : accounts) {
         sum=sum+a;
        }
            return  sum;
        }
        finally {
            bankLock.unlock();
        }
    }
    public int size(){
        return accounts.length;
    }

}
