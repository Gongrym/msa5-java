package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 배열 선언과 배열 길이 지정
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        // 배열의 복사
        int[] originArr = {1, 5, 9};
        int[] copyArr = originArr;
        copyArr[0] = 999;
        System.out.println(originArr[0]); // 이러면 999가 출력.
        // 왜냐 int[] copyArr = originArr; << 여기서 originArr의 주소가 copyArr와 같아졌기 때문.
        // 같은 주소를 전염시켜 약간 수정사항이 동기화(?)된것이다.

        // System.arraycopy() 이용해서 깊은 복사1
        int[] originArrSystem = {1, 2, 3};
        int[] copyArrSystem = new int[originArrSystem.length * 2];
        // System.arraycopy는 배열의 일부(또는 전체)를 다른 배열로 복사하는 함수야. 시그니처는 이래
        // System.arraycopy(원본배열, 원본시작위치, 대상배열, 대상시작위치, 복사할개수);
        System.arraycopy(
                originArrSystem,        // 어디서 가져올래? → 원본 배열
                0,                      // 원본의 몇 번 인덱스부터? → 0번부터
                copyArrSystem,          // 어디에 붙여넣을래? → 대상 배열
                0,                      // 대상의 몇 번 인덱스부터 채울래? → 0번부터
                originArrSystem.length  // 몇 개 복사할래? → 3개
        );
        // 내부 동작을 그려보면:
        // 원본:  [1, 2, 3]
        //        ↓  ↓  ↓   (원본 0번부터 3개를 → 대상 0번 자리부터 덮어씀)
        //대상:  [0, 0, 0, 0, 0, 0]  →  [1, 2, 3, 0, 0, 0]
        copyArrSystem[0] = 999;
        System.out.println(originArrSystem[0]);

        // Arrays.copyof() 이용해서 깊은 복사2
        int[] originArrArrays = {1, 2, 3};
        int[] copyArrArrays = new int[originArrArrays.length * 2];
        copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length);
        copyArrArrays[0] = 999;
        System.out.println(originArrArrays[0]);
        // !/ 위 1번 방법과 2번 방법의 차이를 설명하는걸 오늘 따로 해라
        // !/ 깊은복사의 의미가 뭔지 스스로 설명하는걸 해보기

        // 직접 구현해보자
        int[] originFor = {1, 2, 3};
        int[] copyFor = new int[originFor.length * 2];

//        for (int i = 0; i < originFor.length; i++) {
//            copyFor[i] = originFor[i];
//        } 아래 for문과 결과적으로 동일한 방식
        int idx = 0;
        for (int val : originFor) {
            copyFor[idx] = val;
            idx++;
        }

        // 다차원 배열
        int[][] multiArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(multiArr[1][1]);

        // 배열의 API
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};
        //배열의 길이
        System.out.println(arr3.length);
        // 배열이 같은지 비교
        System.out.println(Arrays.equals(arr3, arr4));

        // Arrays.deepEquals(arr1, arr2): 다차원 배열의 비교
        int[][] deepArr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] deepArr2 = {{1, 2, 3}, {4, 5, 7}};
        System.out.println(Arrays.deepEquals(deepArr1, deepArr2));

        // Arryas.sort(arr): 배열의 정렬
        int[] sortArr = {43, 6, 7, 8, 4, 32, 2};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
}