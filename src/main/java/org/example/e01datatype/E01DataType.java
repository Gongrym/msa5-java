package org.example.e01datatype;

public class E01DataType {
    public void execute() {
        boolean bool = true;
        bool = false;
        // bool = 1; << 이런식으로 하면 안됨. 불리언으로 이미 선언해뒀는데,
        // 갑자기 1이라는 정수형을 넣으면 오류가 난다.
        // 강타입 언어인 자바는 자료형을 지키는게 매우 엄격함.
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %s", bool); // 잘 안씀
        // 저 %s에 bool을 넣는 기능

        /* 변수 선언 */
        int age; // 그냥 선언만 한것
        age = 1; // 값을 초기화 한것
        // age = 'a'; << 이렇게 해도 오류는 안남.
        // 그 이유는 문자 한 자는 아스키코드로 표현되는데, 아스키코드 자체가 숫자라 정수로 인식되어 저렇게도 됨
        char ch = 'a';
        String str = "a";

        /* 상수 선언 */
        final String USER_NAME = "길둥이"; // 변수 선언할때 앞에 final 만 붙여주면 됨.
        // 글고 상수명은 모두 대문자로, 또 필요시엔 언더바를 사용하는게 관례.
        // USER_NAME = "sad"; << 상수라서 이런식의 재할당은 불가능함

        // Underscore 표기법
        int num = 1_020_304_010; // 큰 숫자 이렇게들 씁니다. 뭐 별 중요한건 아니고

        // 두 변수의 값을 스와핑 해보자
        int swap1 = 1;
        int swap2 = 2;
        int w = swap1;
        swap1 = swap2;
        swap2 = w;

        // 데이터 타입
        boolean bool2 = true;
        byte bt = -128;
        short sh = 32767;
        int integer = 2147483647;
        long longer = 2147483648L; // long 뒤에는 L 적어주는게 좋다함. ?/ 왜?
        double db = 3.141592;
        float ft = 3.1415921F; // F를 안붙히면 기본 double형으로 인식함
        char ch1 = 'g'; // 딱 한글자인 문자
        // 이거 쌍따옴표로 a 감싸면 에러남. 쌍따옴표는 String 타입에 쓰는것이기 때문
    }
}