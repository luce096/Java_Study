package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "강영규";
        int hour = 15;

        System.out.println(name + "님 배송이 시작되었습니다. " + hour + "시에 방문예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "제이크셜리";

        System.out.println(name + "의 평균 점수는 " + score + "점입니다. ");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;

        System.out.println(d);
        System.out.println(f);


        // long 타입은 뒤에 l을 붙혀줘야 한다.(-21억 ~ 21억)
        long l = 1000000000000l;
        l = 1000_000_000_000l;

        System.out.println(l);

    }
}
