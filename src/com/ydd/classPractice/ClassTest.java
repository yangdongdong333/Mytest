package com.ydd.classPractice;
import java.util.Random;
import java.time.*;

/**
 * @Package: PACKAGE_NAME
 * @ClassName: ClassTest
 * @Author: 13915
 * @CreateTime: 2020/11/14 11:25
 * @Description:
 */

public class ClassTest {
        public static void main (String[] args) throws Exception{
            var message=new StringBuilder();//只能为局部变量自动赋值
            Employee employee=new Employee(100);
            System.out.println(employee.toString());
            LocalDate ld=LocalDate.now();
            System.out.println(ld);

            System.out.println(employee.getClass().getName()+"   "+employee.getClass());
            //com.ydd.classPractice.Employee   class com.ydd.classPractice.Employee
            var classname="java.util.Random";
            Class cl=Class.forName(classname);
//            Object 0b=cl.getConstructor().newInstance();



        }
}
