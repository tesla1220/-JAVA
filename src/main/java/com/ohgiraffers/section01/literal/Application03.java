package com.ohgiraffers.section01.literal;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 합치기 결과를 예측하고 사용할 수 있다. */
        /* 목차. 1. 두 개의 문자열 합치기 */
        System.out.println("==============두 개의 문자열 합치기===============");
        System.out.println(9 + 9);  //
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        /* 목차. 2. 세 개의 문자열 합치기 */
        System.out.println("===============세 개의 문자열 합치기==================");
        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);   // 순서대로 계산된다.

        System.out.println("9" + (9 + 9));  // 918로 만들려면 소괄호로 묶어주면 된다. 문자열 9와 9+9를

        System.out.println("==================10과 20의 사칙연산 결과 보기 좋게 출력하기============");
        System.out.println("10과 20의 합 : " + (10 + 20)); // 괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다.
        System.out.println("10과 20의 합 : " + 10 + 20);

    }
}
