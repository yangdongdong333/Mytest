package com.ydd.J10ConcurrentAndSynchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Package: com.ydd.J10ConcurrentAndSynchronized
 * @ClassName: ThreadPoolTest
 * @Author: ydd
 * @CreateTime: 2020/12/14 19:06
 * @Description:使用FutrueTask启动线程池
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        Callable<Integer> task=new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        };
        FutureTask futureTask=new FutureTask<Integer>(task);
        var t=new Thread(futureTask);
        t.start();
        Integer integer=futureTask.get();
    }
}
