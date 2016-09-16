package com.sabari.java8.defaultmethod;

public class MyInterfaceClass implements Interface1, Interface2 {

    @Override
    public void message(String msg) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getUserNameById(String id) throws Exception {
        // TODO Auto-generated method stub
    }
    
    @Override
    public void log(String log){
        System.out.println("Print log from MyInterfaceClass"+log);
        Interface1.print(log);
    }

}
