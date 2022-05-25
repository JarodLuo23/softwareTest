package com.example.Parallel;


import org.testng.annotations.Test;

public class Test1{
    @Test(timeOut =10000)
    public static void MyTest1() throws InterruptedException
    {
        for(int i=1;i<11;i++){
            System.out.print(i+" ");
            Thread.sleep(900);
        }
    }
}