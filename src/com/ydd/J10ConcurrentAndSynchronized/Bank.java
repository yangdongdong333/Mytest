package com.ydd.J10ConcurrentAndSynchronized;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/10 17:25
 * @Description:
 */
public class Bank {
    private final double[] accounts;
    private ReentrantLock bankLock=new ReentrantLock();
    public Bank(int n,double initiaBalance){
        accounts=new double[n];
        Arrays.fill(accounts,initiaBalance);//使用第二个参数，填充数组
    }


    public void transfer(int from,int to,int amount){
        bankLock.lock();
        try{
            System.out.println(Thread.currentThread());
            accounts[from]-=accounts[from];
            System.out.printf("%10.2f from %d to %d",amount,from,to);
            accounts[to]+=accounts[to];
            System.out.printf("total Balance:%10.2f%n",getTotalBalance());
        }
        finally {
            bankLock.unlock();
        }
    }
    public double getTotalBalance(){
        double sum=0;
        for (double a : accounts) {
         sum=sum+a;
        }
        return  sum;
    }
    public int size(){
        return accounts.length;
    }

}
