package org.example.e08date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 현재 시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026, 11, 15, 11, 11);

        // ISO 표준 시계열 무자열 -> 날짜 객체
        LocalDateTime parsedDate1 = LocalDateTime.parse("2026-11-01T11:30:12");

        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체 (포멧터를 이용)
        String date = "2026-11-01 11:30:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime parsedDat2 = LocalDateTime.parse(date, dateTimeFormatter);

        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(firstDayOfMonth);
        System.out.println(lastDayOfMonth);

        // 두 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025, 9, 10);
        System.out.println(d1.isBefore(d2)); // false
        System.out.println(d1.isAfter(d2)); // true
        System.out.println(d1.isEqual(d2)); // false

        // period 객체: 두 날짜의 연/월/일을 단위로 분해해서 각각의 차를 구하는 객체
        Period p1 = Period.between(d1, d2);
        System.out.println(Math.abs(p1.getYears()));
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));
        System.out.println(p1);

        // ChronoUnit 객체
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(untilDays);

        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);
    }
}

// ?/ LocalDateTime now = LocalDateTime.now();
// ?????? 이 구조는 처음보는데 이게 말이됨? new 왜 안씀?
// >/ ㅋㅋㅋ 처음 보면 이상하지. new 없이 객체를 생성해서 반환받는 방식이야
// ?/
//
// - `LocalDateTime.now()` → `LocalDateTime` 클래스의 `now()` 메서드 호출
//
// 아니 그니까 메서드를 변수에 담는게 어딨냐고. 웃지말고 나 진지해.
//
// 코드는 다 인간이 만든거고 직관을 어느정도 따를수밖에 업자나 그래서.? 그런 측면에서 어떻게 저런 동작(코드적 설계)이 가능한지 좀 최대한 직관적으로 납득되게 설명해줘
//
// >/
//
// 네가 어디서 납득이 안 되는지 알겠어.
//
// 메서드는 '동작'인데, 어떻게 동작 자체를 변수에 저장한다는 거냐? 이거잖아.
//
// 결론부터 말하면, 메서드를 변수에 저장하는 게 아니야. 메서드를 실행한 뒤, 그 실행 결과를 변수에 저장하는 거야.
//
// ?/ 아 로컬데이트타임.now로 얻을 수 있는 데이트타임 값은 그냥 로컬데이트타임 타입으로만 받을 수 있으니까 저렇게 적는다고 생각하면 되네. 이거 100프로 맞지?
//
// >/
//
// 거의 100% 맞아! 다만 딱 한 부분만 수정하면 완벽해.
//
// `LocalDateTime.now()`는 `LocalDateTime` 타입의 객체를 반환하기 때문에 그 타입의 변수로 받을 수 있어.