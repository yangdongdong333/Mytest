package com.ydd;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @Package: com.ydd
 * @ClassName: ReflectionTest
 * @Author: 13915
 * @CreateTime: 2020/11/29 16:49
 * @Description:测试反射
 */
public class ReflectionTest {
    public static void main(String[] args) throws ReflectiveOperationException{
        String name;
        if (args.length>0)
            name=args[0];
        else
        {
           var in=new Scanner(System.in);
            System.out.println("please input class name");
           name= in.next();//读取到空白符就停止，比如空格，回车，tab等，而nextline是到回车停止
        }
        //输出类名和超类的名字
        Class cl=Class.forName(name);
        Class supercl=cl.getSuperclass();
        String modifier= Modifier.toString(cl.getModifiers());
        System.out.println("**************************");
        if (modifier.length()>0){
            System.out.println("modifier= "+modifier);
        }
        System.out.println("class = "+name);
        if (supercl!=null&&supercl!=Object.class) //非空，非Object对象
            System.out.println( "extends "+supercl.getName());
        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFileds(cl);
        System.out.println("}");

    }
    public static void printConstructors(Class cl){
        Constructor[] constructors=cl.getConstructors();//返回一个由构造器组成的，元素为引用了构造器对象的变量的数组。
        for (Constructor c:constructors
             ) {
            String name=c.getName();//获取构造器名
            System.out.print("    ");
            String modifier=Modifier.toString(c.getModifiers());//打印修饰符
            if (modifier.length()>0) System.out.print(modifier+ " ");
            System.out.print(name+"(");
            Class [] paramTypes=c.getParameterTypes();
            for (int i=0;i<paramTypes.length;i++){
                if (i>0) System.out.print(paramTypes[i].getName());
                System.out.println(");");
            }
        }
    }
    public static void printMethods(Class cl){
    Method [] method=cl.getDeclaredMethods();
    for (Method m:method
         ) {
        Class retType =m.getReturnType();
        String name=m.getName();
        System.out.print("   ");
        //输出
        String modifier=Modifier.toString(cl.getModifiers());
        if (modifier.length()>0) System.out.print(modifier+" ");//打印修饰符
        System.out.print(retType.getName()+" "+name+"(");  //打印返回类型
        //输出参数
       Class [] paramtertType= m.getParameterTypes();
        for (int i = 0; i < paramtertType.length; i++) {
            if (i >0) System.out.print(", ");
            System.out.print(paramtertType[i].getName()); //循环打印参数
        }
        System.out.print(");\n");

    }

}
    public static void printFileds(Class cl){
        Field [] fields=cl.getDeclaredFields();
        for (Field f:fields
             ) {
            Class type=f.getType();
            String name=f.getName();
            System.out.println("   ");
            String modifier=Modifier.toString(f.getModifiers());
            if (modifier.length()>0) {
                System.out.print(modifier+" "+type+" "+name+";");
            }
        }
    }
}
