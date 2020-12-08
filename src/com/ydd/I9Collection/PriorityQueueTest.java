package com.ydd.I9Collection;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @Package: com.ydd.I9Collection
 * @ClassName: PriorityQueueTest
 * @Author: 13915
 * @CreateTime: 2020/12/8 16:26
 * @Description:测试优先级队列
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        var pq=new PriorityQueue<LocalDate>();
        pq.offer(LocalDate.of(1906,12,9));
        pq.offer(LocalDate.of(1815,12,10));
        pq.offer(LocalDate.of(1903,12,3));
        pq.offer(LocalDate.of(1910,6,22));

        for (LocalDate Date :pq
             ) {
            System.out.println(Date);
        }
        System.out.println("  remove ************");
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
