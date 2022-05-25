package com.example.Parallel;

import org.testng.annotations.Test;

public class Test3 {
    @Test
    public static void MyTest3()
    {
        char ch=65;
        try {
            while(ch<=90)
            {
                System.out.println(ch++);
                Thread.sleep(315);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
