package com.ohgiraffers.section02.variable;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 변수의 명명 규칙에 대해 이해할 수 있다. */
        /* 필기.
        *   변수의 명명 규칙
        *   변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
        *   실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 하고,
        *   또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
         */


        /* 필기.
        *   변수의 명명 규칙
        *   1. 컴파일 에러를 발생시키는 규칙
        *       1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        *       1-2. 예약어는 사용이 불가능하다.
        *       1-3. 변수명은 대/소문자를 구분한다. (자바는 대/소문자를 엄격하게 구분하는 언어디ㅏ.)
        *       1-4. 변수명은 숫자로 시작할 수 없다. (시작만 할 수 없고, 숫자를 섞어서 사용하는 것은 가능.)
        *       1-4. 특수기호는 '_', '$'만 사용 가능하다.
        *   2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
        *       2-1. 변수명의 길이 제한은 없다. (하지만 적당히 해야겠죠?)
        *       2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다.
        *       2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. (타 언어 네이밍 규칙이다.)
        *       2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. (타 프로그램과 호환 안돼 한글이 깨질 수 있다.)
        *       2-5. 변수 안에 저장된 값
        *       2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
        *       2-7. 명사형으로 작성할 수 있도록 한다.
        *       2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다.
         */



        /* 목차. 1. 컴파일 에러를 발생시키는 규칙 */
        /* 목차. 1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다. */
        int age = 20;
//        int age = 20;

        /* 목차. 1-2. 예약어는 사용이 불가능하다. */
//        int true = 1;
//        int int = 1;

        /* 목차. 1-3. 변수명은 대소문자를 구분한다. */
        int Age = 20;

        /* 목차. 1-4. 변수명은 숫자로 시작할 수 없다. */
//        int 1age = 20;      //숫자로 시작하면 오류가 발생한다.
        int age1 = 20;

        /* 목차. 1-5. 특수기호는 '_' 와 '$'만 사용 가능하다. */
        int _age = 20;
        int $harp = 20;
//        int s@ada = 20;

        /* 목차. 2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙 */
        /* 목차. 2-1. 변수명의 길이 제한은 없다. 하지만 적당히 */
        int gahygankjganfdsjflgnragbkgblgllanwegtbagolg;

        /* 목차. 2-2. 변수형이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다. */
        /* 필기. 자바에서는 클래스명만 유일하게 대문자로 시작한다. */
        int maxAge = 20;
        int maxage = 20;
        int minAge = 10;

        /* 목차. 2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. */
        String user_name;
        String userName;

        /* 목차. 2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. */
        int 나이;

        /* 목차. 2-5. 변수 안에 저장된 값이 어떤 의미를 가지는 지 명확하게 표현하도록 한다. */
        String s;
        String name;        // 문자열 형태의 이름이 저장되겠구나~ 하는 의도가 파악이 된다.


        /* 목차. 2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다. */
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        /* 목차. 2-7. 명사형으로 작성할 수 있도록 한다. */
        String goHome;  // 가능하긴 하지만 가급 명사형으로 짓는다.

        /* 목차. 2-8. boolean 형은 의문문으로 가급적으로 긍정형태의 네이밍을 한다. */
        boolean isAlive = true;
        boolean isDead = false; // 부정형보다는 긍정형이 더 나은 방식이다.




    }
}
