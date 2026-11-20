package org.example.e06oop.polymophism;

// 다형성
public class PolymorphismMain {
    public static void main(String[] args) {
        // Whale 과 Monkey는 Mammal을 상속받은 상태이다.

        Whale whale1 = new Whale();
        Mammal whale2 = new Whale();

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        // 이게 다형성이라고..? 그냥 상속의 당연한 원리잖아.
        // >/ 선생님한테 여쭤보니 맞다고 한다. 한 파트를 당당히 차지하고 있길래, 뭐 이걸 구현하는 다른
        // 방법이라거나 그런게 있는줄 알았는데, 그게 아니라 그냥 상속을 하면서 발생하는 성질에 대한 정의일뿐이었다.

        // 배열성 데이터를 다룰 때 이 다형성이 많이 발현된다.
        // 그 이유는?
        // 먼저 배열이란, 같은 '타입'의 값을 여러개 열거해서 담아둔 객체인데, 위 상황에서 monkey와
        // whale을 모두 담고싶어도 다른 클래스(타입)이라서 담을 수 가 없다.
        // 근데 Mammal이란 공통된 부모클래스의 상속을 받으면 타입이 같아지기 때문에 같은 배열 안에
        // 담을 수 있게된다.

        // 업캐스팅
        // * 캐스팅: 형변환
        // : 자식클래스가 부모클래스 타입으로 캐스팅 되는것.
        // 부모 클래스로 캐스팅 되면 자식클래스에 있는 멤버에는 접근 불가능
        Mammal upCasting1 = new Whale();
        // upCasting1.swimming(); << 이러면 오류생김. upCasting1은 swimming 메소드를 가지지 못한다.

        // 다운캐스팅
        // : 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅하는 것
        Whale downCasting1 = (Whale) upCasting1;
        downCasting1.swimming(); // 이러면 접근 가능하다.

        // =======
    }
}