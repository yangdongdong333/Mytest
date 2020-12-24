package com.ydd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/24 15:26
 * @Description:自己自定义异常,抛出处理异常
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
    public void read(String file){
        try {
            var in=new FileInputStream(file );
            int b;
            while ((b=in.read())!=-1){
                //process input
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
