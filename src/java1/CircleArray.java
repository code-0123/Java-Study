package java1;
/*
예제 4-6
반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고,
배열에 있는 모든 Circle 객체의 면적을 출력하라
*/

public class CircleArray {
    public static void main(String[] args) {
        Circle[] c; //Circle 배열에 대한 레퍼런스 c 선언
        c = new Circle[5]; //5개의 레퍼런스 배열 생성

        for(int i=0; i<c.length; i++) //배열의 개수만큼
            c[i] = new Circle(i); //i번째 원소 객체 생성

        for(int i=0; i<c.length; i++) //배열의 모든 Circle객체의 면적 출력
            System.out.print((int)(c[i].getArea()) + " ");
    }
}