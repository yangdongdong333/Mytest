package com.ydd.J10ConcurrentAndSynchronized;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/30 15:21
 * @Description:线程创建方式3：实现callable接口
 */
public class ImplementCallableTest implements Callable<Boolean> {
    private String url; //网络图片地址
    private String name;//保存的文件名

    public ImplementCallableTest(String url, String name) {
        this.url = url;
        this.name = name;
    }
    @Override
    public Boolean call() throws Exception {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(this.url,this.name);
        System.out.println("下载了文件名为："+name+" 的文件");
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ImplementCallableTest t1=new ImplementCallableTest("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1091405991,859863778&fm=26&gp=0.jpg","labixiaoxin1.jpg");
        ImplementCallableTest t2=new ImplementCallableTest("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1091405991,859863778&fm=26&gp=0.jpg","labixiaoxin2.jpg");
        ImplementCallableTest t3=new ImplementCallableTest("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1091405991,859863778&fm=26&gp=0.jpg","labixiaoxin3.jpg");
//1,创建线程服务
        ExecutorService ser= Executors.newFixedThreadPool(3);
//2,提交执行
        Future<Boolean> r1=ser.submit(t1);
        Future<Boolean> r2=ser.submit(t2);
        Future<Boolean> r3=ser.submit(t3);
        //3获取结果
        boolean resultSet1=r1.get();
        boolean resultSet2=r2.get();
        boolean resultSet3=r3.get();
        //4关闭服务
        ser.shutdownNow();
    }


}


