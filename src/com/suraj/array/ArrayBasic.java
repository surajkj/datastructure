package com.suraj.array;

public class ArrayBasic {

    public static void main(String[] args) {
        ArrayBasic arrayBasic = new ArrayBasic();
        arrayBasic.declaration();
        arrayBasic.initialization();
        arrayBasic.access();
        arrayBasic.length();
    }

    public void declaration(){
        // Single dimension
        int[] a;
        int b[];
        int []c;
        a = new int[5];
        b = new int[2];
        c = new int[0];
        System.out.println("A length "+a.length +" B length "+b.length+" C length "+ c.length);
        //        int[] f =new int[-3]; // NegativeArraySizeException: -3

        // Multiple dimension
        int[][][] d = new int[3][4][];
//        int[][][] e = new int[3][][4]; //']' expected
        System.out.println(d.length +" - "+ d[0].length);
    }

    public void initialization(){
        int[] a =new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
    }

    public void access(){
        int[] a = {10, 20, 30, 40};
        System.out.println("a array values "+ a[0] +" - "+a[1] +" - "+a[2]+" - "+a[3]);

        char[] ch={'a','e','i','o','u'};
        for(int i=0; i<ch.length;i++) System.out.print(ch[i]+" ");

        System.out.println("\n");
        String[] s={"Hello","world","welcome"};
        for(int i=0; i<s.length;i++) System.out.print(s[i] +" ");
        System.out.println("\n");
    }

    public void length(){
        int[] a = {10, 20, 30, 40};
        String b = "Hello world!";
        System.out.println("Array length "+ a.length +"\nString length "+b.length());
    }


}
