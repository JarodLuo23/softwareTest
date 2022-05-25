package com.example.Parallel;

import org.testng.annotations.Test;


public class Test2 {
    @Test(timeOut = 10000)
        public static void MyTest2() throws InterruptedException{
            for(int i=1;i<11;i++)
            {
                System.out.println(i*5+" ");
                Thread.sleep(900);
            }
        }
    }

