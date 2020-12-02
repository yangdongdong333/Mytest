package com.ydd.BaseTest;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;

import static java.lang.Math.*;
public class Base {
    enum Size{SMALL,MEDIUM,LARGE,EXTRA_LARGE};
    public static void main(String[] args) {
        System.out.println("hello");
        final int CHANGLIANG=12;
        double x=Math.sqrt(4);
        System.out.println(x);
        double y=Math.pow(3,2*PI);
        System.out.println(y);
        //浮点数舍入运算
        double a=9.9;
        int b=(int)Math.round(a);//取一个最接近的整数
        System.out.println(b);
        System.out.println(a<b?"xiao":false);
        int c=0b10>>1;
        System.out.println(c);
        System.out.println("HELLO".equalsIgnoreCase("hello"));
        System.out.println("HELLO".codePointCount(0,5));//获得码点数量
        int index="hello".offsetByCodePoints(0,4);
        //闭区间,从0后的第一个开始往后的第四个代码单元的码点索引
        System.out.println(index);//4
        int cp="hello".codePointAt(index);
        System.out.println(cp); //111
        System.out.println("--------------");
        int [] codePoint="hello".codePoints().toArray();
        for (int i = 0; i < codePoint.length; i++) {
            System.out.println(codePoint[i]); //104,101,108,108,111
        }
        System.out.println("-------按字典顺序比较大小，前-后-------");
        System.out.println("hello".compareTo("hellp")); //-1
        System.out.println("\u0020");
        System.out.println("-----StringBuilder----");
        StringBuilder sb=new StringBuilder();
        sb.append("1");
        sb.append("2");
        System.out.println(sb.toString());
        System.out.println("----输入输出流----");
//        Scanner in=new Scanner(System.in);
//        String s =in.next();
        System.out.println(1000.0/3.0);
        System.out.println("------读取文件-------");
//        Path path;
//        Scanner s=new Scanner(, StandardCharsets.UTF_8);
//        String s="";
        switch (index) //可以是字符串字面量
        {
            case 1:
                System.out.println("zheshi1");break;
            case 2:
                System.out.println("zheshi2");break;
//            case "1":
//                System.out.println("zheshi2");break;//可以是字符串字面量
        }
        System.out.println("-----------带标签的语句块-------------");
        read_index:
        while (true)
        {
            if (index>0)
            break read_index;
        }
        System.out.println("-----------大数-------------");
        BigInteger bi=BigInteger.valueOf(100);//构造方法
        System.out.println(bi);
        BigInteger bigInteger=new BigInteger("123456789");
        System.out.println(bigInteger);
        System.out.println("-----------数组-------------");
        int [] shu=new int[10];
        int shuzu []=new int[10];
        int [] kuoZhangShuZu = {1,5,3,7,};//提供一个初始化的数组
        System.out.println("-----------打印数组-------------");
        System.out.print(Arrays.toString(kuoZhangShuZu));
        for (int aa:kuoZhangShuZu)
        System.out.println(aa);
        System.out.println("-----------判断args数组里面的内容-------------");
        if (args.length==0||args[0].equals("-h"))
        System.out.println("-h");
        else if(args[0].equals("-g"))
        {
            System.out.println("-g");
        }
        for (int i = 1; i <args.length ; i++) {
            System.out.println(" "+args[i]);
        }
        System.out.println("!");
        System.out.println("--------数组排序---------");
        Arrays.sort(kuoZhangShuZu);//返回空值,使用了优化过的快速排序
        System.out.println(Arrays.toString(kuoZhangShuZu));
        int n=10;
        int r= (int)Math.random()*n;
        System.out.println(r);
        //日期类
        Date date=new Date();
        System.out.println(date.toString());
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1=LocalDate.of(2020,11,10);
        System.out.println(localDate1);
        System.out.println(localDate1.plusDays(100));







    }
}
