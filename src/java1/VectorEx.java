package java1;
import java.util.Vector;

/*
예제 7-1
 */

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(); //정수 값만 다루는 벡터 생성
        v.add(5);
        v.add(4);
        v.add(-1);

        //벡터 중간삽입
        v.add(2,100);

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        //모든 요소 정수 출력하기
        for(int i=0; i<v.size(); i++){
            int n = v.get(i); //벡터의 i번째 정수
            System.out.println(n);
        }

        //벡터 속의 모든 정수 더하기
        int sum = 0;
        for(int i=0; i<v.size(); i++){
            int n = v.elementAt(i); //벡터의 i번째 정수
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
