package java1;/*
예제 2-10
시험점수가 80점 이상이라면 합격 판별을 하는 프로그램을 작성하라
 */

import java.util.Scanner;
public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하시오: ");
        int score = scanner.nextInt();
        if(score >= 80)
            System.out.println("축하합니다! 합격입니다.");

        scanner.close();
    }
}