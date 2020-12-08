package com.ydd;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Package: com.ydd
 * @ClassName: I9Collection
 * @Author: ydd
 * @CreateTime: 2020/12/8 8:44
 * @Description:
 */
public class I9Collection {
    public static void main(String[] args) {
        var staff=new LinkedList<String>();
        staff.add("A");
        staff.add("B");
        staff.add("C");
        ListIterator<String> it= staff.listIterator();
        ListIterator<String> itn= staff.listIterator(1);//迭代器位置位于下标为1的linked之前
        System.out.println(itn.next());
        it.next();
        it.add("D");
    }
}
