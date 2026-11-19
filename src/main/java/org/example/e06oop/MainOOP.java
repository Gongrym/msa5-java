package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;
import org.example.e06oop.inheritance.Whale;

public class MainOOP {
    public static void main(String[] args) {
        // Whale whale = new Whale();
        // 첫번째 Whale: 자료형(참조형), 두번째 whale: 변수, 세번째 Whale(): 생성자 메소드, new: 객체화 키워드
        // 두번째 whale은 변수인데, 거기에 Whale() 생성자로 만든 실제 웨일 객체의 주소 담기는것이다.
        // System.out.println(whale.name);
        // System.out.println(Whale.age);
        // whale.name = "골애";
        // System.out.println(whale.name);

        // AccessModifier accessModifier = new AccessModifier();

        // 오버로딩
        // 메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        // System.out.println();
        // System.out.println(OverloadingOOP.add(1, 2));
        // System.out.println(OverloadingOOP.add(1));

        // 11-19

        FlyingFish flyingFish = new FlyingFish("날치", "바다");
        System.out.println(flyingFish.breath());
        System.out.println(flyingFish.flying());
        System.out.println(flyingFish.living());
        Whale whale = new Whale("고래", "바다");
        System.out.println(whale.living());
    }
}