package lesson1.sample;

import lesson1.regular.Decorator;
import lesson1.regular.OtherClass;


public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(3, 1);
        System.out.println((Decorator.decorate(result)));
        result = OtherClass.mul(3, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(6, 2);
        System.out.println(Decorator.decorate(result));
    }

}

