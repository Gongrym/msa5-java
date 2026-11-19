package org.example.e06oop.inheritance;

public class Whale extends Animal {

    public Whale(String name, String residence) {
        super(name, residence);
    }

    public String swimming() {
        return String.format("%s이/가 헤엄칩니다.", this.name);
    }

    @Override
    public String living() {
        return "여기 고래 살아요";
    }
}
