package com.ydd.F6InterfaceTest;

/**
 * @Package: com.ydd.F6InterfaceTest
 * @ClassName: PrivateMethodInInterfaceTest
 * @Author: 13915
 * @CreateTime: 2020/12/1 11:31
 * @Description:测试接口中的私有方法，在JAVA9中可以在接口中定义私有方法，作为其他接口中方法的辅助方法。
 */
public interface PrivateMethodInInterfaceTest {
    int i=0;
    public abstract int method1();
    private void method2(){ //在里面应当有具体实现，作为其他类的辅助方法

    }

}
