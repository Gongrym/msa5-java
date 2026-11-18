package org.example.e06oop;

public class Whale {
    // 필드 (Field)
    public String name = "고래"; // 인스턴스 변수
    // Whale 클래스에 접근해야만 사용할 수 있는 변수
    public static int age = 20;
    // static은 인스턴스를 생성하기 이전에 미리 메모리에 올려놔서, 인스턴스를 생성하지 않아도 호출/접근 가능

    // 메소드 (Method)
    public void swimming() {
        System.out.println("고래가 헤엄칩니다.");
    }
}
