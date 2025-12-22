package day02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the episode number th check: ");
        int n = sc.nextInt();


        int count = 0;
        int num = 666;

        while (count < n) {
            if (String.valueOf(num).contains("666")) {
                count++;
                System.out.println("The number inclueded in the " + n + "th episode title = " + num);
                }
            num++;
        }
    }
}
