package javaexp.z02_my;
import java.util.*;				//Scanner 사용 위한..
import javaexp.z02_my.vo.Hint;	//서로 다른 package에 있기 때문에 import를 선언해야 사용가능함.

public class game20 {

    public static void main(String[] args) {

        /*스무고개 게임
        Hint(포함 될 객체) : hint, hint생성, hint 반환
        Main()
            1) 20번의 기회 .. 소진시 게임종료
            2) 정답 정하기
            3) 20개의 질문 => 배열
            4) 반복문을 통하여 배열 하나씩 꺼내주기 틀릴시 계속 넘어가도록
        */

        System.out.println("# 스무고개 게임 # ");

        // 20번의 기회
        int chance = 20;

        // 정답
        String answer = "짱구";

        // 힌트
        Hint hint = new Hint("힌트:");

        // 20개의 힌트
        String[] hints = new String[20];
        hints[0] = "빨강";
        hints[1] = "늦잠을 많이 잡니다.";
        hints[2] = "흔하게 볼 수 있습니다.";
        hints[3] = "가장 친한친구가 4명 있습니다.";
        hints[4] = "노랑";
        hints[5] = "아빠의 직원은 회사원입니다.";
        hints[6] = "여동생이 있습니다";
        hints[7] = "연상의 누나를 좋아합니다.";
        hints[8] = "엄마는 주부입니다.";
        hints[9] = "남자 입니다.";
        hints[10] = "주택에 삽니다.";
        hints[11] = "보통 유치원에 다닙니다.";
        hints[12] = "두 글자 입니다.";
        hints[13] = "나이를 먹지 않습니다.";
        hints[14] = "강아지를 키웁니다.";
        hints[15] = "사고를 많이 칩니다";
        hints[16] = "현실에 존재하지 않습니다";
        hints[17] = "한쪽 얼굴이 튀어나와 있습니다";
        hints[18] = "출신은 일본 입니다";
        hints[19] = "만화 주인공 입니다";

        for (int idx = 0; idx < hints.length; idx++) {
            System.out.println(idx + 1 + "번째 힌트:" + hints[idx]);

         // 정답 입력 받기
            System.out.print("정답: ");
            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();

            // 정답 확인
            if (ans.equals(answer)) {
                System.out.println("축하합니다 정답입니다!");
                break;
            } else {
                System.out.println("땡!!! 틀렸습니다.");
                chance--;
            }
        }

        // 게임 종료
        if (chance <= 0) {
            System.out.println("스무고개 퀴즈 맞추기 실패ㅠㅠ");
        }
    }
}