package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
        // for (초기값; 조건; 증감연산)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // 구구단 실습
        int i;
        int j;
        for (i = 2; i < 10; i++) {
            System.out.printf("** %d단 **", i);
            System.out.println();
            for (j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d", i, j, i * j);
                System.out.println();
            }

        }
    }
}