package com.tazering.test;

public class Green {

    public static void main(String[] args) {
        Green two = new Blue();
        two.method1();
    }

    public void method1() {
        System.out.println("Green");
    }
}

class Red extends Green {
    public void method2() {
        System.out.println("Red");
    }
}

class Blue extends Green {
    public void method1() {
        System.out.println("Blue");
    }
}
