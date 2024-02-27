package org.example;

import java.util.Arrays;

public class Main {
    String name;
    int age;

    //コンストラクタ
    Main(String name , int age){
        this.name = name;
        this.age =age;
    }
}
    public static void main(String[] args) {
        Man h = new Man("田邉" , 36);
        System.out.println("名前は" + h.name + "です" );
        System.out.println("年齢は" + h.age + "歳です" );

        Man h2 = new Man("江口" , 36);
        System.out.println("名前は" + h2.name + "です" );
        System.out.println("年齢は" + h2.age + "歳です" );

        Man h3 = new Man("辻村" , 35);
        System.out.println("名前は" + h3.name + "です" );
        System.out.println("年齢は" + h3.age + "歳です" );

        Man h4 = new Man("高村" , 36);
        System.out.println("名前は" + h4.name + "です" );
        System.out.println("年齢は" + h4.age + "歳です" );


    }
