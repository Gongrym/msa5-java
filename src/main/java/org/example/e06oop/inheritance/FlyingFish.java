package org.example.e06oop.inheritance;

public class FlyingFish extends Animal { // < extends 부모클래스명 > 상속 문법

    public FlyingFish(String name, String residence) {
        super(name, residence); // 부모의 생성자 자식 생성자 안에 호출. 그 내부를 호출하는것인듯
    }

    public String flying() {
        return String.format("%s이/가 날아갑니다.", this.name);
    }

    // 오버라이딩
    // : 부모한테서 상속받은 메소드를 자식쪽에서 재정의해서 사용하는것
    // @가 붙은건 어노테이션. 어노테이션에 정의된 기능을 자동으로 쓸 수 있다 함.
    @Override // 약간 인터페이스 그런거랑 비슷한건가?
    public String living() {
        return "날치알밥 먹고싶다";
    }
    // 오버라이드를 어노테이션으로 적지 않아도 기능은 동일하게 수행된다 한다. 하지만 꼭 적으라고 하는데,
    // 그 이유는 가령 오버라이딩 어노테이션을 달지 않으면 위 코드를 오버라이딩 했다고 주석으로 설명해야하는 필요가
    // 생기는데, 어노테이션을 달아놓으면 그냥 @만 보고도 알 수 있다. 그래서 코드가 주석으로 난잡해지지 않는다.
}