package com.ydd.SuanFa;

import com.ydd.classPractice.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.logging.LogManager;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/9 12:00
 * @Description:排序与混排
 */
public class PaiXuYuHunPai {
    public static void main(String[] args) {
        var staff=new LinkedList<String>();
        staff.add("1");
        staff.add("3");
        staff.add("2");
        Collections.reverseOrder();//返回一个降序排列的比较器
        staff.sort(Collections.reverseOrder());
        System.out.println(staff.toString());//[3, 2, 1]

        Collections.sort(staff);//默认升序排列
        System.out.println(staff.toString());//[1, 2, 3]
        var staff1=new LinkedList<Employee>();

        staff1.add(new Employee("harry hacker"));
        staff1.sort(Comparator.comparingDouble(Employee::getSalary).reversed());//按照工资逆序排列

        Collections.binarySearch(staff,"2");//使用二分查找

        String [] values=staff.toArray(new String[0]);

        ArrayList<String> loggernames=Collections.list(LogManager.getLogManager().getLoggerNames()); //将内容保存到list里面


    }

}
