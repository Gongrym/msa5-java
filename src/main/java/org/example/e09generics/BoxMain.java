package org.example.e09generics;

public class BoxMain {
    Box<int[]> boxIntArr = new Box<>();

    public static void main(String[] args) {
        Box<int[]> boxIntArr = new Box<>(); // 다이아몬드 연산잔 (<>)가 클래스명과 함께 타입을 명명하는데의 일부로 쓰인다.
        Box<String[]> boxStringArr = new Box<>(); // 위는 int배열, 이건 String배열이 타입이 되는것.
        // Box<int> << 이렇게 선언하면 오류난다. < > 안에는 참조형만 써야한다 함. int는 Integer라는 참조타입이 있다 함.
        Box<Integer> boxInt = new Box<>();

        // // <자동형변환: autocasting>
        // Integer a = 1;
        // int b = a; // 자료형이 다르지만 자바가 자동으로 맞춰줌
        // int b = a.intValue(); // 원래 이렇게 해야함

        // -/ 제네릭의 <T>에서 T는 마음대로 정해도 되나?
        // 맞아. 네가 원하는 이름으로 정해도 돼. T라는 알파벳 자체에는 특별한 기능이 없어.

        // BoxRestrict<Tv> boxRestric1t = new BoxRestrict<>();
        // BoxRestrict<Mobile> boxRestrict2 = new BoxRestrict<>();
        // BoxRestrict<Novel> boxRestrict3 = new BoxRestrict<>();
    }
}