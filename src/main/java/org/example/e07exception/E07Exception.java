package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

// 예외
public class E07Exception {
    public static void main(String[] args) {
        try {
            System.out.println("트라이 시작");
            // throw new RuntimeException("아아아아 에러"); << 예외 강제 발생
            double result = 10 / 0; // 위 예외 강제 발생문을 주석처리 하지 않으면
            // double result = 10 / 0;에 오류가 뜨는데, 이유는 예외가 발생하면 실행흐름을 잠시 중단하는데,
            // 그렇게 되면 double result = 10 / 0;는 코드 내에서 절대 닿을 수 없는 문장이 되기 때문에
            // 그런건 오류로 판정함.
            System.out.println("트라이 끝");
        } catch (ArithmeticException e) { // ArithmeticException = 산술 연산 예외
            // 자바에서 수학적 계산을 수행할 수 없을 때 발생하는 예외야.
            // Exception으로도 예외 다 잡아낼 수 있는데, 왜 산술연산 예외 같은걸 쓰느냐?
            // 예외가 발생했을때, 그걸 잘 분류하려고 그렇다.
            // try {
            //     int a = 10 / 0;
            // } catch (Exception e) {
            //     System.out.println("오류 발생!");
            // }
            // 이런식으로
            System.out.println("캐치 시작");
            System.out.println(e.getMessage());
            System.out.println("캐치 끝");
        } catch (Exception e) { // Execotion 은 데이터타입임. String처럼 참조형인듯.
            System.out.println("캐치 시작");
            System.out.println(e.getMessage());
            System.out.println("캐치 끝");
        } finally { // 예외가 발생하든 안 하든 마지막에 실행되는 코드 블록이야.
            // 작업이 끝나면 반드시 정리해야 하는 자원을 해제하기 위해 사용해.
            // 참고로 finally가 절대적으로 항상 실행되는 건 아니야. JVM이 강제로 종료되는 등의 특수한 상황에서는 실행되지 않을 수 있어.
            System.out.println("파이널리");
        }
        // catch가 2중으로 동작하는데, if문이랑 비슷하다고 보면 된다.

        // Try with Resource
        // 이건 Try with Resource 아님
        FileWriter file = null;
        try {
            // 파일을 쓰기 모드로 불러오기
            file = new FileWriter("text.txt");
            file.write("안녕 자바");
        } catch (IOException e) { // IO익셉션: Input/Output 익셉션 (입출력에 관한 예외처리)
            e.printStackTrace(); // 예외가 발생한 위치와 원인을 콘솔에 출력하는 메서드
        } finally { // finally는 try문의 외부라 하네요
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // ?/ 이게 finally 안쪽의 file.close() 얘를 실행할때, 즉 파일을 닫을때도 예외가 발생할 수 있어서
        // try로 또 감싼다는데, 그럼 모든 동작을 수행할때 다 예외가 발생할 수 있지 글케따지면.
        // 근데 다 try로 감싸지 않잖아 finally 안에꺼. 왜저래?
        // >/

        // !/ 위아래 차이 아직 모름. 다시 공부

        // 이게 try-with-resources 임.
        try (FileWriter file1 = new FileWriter("text.txt")) {
            file1.write("안녕안녕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
