package com.thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main p = new Main();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        p.generate(num);
    }
    public void generate(int n)
    {
        boolean flag=false;
        while (n%2 == 0)
        {
            n = n/2;
            flag=true;
        }
        if(flag)
            System.out.print("2,");

        for (int i = 3; i <= java.lang.Math.sqrt(n); i = i+2)
        {
            flag=false;
            while (n%i == 0)
            {
                flag=true;
                n = n/i;
            }
        if(flag)
            System.out.print(i+",");
        }

        if (n > 2)
            System.out.print(n);;
    }
}
