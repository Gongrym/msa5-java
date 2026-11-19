package org.example.e06oop.abstractclass;

// 추상클래스
// class 앞에 abstract 키워드만 넣으면 됨
public abstract class Mammal {
    protected String name;
    protected String residence;

    public String breath() {
        return String.format("%s이/가 숨을 쉽니다.", this.name);
    }

    // 추상메소드: 상속 관계에서 자식 클래스에게 특정 기능을 반드시 구현하도록 강제하는 메소드
    public abstract String living();
}
