package com.ydd.K11_Exception_and_Log;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/26 19:14
 * @Description:
 */
public class Log_Test {
    //通常情况下，日志记录器有7个级别：severe,warning,info,config,fine,finer,finest ,默认情况下，只记录前三个级别
    private static final Logger myLogger=Logger.getLogger("com.ydd.myapp");
    public static void main(String[] args) {
        //取消所有的日志
//        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().info("File-> Open menu item selected");
        myLogger.warning("warning");//所有级别的日志都有记录的方法
        myLogger.fine("fine");
        myLogger.log(Level.FINER,"finer");//或者使用log方法指定级别



    }

}
