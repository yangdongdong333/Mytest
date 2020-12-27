package com.ydd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/24 15:26
 * @Description:自己自定义异常,抛出处理异常
 * 2，捕获知道该如何让处理的异常、继续传播不知道该如何让处理的异常
 */
public class ExceptionTest {
    public static void main(String[] args) {

    }
    //定义会抛出异常的方法
    String readData(Scanner in ) throws FileFormatException{
        int n=0;
        int len=100;
        while (n<=len){
            if (in.hasNext()){
                if (n<len){
                    throw  new FileFormatException();
                }
            }
            else{

            }
        }
        return "s";
    }

//捕获异常
    //典型的读取数据的代码
    public void read(String file) throws IOException{ //throws说明符提醒调用者这个方法可能会抛出异常
        try {
            var in=new FileInputStream(file );
            int b;
            while ((b=in.read())!=-1){
                //process input
            }
        } catch (FileNotFoundException | UnknownHostException e) {   //捕获的异常类型彼此之间不存在子类关系时才可以合并
            e.printStackTrace();
            System.out.println(e.getMessage());  //获取更多信息
            System.out.println(e.getClass().getName());//获取更多信息
        }
//        catch(SQLException e)
//        {
//           throw new ServletException("database error"+e.getMessage());
//        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//创建自定义的异常
class FileFormatException extends IOException{
    public FileFormatException(){};
    public FileFormatException(String gripe)
    {
        super(gripe);
    }

}
class ServletException extends SQLException{
    public ServletException(){};
    public ServletException(String gripe)
    {
        super(gripe);
    }

}
