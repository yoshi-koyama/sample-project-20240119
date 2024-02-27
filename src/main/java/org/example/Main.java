package org.example;


public class Main {
    public static void main(String[] args) {
        Man h = new Man("田邉", 36);
        System.out.println("名前は" + h.getName() + "です");
        System.out.println("年齢は" + h.getAge() + "歳です");

        Man h2 = new Man("江口", 36);
        System.out.println("名前は" + h2.getName() + "です");
        System.out.println("年齢は" + h2.getAge() + "歳です");

        Man h3 = new Man("辻村", 35);
        System.out.println("名前は" + h3.getName() + "です");
        System.out.println("年齢は" + h3.getAge() + "歳です");

        Man h4 = new Man("高村", 36);
        System.out.println("名前は" + h4.getName() + "です");
        System.out.println("年齢は" + h4.getAge() + "歳です");
    }
}
