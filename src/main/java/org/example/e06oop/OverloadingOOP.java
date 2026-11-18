package org.example.e06oop;

public class OverloadingOOP {
    public static int add(int a) {
        return a + 1;
    }

    public static int add(int a, int b) { // 이렇게 위에 부분이랑 시그니처(매개변수 부분)만 다르면
        // 오버로딩이 가능하다. 메소드명은 같아도 말이야.
        return a + b;

        // System.out.println(OverloadingOOP.add(1, 2));
        // System.out.println(OverloadingOOP.add(1));
        // 이런식으로 main 에서 호출해보면 둘다 된다.
        // 위에꺼는 오버로딩 한걸로, 밑에꺼는 원본으로 여겨지기 때문이다.
        // 즉 같은 이름의 메소드를 써도, 파라미터 갯수가 여러개 들어올 수도 있으니까,
        // 그럴때에 대응하기 위해서 오버로딩을 만든것 같다. 파라미터가 몇개가 들어와도 다 먹히게 하려고
    }
}
