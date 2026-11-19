package org.example.e06oop.interfaceedu;

// 추상클래스의 자식이 되는 extends 키워드 다음에 implements가 와야한다. 순서 중요함.
// Swim, Flight 저런식으로 콤마로 이어붙이면 됨. 여러 인터페이스.
class FlyingFish extends Fish implements Swim, Flight {
    FlyingFish() {
        super("날치", "바다");
    }

    @Override
    String residence() {
        return String.format("%s이/가 %s에 삽니다", this.name, this.residence);
    }

    @Override
    public String swimming() {
        return String.format("%s이/가 수영을 합니다.", this.name);
    }

    @Override
    public String flying() {
        return String.format("%s이/가 하늘을 납니다.", this.name);
    }
}