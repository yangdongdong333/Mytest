package com.ydd.J10ConcurrentAndSynchronized;

import java.io.IOException;
import java.nio.file.*;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @Package: com.ydd.J10ConcurrentAndSynchronized
 * @ClassName: ExecutorDemo
 * @Author: ydd
 * @CreateTime: 2020/12/15 12:33
 * @Description:使用callable和执行器
 */
public class ExecutorDemo {
    /**
     *
     * @param word 需要搜索次数的特定单词
     * @param path 在这个路径下搜索特定单词
     * @return 返回这个特定单词在特定路径下的出现次数
     */
    public static long occurrences(String word, Path path)
    {
        try(var in=new Scanner(path))
        {
            int count=0;
            while (in.hasNext())
            {
                if (in.next().equals(word))
                    count++;
            }
            return count;
        }
        catch (IOException ex)
        {
            return 0;
        }
    }
  public static Set<Path> descendants(Path rootdir)
    {
        try (Stream<Path> entries= Files.walk(rootdir))
        {
            return entries.filter(Files::isRegularFile).collect(Collectors.toSet());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static Callable<Path> searchForTask(String word,Path path)
    {
        return ()->
        {
            try(var in=new Scanner(path))
            {
                while (in.hasNext())
                {
                    if (in.next().equals(word)) return path;
                    if (Thread.currentThread().isInterrupted())
                    {
                        System.out.println("search in "+path+" canceled.");
                        return  null;
                    }
                }
                throw new NoSuchElementException();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException,NullPointerException {
     try(var in=new Scanner(System.in))
     {
         System.out.print("enter base directory (e.g. /opt/jdk-9-src): ");
         String start=in.nextLine();
         System.out.print("enter a keyword (e.g. volatile): ");
         String word=in.nextLine();

         Set<Path> files=descendants(Path.of(start));
         List<Callable<Long>> tasks=new ArrayList<>();
         for (Path file:files)
         {
             Callable<Long> task=()-> occurrences(word,file);
             tasks.add(task);
         }

         ExecutorService executor= Executors.newCachedThreadPool();
         Instant startTime=Instant.now();
         List<Future<Long>> results=executor.invokeAll(tasks);
         long total=0;
         for(Future<Long> result:results)
         {
             total+=result.get(); //获取结果
         }

     }
    }

}
