package com.sabari.java8.defaultmethod;


@FunctionalInterface
public interface Interface1 {

    void getUserNameById (String id) throws Exception;
    
   default void getUserIdBuName (String name) throws Exception{
        System.out.println("Hello all i'm from interface ... do u believe...Yeah ... Since java 1.8 onwords..."+name);
    }
   
   default void log(String log){
       System.out.println("Print the log I1"+log);
   }
   
   static void print(String log){
       System.out.println("Print the log I1"+log);
   }
}
