package org.example.e06oop;

public class ConstructOOP {
    private String name;
    private int age;

    // 생성자 메소드
    // 클래스를 인스턴스(객체)화 할때, 최초 1회만 실행되는 메소드
    // 주로 객체의 초기화 또는 인스턴스 생성 시,  실행되어야 할 작업을 위해 사용

    // 기본 생성자 (default constructor)
    // : 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성되는 생성자
    public ConstructOOP() {
    }

    // 생성자는 클래스명과 동일해야한다.

    // 커스텀 생성자 // 이거 위 기본 생성자를 오버로딩 한 형태!
    public ConstructOOP(String name) {
        // this 참조변수: 클래스 자기 자신을 가리킴
        this.name = name; // this.name 의 name은 클래스 안에 있는 저 private String name의 name이다.
        // 그리고 생성자 메소드든, 다른 일반 메소드든, 클래스 안에 어느 메소드 안이 아닌, 바깥 영역에 있는걸
        // '필드'라고 한다. 저 필드의 변수를 가리킬때 this를 사용한다.
    }

    public ConstructOOP(String name, int age) {
        this(name);
        this.age = age;
    }
}