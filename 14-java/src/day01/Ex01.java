package day01;

public class Ex01 {
    static void main(String[] args) {
        /*
        // 변수의 선언
        int value;
        double factor;
        char grade;

        // 변수에 값을 대입
        int value = 100;
        double factor = 0.98;
        char grade = 'A';
        */

        // 변수의 선언과 초기화
        int value = 100;
        double factor = 0.98;
        char grade = 'A';

        //출력
        // value: 100, Factor: 0.98, Grade: A
        System.out.println("value: " + value + ",factor: " + factor + ",grade: " + grade);

        // System.out 객체의 printf 메서드로 출력
        System.out.printf("value: %d, factor: %f, Grade: %c\n", value, factor, grade);

        // 형식 태그에 정밀도를 지정해서 소수점 이하 둘째 자리까지 출력
        System.out.printf("value: %d, factor: %.2f, Grade: %c\n", value, factor, grade);
    }
}
