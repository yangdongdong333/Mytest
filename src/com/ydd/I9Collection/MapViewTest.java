package com.ydd.I9Collection;

import com.ydd.classPractice.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Package: com.ydd.I9Collection
 * @ClassName: MapViewTest
 * @Author: ydd
 * @CreateTime: 2020/12/8 22:00
 * @Description:测试映射视图；得到key集，value集，等
 */
public class MapViewTest {
    public static void main(String[] args) {
        var map=new HashMap<String, Employee>(); //HashMap实现了Map接口
        var harry=new Employee("harry hacker");
        var alice=new Employee("alice");
        var snow=new Employee("snow");
        map.put("987",harry);
        map.put("111",alice);
        map.put("222",snow);
        map.put(null,alice);  //允许键为空
        Employee e=map.get(987); //得到键对应的值
        Set<String> keys=map.keySet(); //得到一个key集合
        for (Map.Entry<String, Employee> entry:map.entrySet()//枚举映射条目可以同事查看key和value的值
        ){
            String k=entry.getKey();
            Employee v=entry.getValue();
            System.out.print(k);
            System.out.print("-> ");
            System.out.print(v);
            System.out.println();
        }


    }
}
