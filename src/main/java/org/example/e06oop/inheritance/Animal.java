package org.example.e06oop.inheritance;

public class Animal {
    protected String name;
    protected String residence;

    public Animal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public String breath() {
        return String.format("%s이/가 숨을 쉽니다.", this.name);
    }

    public String living() {
        return String.format("%s이/가 %s에서 삽니다.", this.name, this.residence);
    }

    // 이렇게 앞에 final 붙이면 상수로 만들어 버리는거라서 자식쪽에서 오버라이드를 해도 바꿀 수 없고,
    // 값을 바꿀 수도 없다.
    // final public String living() {
    //     return String.format("%s이/가 %s에서 삽니다.", this.name, this.residence);
    // }

}
