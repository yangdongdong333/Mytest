package Lei;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Package: Lei
 * @ClassName: Employee
 * @Author: ydd
 * @CreateTime: 2020/11/9 18:16
 * @Description:练习类
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
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
    public String toString() {
        return getClass().getName()+"[name="+name;
    }
}
