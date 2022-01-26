package com.company;
import java.util.Scanner;

public class Swap
{int x,y;
    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    private void process()
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping x: "+x+" y:"+y);
    }
    public static void main (String[] args)
    {
        Swap S= new Swap();
        S.input();
        S.process();
    }
}
