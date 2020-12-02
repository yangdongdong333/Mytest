package BaseTest;

import org.w3c.dom.ls.LSOutput;

/**
 * @Package: BaseTest
 * @ClassName: EnumTest
 * @Author: ydd
 * @CreateTime: 2020/11/29 8:51
 * @Description:
 */
public class EnumTest {
    enum Size{AS,BS,CCS};//构造
    public static void main(String[] args) {
       //赋值
        Size s=Enum.valueOf(Size.class,"AS");
        System.out.println(s);
        //values方法，返回一个包含全部枚举值的数组。
        Size [] size =Size.values();
        for (Size e:size
             ) {
            System.out.println(e);
        }
        //ordinal方法返回枚举值的下标
        System.out.println(Size.AS.ordinal());
        //compareTo方法，返回this下标减去参数值下标的值
        System.out.println(Size.AS.compareTo(Size.CCS));//0-2 = -2
    }

}

