package java1;
import java.util.*;

/*
예제 7-7
 */

class Student2{
    private int id;
    private String tel;
    public Student2(int id, String tel){
        this.id = id;
        this.tel = tel;
    }
    public int getId(){
        return id;
    }
    public String getTel(){
        return tel;
    }
}

public class HashMapStudentEx {
    public static void main(String[] args) {
        //(학생 이름, Student2객체)를 저장하는 해시맵 생성
        HashMap<String, Student2> map = new HashMap<>();
        map.put("황기태", new Student2(1,"010-111-1111"));
        map.put("이재문", new Student2(2,"010-222-2222"));
        map.put("김남윤", new Student2(3,"010-333-3333"));

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("검색할 이름?");
            String name = scanner.nextLine(); //사용자로부터 이름 입력
            if(name.equals("exit"))
                break;
            Student2 student2 = map.get(name); //이름에 해당하는 Student 객체 검색
            if(student2 == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id:" + student2.getId() + ", 전화:" + student2.getTel());
        }
        scanner.close();
    }
}