package com.ydd.K11_Exception_and_Log;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/26 18:50
 * @Description:测试 Try with resource
 */
public class Try_with_resource_test {
    public static void main(String[] args) throws IOException {
        int x=0;
        try (var in=new Scanner(System.in);
             var out=new PrintWriter("out.txt", StandardCharsets.UTF_8)
             ){
               assert x>=0;//断言x是大于等于0的，只应该在测试阶段确定程序内部错误的位置
        }
    }

}
