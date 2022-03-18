package java1;
import java.util.*;

/*
예제 7-6
*/

public class HashMapScoreEx {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

        scoreMap.put("김성동",97);
        scoreMap.put("황기태",88);
        scoreMap.put("김남윤",98);
        scoreMap.put("이재문",70);
        scoreMap.put("한원선",99);

        System.out.println("HashMap의 요소 개수 :"  + scoreMap.size());

        //모든 사람의 점수 출력. scoreMap에 들어있는 모든 (key, value) 쌍 출력
        Set<String> keys = scoreMap.keySet(); //모든 key를 가진 Set컬렉션 리턴
        Iterator<String> it = keys.iterator(); //set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴

        while(it.hasNext()){
            String name = it.next(); //다음 키,학생 이름
            int score = scoreMap.get(name); //점수 알아내기
            System.out.println(name + " : " + score);
        }
    }
}