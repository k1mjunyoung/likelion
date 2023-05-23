package week3;

import java.util.HashMap;

public class session {
    public static void shouldBeRun(){
        System.out.println("OK thanks.");
    }

    public static void main(String[] args) {
        // 맵
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));

        System.out.println(map.getOrDefault("java", "자바"));
        System.out.println(map.containsKey("football"));

        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));

        map.put("human", "사람");
        System.out.println(map.size());

        System.out.println(map.keySet());

        // 예외처리
        int c;
        try{
            c = 4 / 0;
        } catch (ArithmeticException e){
            c = -1;
        } finally {
            shouldBeRun();
        }
    }
}