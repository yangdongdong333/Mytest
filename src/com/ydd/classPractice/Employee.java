package com.ydd.classPractice;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

/**
 * @Package: com.ydd.classPractice
 * @ClassName: Employee
 * @Author: 13915
 * @CreateTime: 2020/11/26 15:18
 * @Description:练习类
 */
public class Employee {

    private static int nextId;
    private String name;
    private int id;
    private double salary;
    private LocalDate hireDay;

    static {
        var generator=new Random(); //构造一个新的随机数生成器
        nextId=generator.nextInt(1000);//返回一个0~n-1之间的随机数
    }
    public Employee(String name){
        this.name=name;
    }

    public Employee(double s){
        this("yang",1000); //使用this调用另一个构造器
        nextId++;
    }
    public Employee(String n,double s){
        this.name=n;
        this.salary=s;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,hireDay);//hash方法对各个参数调用Objects.hashcode（）方法
    }

    @Override
    public String toString(){
        return "name="+this.name+" id="+this.id+" salary= "+this.salary+" nextId="+nextId;
    }

}
