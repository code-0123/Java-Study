package java1;
import java.awt.*;
import javax.swing.*;
/*
예제 13-1
1초 단위로 증가하는 스레드를 만들고
레이블을 이용하여 타이머 값을 출력하라
 */

class TimerThread2 extends Thread{
    private JLabel timerLabel; //타이머 값이 출력되는 레이블

    public TimerThread2(JLabel timerLabel){
        this.timerLabel = timerLabel; //타이머 카운트를 출력하라 레이블
    }

    //스레드 코드. run()이 종료하면 스레드 종료
    @Override
    public void run(){ //run()은 스레드 코드로서 start()메소드가 호출된 후 스레드가 실행을 시작하는 메소드
        int n = 0; //타이머 카운트 값
        while(true){ //무한 루프
            timerLabel.setText(Integer.toString(n)); //레이블에 카운트 값 출력
            n++; //카운트 증가
            try{
                Thread.sleep(1000); //1초동안 잠을 잔다
            }
            catch(InterruptedException e){
                return; //예외가 발생하면 스레드 종료
                /*
            try-catch 블록이 없으면 컴파일 오류가 발생한다
            sleep()에 의해 잠을 자는 경우 예외 발생에 대비하기 위해서이다
                */
            }
        }
    }
}

public class ThreadTimerEx extends JFrame{
    public ThreadTimerEx(){
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //타이머 값을 출력할 레이블 생성
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerLabel); //레이블을 컨텐트팬에 부착

        //타이머 스레드 객체 생성. 타이머 값을 출력할 레이블을 생성자에게 전달
        TimerThread2 th = new TimerThread2(timerLabel); //스레드 객체를 만든다

        setSize(300,170);
        setVisible(true);

        th.start(); //타이머 스레드의 실행을 시작하게 한다. 이 호출의 결과 TimerThread2의 run()메소드가 실행을 시작한다
    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}
