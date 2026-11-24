package org.example.e09generics;

public class BoxRestrict<T extends App & Goods> { // 이렇게 앱 굿즈 둘다 만족하도록 조건을 거는
    // &를 사용할 수 있다.
    public T media;
}
