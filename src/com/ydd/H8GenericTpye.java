package com.ydd;

import com.sun.source.doctree.BlockTagTree;

import java.time.LocalDate;

/**
 * @Package: com.ydd
 * @ClassName: H8GenericTpye
 * @Author: ydd
 * @CreateTime: 2020/12/6 23:14
 * @Description:练习泛型类型
 */
public class H8GenericTpye {
    public static void main(String[] args) {
        String middle=ArayAlg.<String>getMiddle("John","Q","Public"); //调用泛型方法
        System.out.println(middle);
        System.out.println(LocalDate.of(2020,2,17));

    }
}

class Pair <T>{
    private T first;
    private T second;

    public Pair(){
        first=null;
        second=null;
    }
    public Pair (T first,T second){
        this.first=first;
        this.second=second;
    }
    public T getFirst(){return first;}
    public T getSecond(){return second;}
    public void setFirst(T newValue){first=newValue;}
    public void setSecond(T newValue){second=newValue;}
}
class ArayAlg{
    public static Pair<String> minmax(String [] a){
        if (a==null||a.length==0) return null;
        String min=a[0];
        String max=a[0];
        for (int i=1;i< a.length;i++){
            if (min.compareTo(a[i])>0) min=a[i];
            if (max.compareTo(a[i])<0) max=a[i];
        }
        return  new Pair<>(min,max);
    }
    public static <T extends Comparable> T min(T [] a){ //限制T只能为实现了Comparable接口的的类
        if (a==null||a.length==0) return null;
        T min=a[0];

        for (int i=1;i< a.length;i++){
            if (min.compareTo(a[i])>0) min=a[i];

        }
        return  min;
    }
    public static <T> T getMiddle(T... a){    //定义泛型方法，泛型的类型放在修饰符之后，返回类型之前
                                              //&用来分隔限定类型，“，”用来分割类型变量
        return a[a.length/2];
    }
}