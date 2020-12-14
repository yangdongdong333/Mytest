package com.ydd.J10ConcurrentAndSynchronized;

import java.util.*;

/**
 * @Package: com.ydd.J10ConcurrentAndSynchronized
 * @ClassName: SychronizationWrapper
 * @Author: ydd
 * @CreateTime: 2020/12/14 18:23
 * @Description:c测试同步包装器，任何集合类可以通过使用同步包装器变成线程安全的。
 */
public class SychronizationWrapper {
    public static void main(String[] args) {
        List<String> synchArrayLsit= Collections.synchronizedList(new ArrayList<>());
       Map<String,Integer> synchHashMap= Collections.synchronizedMap(new HashMap<>());
    }
}
