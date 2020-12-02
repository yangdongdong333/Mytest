package Lei;

import java.time.LocalDate;

/**
 * @Package: Lei
 * @ClassName: Manager
 * @Author: ydd
 * @CreateTime: 2020/11/21 20:42
 * @Description:
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, LocalDate hireday){

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return bonus+super.getSalary();//指示编译器调用父类方法
    }
}
