package day02;

import java.util.Scanner;

public class Ex01 {
    static void main() {
        // Scanner 클래스의 인스턴스를 생성
        Scanner input = new Scanner(System.in);

        // 프롬프트 메시지(prompt message) 출격
        System.out.println("Enter an integer: ");

        // Scanner 클래스의 nextint 메서드로 표준 입력에서 int 자료형 값을 읽어옴
        int num = input.nextInt();

        // 입력 스트림 닫기
        input.close();


        // 변수 number, 즉 표준 입력에서 읽어온 값을 출력
        System.out.println("num = " + num);

        //-----------------------------------------------
        // 프롬프트 메시지(prompt message) 출격
        System.out.println("Enter an integer: ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        input.close();

        System.out.printf("%d + %d = %d", n1, n2, n1 + n2);

    }
}

