package com.pack1;
import java.util.ArrayList;

public class arraylist {

 void meth1()
    {
        System.out.println("implementing Array list");
       ArrayList raj= new ArrayList();
        raj.add(10);
        raj.add(100);
        raj.add("java");
        raj.add("rajesh");
        System.out.println(raj);


    }


    public static void main(String[] args) {
        arraylist aobj=new arraylist();
        aobj.meth1();
    }
    }

