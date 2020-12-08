package com.ydd.I9Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Package: com.ydd.I9Collection
 * @ClassName: QueueTest
 * @Author: 13915
 * @CreateTime: 2020/12/8 15:28
 * @Description:
 */
public class QueueTest {
    public static void main(String[] args) {
        var staff=new ArrayBlockingQueue<String>(5);  //阻塞队列
        staff.offer("1");
        staff.offer("2");
        staff.offer("3");
        staff.offer("4");
        System.out.println(staff.peek());//只取，但不删除，如果队列空，返回null
        System.out.println(staff.offer("5"));//添加元素，如果队列已满，则返回false
        System.out.println(staff.poll());//删除并返回队列头部一个元素，为空则返回null
        System.out.println(staff.peek());

        var sta=new LinkedList<String>();//linkedlist实现了queue接口，deque（双端队列）接口
        var s=new ArrayDeque<String>();//默认的初始容量为16

    }
}
