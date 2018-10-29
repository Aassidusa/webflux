package com.example.demo.ddemo;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @ClassName demo
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/29 16:38
 * Version 1.0
 **/
public class demo {
    private static final AtomicLong iidGenerator = new AtomicLong(0);
    private static final LongAdder idGenerator = new LongAdder();
    public static void main(String[] args) throws InterruptedException{
        idGenerator.increment();
        Long idd = iidGenerator.incrementAndGet();
        Long id = idGenerator.longValue();

        System.out.print(idd);
 }

}
