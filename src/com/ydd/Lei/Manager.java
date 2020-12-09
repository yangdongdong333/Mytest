package Lei;

import java.time.LocalDate;
import com.ydd.classPractice.*;

/**
 * @Package: Lei
 * @ClassName: Manager
 * @Author: ydd
 * @CreateTime: 2020/11/21 20:42
 * @Description:
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    public Manager(double s, double bonus) {
        super(s);
        this.bonus = bonus;
    }

    public Manager(String n, double s, double bonus) {
        super(n, s);
        this.bonus = bonus;
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
