package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly=new RWOnly();
//        rwOnly.name="Tushar";
//        System.out.println(rwOnly.name);
        //error
        rwOnly.setName("Tushar");
        String name= rwOnly.getName();
    }
}