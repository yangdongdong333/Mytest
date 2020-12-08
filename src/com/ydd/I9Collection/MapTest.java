package com.ydd.I9Collection;

import java.util.HashMap;
import com.ydd.Lei.*;
import com.ydd.classPractice.Employee;

/**
 * @Package: com.ydd.I9Collection
 * @ClassName: MapTest
 * @Author: ydd
 * @CreateTime: 2020/12/8 16:48
 * @Description:测试映射HashMap，允许key为null
 */
public class MapTest {
    public static void main(String[] args) {
        var staff=new HashMap<String, Employee>(); //HashMap实现了Map接口
        var harry=new Employee("harry hacker");
        var alice=new Employee("alice");
        var snow=new Employee("snow");
        staff.put("987",harry);
        staff.put("111",alice);
        staff.put("222",snow);
        staff.put(null,alice);  //允许键为空
        Employee e=staff.get(987); //得到键对应的值


        staff.forEach((k,v)-> System.out.println("key="+k+",value="+v));//映射中的每一项会依序调用lamda表达式
        staff.merge("word",1,Integer::sum);


    }
}
