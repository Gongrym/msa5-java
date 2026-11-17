package org.example.e02operator;

public class E02Operator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        // 산술 연산자
        System.out.println(num1 + num2); // 7
        System.out.println(num1 - num2); // -3
        System.out.println(num1 / num2); // 0
        System.out.println(num1 * num2); // 10
        System.out.println(num1 % num2); // 2

        // 대입 연산자
        int nu3 = 6; // 여기서 = 이 걍 대입연산자임

        // 산술 대입 연산자
        int num3 = 1;
        num3 = num3 + 3; // num3 에는 4가 들어감
        num3 += 3; // 위와 동일한 동작
        num3 -= 3;
        num3 /= 3;
        num3 *= 3;
        num3 %= 3;

        // 증감 연산자
        int num5 = 0;
        System.out.println(num5++); // 후위 증감연산자
        System.out.println(++num5); // 전위 증감연산자

        // 비교 연산자
        // num1이 num2 보다
        System.out.println(num1 > num2); // 크냐
        System.out.println(num1 < num2); // 작냐
        System.out.println(num1 >= num2); // 크거나같냐
        System.out.println(num1 <= num2); // 작거나같냐
        System.out.println(num1 == num2); // 같냐
        System.out.println(num1 != num2); // 같지않냐

        // 문자열의 비교
        String str1 = "str1";
        String str2 = "str2";
        String str3 = new String("str1");
// System.out.println(str1 == str2); << 이건 추천하지 않는 방식
// ?/ 왜인지 알아봐야함
// >/
// ==는문자열의내용이아니라"같은객체(주소)냐"를비교하는연산자
// 내용이같은문자열이라도다른객체면false가나와서,내가원하는"글자가같냐"비교가안됨
// 리터럴끼리는같은내용이면같은객체를공유해서(String Pool)우연히true가나오기도해서더헷갈림
// 그래서내용비교는항상equals()를써야함
        System.out.println(str1.equals(str2)); // 이렇게 비교해야 한다노
// String 클래스로 만든 객체는 String의 내장 메서드인 equals() 사용가능
// 두개가 같은지 비교하는 메서드
// 이러면 false가 나옴 당연히.
        System.out.println(str1 == str3); // ?/ 이건 왜 false가 날까?
// >/
// str1은리터럴("str1")이라String Pool에있는객체를가리킴
// str3은new String()으로힙에새객체를따로만든것이라내용은같아도주소가다름
// ==는주소를비교하니까false
// 내용비교인str1.equals(str3)는true

        String str4 = str3;
        String str5 = str3;

        // 논리 연산자
        int num10 = 0;
        int num11 = 2;
        System.out.println(num10 > 0 && num11 <= 11);
        System.out.println(num10 > 0 || num11 <= 11);
        System.out.println(!(num10 > 0));

        // 삼항 연산자
        String result = num1 > num2 ? "num1 크다" : "num1이 작다";
        // ? 이전의 비교연산문에서 true면 ? 이후의 왼쪽, false면 오른쪽이
        // result에 값이 들어감
    }
}