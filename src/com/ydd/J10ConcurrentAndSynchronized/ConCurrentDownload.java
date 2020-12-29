package com.ydd.J10ConcurrentAndSynchronized;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @Author: yangdongdong
 * @CreateTime: 2020/12/28 19:11
 * @Description:练习Thread，测试多线程下载图片
 */
public class ConCurrentDownload extends Thread{
    private String url; //网络图片地址
    private String name;//保存的文件名

    public ConCurrentDownload(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(this.url,this.name);
        System.out.println("下载了文件名为："+name+" 的文件");
    }

    public static void main(String[] args) {
        ConCurrentDownload t1=new ConCurrentDownload("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1091405991,859863778&fm=26&gp=0.jpg","labixiaoxin1.jpg");
        ConCurrentDownload t2=new ConCurrentDownload("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1091405991,859863778&fm=26&gp=0.jpg","labixiaoxin2.jpg");
        ConCurrentDownload t3=new ConCurrentDownload("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1091405991,859863778&fm=26&gp=0.jpg","labixiaoxin3.jpg");

        t1.start();
        t2.start();
        t3.start();
        float a=0;


    }
}
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
