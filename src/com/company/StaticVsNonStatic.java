package com.company;

public class StaticVsNonStatic {
    public static void main(String[] args){
        Demo firstDemo = new Demo();

        Demo secondDemo = new Demo();
        secondDemo.incrementCount();

        System.out.println("Static count is: " + Demo.getStaticCount());
        System.out.println("First count is: " + firstDemo.getCount());
        System.out.println("Second count is: " + secondDemo.getCount());

        //This line won't complile
        //System.out.println("Count is: " + Demo.getCount());

        // But we can access static methods from an instance
        System.out.println("Static count is: " + firstDemo.getStaticCount());
    }
}

class Demo{
    private static int staticCount = 1;
    private int count = 0;

    public Demo(){
        staticCount++;
        count++;
    }

    public static int getStaticCount() {return staticCount;}

    public static void incrementStaticCount(){ staticCount++; }

    public int getCount() { return count;}

    public void incrementCount(){ count++; }
}
